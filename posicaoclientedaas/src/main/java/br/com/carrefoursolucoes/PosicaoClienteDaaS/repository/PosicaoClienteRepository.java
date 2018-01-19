package br.com.carrefoursolucoes.PosicaoClienteDaaS.repository;

import br.com.carrefoursolucoes.PosicaoClienteDaaS.domain.PosicaoClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PosicaoClienteRepository extends JpaRepository<PosicaoClienteEntity, Long> {

}
