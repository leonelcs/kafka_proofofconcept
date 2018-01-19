package br.com.carrefoursolucoes.OfertasPerfilDaaS.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.GsonBuilder;

import br.com.carrefoursolucoes.OfertasPerfilDaaS.domain.Store;
import br.com.carrefoursolucoes.OfertasPerfilDaaS.repository.StoresRepository;
import br.com.carrefoursolucoes.OfertasPerfilDaaS.service.LojasProximasService;
import br.com.carrefoursolucoes.dto.LojasFisicas;
import br.com.carrefoursolucoes.dto.PosicaoCliente;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class LojasProximasServiceImpl implements LojasProximasService {

    private final StoresRepository storesRepository;
    @Autowired
    private RestTemplate restTemplate;

    @Value("${nearby.max.radius}")
    private Integer parametrizedRadius;

    private String baseUrl = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=%s,%s&radius=%s&type=supermarket&keyword=carrefour&key=AIzaSyCrZiSAEC3ghCMTrW653u0fSpxVvdBv_pY";
    public LojasProximasServiceImpl(StoresRepository storesRepository) {
        this.storesRepository = storesRepository;
    }

    @Override
    public List<Store> buscaLojasProximas(PosicaoCliente latlng) {

        List<Store> storesResult = new ArrayList<>();

        String url = String.format(baseUrl,
                latlng.getLat(), latlng.getLng(),
                parametrizedRadius.toString());

        LojasFisicas nearbyPlaces = new GsonBuilder().create().fromJson(restTemplate.getForObject(url, String.class), LojasFisicas.class);

        if (nearbyPlaces.getResults().isEmpty()) {
            log.info("ZERO_RESULTS");
            return storesResult;
        } else {
        	nearbyPlaces.getResults().stream().forEach(r -> System.out.println(r.getVicinity() + " - " + r.getName()));
            return nearbyPlaces.getResults().stream().filter(p -> p.getName().toLowerCase().contains("carrefour")).
                    collect(Collectors.mapping(p -> storesRepository.findByAddressContaining(p.getVicinity()), Collectors.toList()));

        }


    }


}
