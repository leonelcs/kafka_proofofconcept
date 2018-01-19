package br.com.carrefoursolucoes.GeoMarketingBaaS.service.async;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Component;

import br.com.carrefoursolucoes.dto.OfertaPerfilCliente;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class Receiver {
	
	@Autowired
    private SimpMessageSendingOperations messagingTemplate;
	
	
	

    @KafkaListener(topics = "${kafka.topic.ofertas}")
	public void receive(OfertaPerfilCliente ofertaPerfilCliente) {
	    log.info("received client='{}'", ofertaPerfilCliente.toString());
	    messagingTemplate.convertAndSend("/geomarket_topic/offer_notification",ofertaPerfilCliente);
    }

}
