package br.com.carrefoursolucoes.OfertasPerfilDaaS.repository;

import br.com.carrefoursolucoes.OfertasPerfilDaaS.domain.Store;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StoresRepository extends JpaRepository<Store, UUID> {
    Store findByAddressContaining(String address);
}
