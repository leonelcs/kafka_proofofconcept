package br.com.kafka.PosicaoClienteDaaS.service;

import br.com.kafka.PosicaoClienteDaaS.domain.PosicaoClienteEntity;

public interface PosicaoClienteService {
	
	PosicaoClienteEntity savePosicaoCliente(PosicaoClienteEntity posicaoCliente);

}
