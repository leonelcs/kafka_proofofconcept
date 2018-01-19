package br.com.kafka.PosicaoClienteDaaS.repository;

import br.com.kafka.PosicaoClienteDaaS.domain.PosicaoClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PosicaoClienteRepository extends JpaRepository<PosicaoClienteEntity, Long> {

}
