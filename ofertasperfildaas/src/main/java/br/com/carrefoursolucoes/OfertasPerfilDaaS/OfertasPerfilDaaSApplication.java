package br.com.carrefoursolucoes.OfertasPerfilDaaS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import br.com.carrefoursolucoes.OfertasPerfilDaaS.repository.StoresRepository;

@SpringBootApplication
public class OfertasPerfilDaaSApplication implements CommandLineRunner {
	
	@Autowired
	StoresRepository storesRepo;

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		// Do any additional configuration here
		return builder.build();
	}

	public static void main(String[] args) {
		SpringApplication.run(OfertasPerfilDaaSApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		

	}
}
