package com.example.demo;

import org.springframework.web.client.RestTemplate;
@org.springframework.stereotype.Service
public class Service {
    public ResponseDTO consultaCep(String cep) {
        return new RestTemplate().getForEntity("https://viacep.com.br/ws/"+cep+"/json/", ResponseDTO.class).getBody();
    }
}
