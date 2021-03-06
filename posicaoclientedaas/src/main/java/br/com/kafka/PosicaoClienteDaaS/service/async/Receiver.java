package br.com.kafka.PosicaoClienteDaaS.service.async;

import br.com.kafka.PosicaoClienteDaaS.domain.PosicaoClienteEntity;
import br.com.kafka.PosicaoClienteDaaS.service.PosicaoClienteService;
import br.com.kafka.dto.PosicaoCliente;
import lombok.extern.slf4j.Slf4j;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;


@Slf4j
public class Receiver {
	
	@Autowired
	PosicaoClienteService service;
	
	@Autowired
    DozerBeanMapper dozerBeanMapper;

    @KafkaListener(topics = "${kafka.topic.json}")
    public void receive(PosicaoCliente posicaoCliente) {
        log.info("received client='{}'", posicaoCliente.toString());
        //convert dto to entity
        PosicaoClienteEntity entity = this.dozerBeanMapper.map(posicaoCliente, PosicaoClienteEntity.class);
        service.savePosicaoCliente(entity);
 
   }

}
