package br.com.kafka.GeoMarketingBaaS.service.async;

import br.com.kafka.dto.PosicaoCliente;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SenderPosicaoCliente {

  @Value("${kafka.topic.posicaocliente}")
  private String posicaoClienteTopic;

  @Autowired
  private KafkaTemplate<String, PosicaoCliente> kafkaTemplate;

  public void send(PosicaoCliente posicaoCliente) {

      log.info("Enviando a posição de cliente='{}'", posicaoCliente.toString());
      kafkaTemplate.send(posicaoClienteTopic, posicaoCliente);
  }

}
