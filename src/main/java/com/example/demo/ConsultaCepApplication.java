package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class ConsultaCepApplication {
	private static Logger logger = LoggerFactory.getLogger(ConsultaCepApplication.class);
	public static void main(String[] args) {
		logger.info("Iniciando api de Consulta de CEP");
		SpringApplication.run(ConsultaCepApplication.class, args);
		logger.info("Api de consulta de CEP pronta para receber requisições");
	}

}
