package br.com.carrefoursolucoes.OfertasPerfilDaaS.service;

import br.com.carrefoursolucoes.dto.PosicaoCliente;

public interface OffersCustomerService {
    void findOffersCustomerByGeolocation(PosicaoCliente posicaoCliente);
}
