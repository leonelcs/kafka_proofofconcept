package br.com.kafka.OfertasPerfilDaaS.repository;

import br.com.kafka.OfertasPerfilDaaS.domain.CustomerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface CustomerProfileRepository extends JpaRepository<CustomerProfile, UUID> {

    @Query(value = "SELECT * FROM customer_profile where id_customer= :id_customer", nativeQuery = true)
    List <CustomerProfile> findCustomerProfileByIdCustomer(@Param("id_customer")UUID id_customer);



}
