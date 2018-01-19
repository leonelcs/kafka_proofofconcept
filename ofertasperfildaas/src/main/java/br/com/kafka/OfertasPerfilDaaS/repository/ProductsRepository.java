package br.com.kafka.OfertasPerfilDaaS.repository;

import br.com.kafka.OfertasPerfilDaaS.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface ProductsRepository extends JpaRepository<Product, UUID> {

    @Query(value = "SELECT * FROM product where id_store= :id_store and category= :category and offer_type is not null",nativeQuery =  true)
    List<Product> findProductsInOfferByStoreAndCategory(@Param("id_store") UUID id_store, @Param("category") String category);

}
