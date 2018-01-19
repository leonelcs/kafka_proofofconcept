package br.com.kafka.OfertasPerfilDaaS.repository;

import br.com.kafka.OfertasPerfilDaaS.domain.Store;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StoresRepository extends JpaRepository<Store, UUID> {
    Store findByAddressContaining(String address);
}
