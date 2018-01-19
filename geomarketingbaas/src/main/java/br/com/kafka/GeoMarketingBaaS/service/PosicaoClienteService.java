package br.com.kafka.GeoMarketingBaaS.service;

import br.com.kafka.dto.PosicaoCliente;

public interface PosicaoClienteService {
	
	void sendClientePosicao(PosicaoCliente posicaoCliente);

}
