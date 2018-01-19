package br.com.kafka.GeoMarketingBaaS.service.impl;

import br.com.kafka.GeoMarketingBaaS.service.PosicaoClienteService;
import br.com.kafka.GeoMarketingBaaS.service.async.SenderPosicaoCliente;
import br.com.kafka.dto.PosicaoCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PosicaoClienteServiceImpl implements PosicaoClienteService {
	
	@Autowired
	SenderPosicaoCliente sender;

	@Override
	public void sendClientePosicao(PosicaoCliente posicaoCliente) {

		sender.send(posicaoCliente);
	}

}
