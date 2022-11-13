package com.example.demo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter

public class ResponseDTO {
    String logradouro;
    String complemento;
    String bairro;
    String uf;
}
