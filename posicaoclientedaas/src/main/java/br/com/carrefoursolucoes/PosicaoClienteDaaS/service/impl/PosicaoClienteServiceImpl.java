package br.com.carrefoursolucoes.PosicaoClienteDaaS.service.impl;

import br.com.carrefoursolucoes.PosicaoClienteDaaS.domain.PosicaoClienteEntity;
import br.com.carrefoursolucoes.PosicaoClienteDaaS.repository.PosicaoClienteRepository;
import br.com.carrefoursolucoes.PosicaoClienteDaaS.service.PosicaoClienteService;
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
