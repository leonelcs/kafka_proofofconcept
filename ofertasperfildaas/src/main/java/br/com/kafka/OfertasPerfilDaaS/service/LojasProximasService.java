package br.com.kafka.OfertasPerfilDaaS.service;

import br.com.kafka.OfertasPerfilDaaS.domain.Store;
import br.com.kafka.dto.PosicaoCliente;

import java.util.List;

public interface LojasProximasService {
	
	List<Store> buscaLojasProximas(PosicaoCliente latlng);

}
