package br.com.kafka.OfertasPerfilDaaS.service.async;

import br.com.kafka.OfertasPerfilDaaS.service.OffersCustomerService;
import br.com.kafka.dto.PosicaoCliente;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Receiver {
	
	  @Autowired
	  private OffersCustomerService service;

	  @KafkaListener(topics = "${kafka.topic.posicaocliente}")
	  public void receive(PosicaoCliente posicaoCliente) {
	    log.info("received client='{}'", posicaoCliente.toString());
	    service.findOffersCustomerByGeolocation(posicaoCliente);
	  }

}
