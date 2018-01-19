package br.com.carrefoursolucoes.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
public class PosicaoCliente {
	private UUID idCliente;
	private Float lat;
	private Float lng;
}
