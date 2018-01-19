package br.com.kafka.OfertasPerfilDaaS.service.async;

import br.com.kafka.dto.OfertaPerfilCliente;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class OffersProducer {
    @Autowired
    private KafkaTemplate<String, OfertaPerfilCliente> kafkaTemplate;

    @Value("${kafka.topic.ofertas}")
    private String ofertasTopic;

    public void send(OfertaPerfilCliente ofertasPerfilCliente){
    	log.info("Enviando a ofertas perfil cliente ='{}'", ofertasPerfilCliente.toString());
        kafkaTemplate.send(ofertasTopic, ofertasPerfilCliente);
    }
}
