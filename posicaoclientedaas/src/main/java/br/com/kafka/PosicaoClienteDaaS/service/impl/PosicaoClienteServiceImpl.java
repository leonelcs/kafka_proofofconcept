package br.com.kafka.PosicaoClienteDaaS.service.impl;

import br.com.kafka.PosicaoClienteDaaS.domain.PosicaoClienteEntity;
import br.com.kafka.PosicaoClienteDaaS.repository.PosicaoClienteRepository;
import br.com.kafka.PosicaoClienteDaaS.service.PosicaoClienteService;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class PosicaoClienteServiceImpl implements PosicaoClienteService {

	public PosicaoClienteServiceImpl(PosicaoClienteRepository posicaoClienteRepository) {
		this.posicaoClienteRepository = posicaoClienteRepository;
	}

	private final PosicaoClienteRepository posicaoClienteRepository;

	@Override
	public PosicaoClienteEntity savePosicaoCliente(PosicaoClienteEntity posicaoCliente) {
		posicaoCliente.setTimestamp(new Timestamp(System.currentTimeMillis()));
		PosicaoClienteEntity result = posicaoClienteRepository.save(posicaoCliente);
		return result;
	}
}
