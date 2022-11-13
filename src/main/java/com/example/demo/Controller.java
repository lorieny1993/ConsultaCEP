package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping
public class Controller {
    @Autowired
    private Service service;
    private static final Logger logger = LoggerFactory.getLogger(ConsultaCepApplication.class);

    @GetMapping("consulta_cep/{cep}")
    public ResponseEntity<ResponseDTO> consultaCep(@PathVariable("cep") String cep){
        cep = cep.replace("-","").trim();
        logger.info("Iniciando consulta cep");
        ResponseDTO dtoResponse = service.consultaCep(cep);
        logger.info("Consulta do CEP: "+cep+" finalizada com sucesso ");
        return new ResponseEntity<ResponseDTO>(dtoResponse, HttpStatus.OK);
    }
}
