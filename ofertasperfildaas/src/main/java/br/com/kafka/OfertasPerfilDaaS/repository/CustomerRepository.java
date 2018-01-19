package br.com.kafka.OfertasPerfilDaaS.repository;

import br.com.kafka.OfertasPerfilDaaS.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {

}
