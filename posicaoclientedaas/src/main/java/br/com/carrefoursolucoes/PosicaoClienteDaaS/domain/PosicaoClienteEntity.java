package br.com.carrefoursolucoes.PosicaoClienteDaaS.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
public class PosicaoClienteEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idHistorico;
	
	private UUID idCliente;
	
	private Float lat;
	
	private Float lng;

	private Timestamp timestamp;
	

}
