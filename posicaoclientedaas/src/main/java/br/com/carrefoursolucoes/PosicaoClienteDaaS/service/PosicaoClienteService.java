package br.com.carrefoursolucoes.PosicaoClienteDaaS.service;

import br.com.carrefoursolucoes.PosicaoClienteDaaS.domain.PosicaoClienteEntity;

public interface PosicaoClienteService {
	
	PosicaoClienteEntity savePosicaoCliente(PosicaoClienteEntity posicaoCliente);

}
