package br.com.carrefoursolucoes.OfertasPerfilDaaS.controller;

import br.com.carrefoursolucoes.OfertasPerfilDaaS.service.LojasProximasService;
import br.com.carrefoursolucoes.dto.PosicaoCliente;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
@Slf4j
public class LojasProximasController {
	
	@Autowired
	LojasProximasService service;
	
	@PostMapping("/check")
	public ResponseEntity<?> processaPosicao(@RequestBody PosicaoCliente posicaoCliente) {

		log.info("Id Cliente: " + posicaoCliente.getIdCliente());
		service.buscaLojasProximas(posicaoCliente);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}

}
