package br.com.carrefoursolucoes.OfertasPerfilDaaS.service;

import br.com.carrefoursolucoes.OfertasPerfilDaaS.domain.Store;
import br.com.carrefoursolucoes.dto.PosicaoCliente;

import java.util.List;

public interface LojasProximasService {
	
	List<Store> buscaLojasProximas(PosicaoCliente latlng);

}
