package br.com.kafka.OfertasPerfilDaaS.service;

import br.com.kafka.dto.PosicaoCliente;

public interface OffersCustomerService {
    void findOffersCustomerByGeolocation(PosicaoCliente posicaoCliente);
}
