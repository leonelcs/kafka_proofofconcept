package br.com.kafka.OfertasPerfilDaaS.service.impl;

import br.com.kafka.OfertasPerfilDaaS.domain.CustomerProfile;
import br.com.kafka.OfertasPerfilDaaS.domain.OfferCustomerHistoryEntity;
import br.com.kafka.OfertasPerfilDaaS.domain.Product;
import br.com.kafka.OfertasPerfilDaaS.domain.Store;
import br.com.kafka.OfertasPerfilDaaS.repository.*;
import br.com.kafka.OfertasPerfilDaaS.service.LojasProximasService;
import br.com.kafka.OfertasPerfilDaaS.service.OffersCustomerService;
import br.com.kafka.OfertasPerfilDaaS.service.async.OffersProducer;
import br.com.kafka.dto.OfertaPerfilCliente;
import br.com.kafka.dto.PosicaoCliente;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Slf4j
@Service
public class OffersCustomerServiceImpl implements OffersCustomerService{
    public OffersCustomerServiceImpl(OfferCustomerHistoryRepository offerCustomerHistoryRepository,
                                     CustomerProfileRepository customerProfileRepository,
                                     ProductsRepository productsRepository) {
        this.offerCustomerHistoryRepository = offerCustomerHistoryRepository;
        this.customerProfileRepository = customerProfileRepository;
        this.productsRepository = productsRepository;
    }

    private final OfferCustomerHistoryRepository offerCustomerHistoryRepository;
    private final CustomerProfileRepository customerProfileRepository;
    private final ProductsRepository productsRepository;

    @Autowired
    private OffersProducer offersProducer;

    @Autowired
    private LojasProximasService lojasProximasService;

    @Override
    public void findOffersCustomerByGeolocation(PosicaoCliente posicaoCliente) {
        List <Store> storesProximas = lojasProximasService.buscaLojasProximas(posicaoCliente);
        List<OfertaPerfilCliente> offers = new ArrayList<>();

        storesProximas.forEach(store -> {
        	if (store!=null)
        		offers.addAll(getOffers(posicaoCliente.getIdCliente(),store.getUuid()));
        });

        offers.forEach( offer -> {
            OfferCustomerHistoryEntity entity = new OfferCustomerHistoryEntity();
            entity.setUuid(UUID.randomUUID());
            entity.setId_customer(offer.getIdCustomer());
            entity.setId_product(offer.getIdProducto());
            entity.setTimestamp(new Timestamp(System.currentTimeMillis()));
            //Guarda el historico
            offerCustomerHistoryRepository.save(entity);

            //Publica en kafka
            offersProducer.send(offer);
        });
    }

    /**
     * Mock para buscar ofertas
     * @param idCustomer
     * @param idTienda
     * @return
     */
    private List<OfertaPerfilCliente> getOffers(UUID idCustomer, UUID idTienda){
        List<OfertaPerfilCliente> offers = new ArrayList<>();
        //busca en el perfil de cliente la categoria preferida
        for (CustomerProfile profile : customerProfileRepository.findCustomerProfileByIdCustomer(idCustomer)){
            //busca los productos del tienda, categoria con alguna oferta
            List<Product> products = productsRepository.findProductsInOfferByStoreAndCategory(idTienda,profile.getPrefered_category());
            for (Product product:products){
                OfertaPerfilCliente ofertaPerfilCliente = new OfertaPerfilCliente();
                ofertaPerfilCliente.setIdCustomer(idCustomer);
                ofertaPerfilCliente.setIdProducto(product.getUuid());
                offers.add(ofertaPerfilCliente);
            }

        }
        return offers;

    }
}
