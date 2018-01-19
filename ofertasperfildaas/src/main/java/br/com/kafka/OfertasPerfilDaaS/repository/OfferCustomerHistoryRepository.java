package br.com.kafka.OfertasPerfilDaaS.repository;

import br.com.kafka.OfertasPerfilDaaS.domain.OfferCustomerHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OfferCustomerHistoryRepository extends JpaRepository<OfferCustomerHistoryEntity, UUID> {

}
