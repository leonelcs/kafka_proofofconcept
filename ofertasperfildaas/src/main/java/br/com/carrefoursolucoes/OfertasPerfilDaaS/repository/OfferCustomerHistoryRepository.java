package br.com.carrefoursolucoes.OfertasPerfilDaaS.repository;

import br.com.carrefoursolucoes.OfertasPerfilDaaS.domain.OfferCustomerHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OfferCustomerHistoryRepository extends JpaRepository<OfferCustomerHistoryEntity, UUID> {

}
