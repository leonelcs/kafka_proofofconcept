package br.com.carrefoursolucoes.GeoMarketingBaaS.service.impl;

import br.com.carrefoursolucoes.GeoMarketingBaaS.service.PosicaoClienteService;
import br.com.carrefoursolucoes.GeoMarketingBaaS.service.async.SenderPosicaoCliente;
import br.com.carrefoursolucoes.dto.PosicaoCliente;
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
