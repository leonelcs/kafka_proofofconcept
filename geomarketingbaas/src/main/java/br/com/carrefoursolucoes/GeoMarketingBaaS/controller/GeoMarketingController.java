package br.com.carrefoursolucoes.GeoMarketingBaaS.controller;

import br.com.carrefoursolucoes.GeoMarketingBaaS.service.PosicaoClienteService;
import br.com.carrefoursolucoes.dto.PosicaoCliente;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/geo_marketing")
@CrossOrigin(origins="*")
@Slf4j
public class GeoMarketingController {
	
	@Autowired
	PosicaoClienteService service;
	
	@PostMapping("/posicao_cliente")
	public ResponseEntity<?> sendPosicaoCliente(@RequestBody PosicaoCliente posicaoCliente) {

		service.sendClientePosicao(posicaoCliente);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}

}
