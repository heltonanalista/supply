package com.supply.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteModel {

    Long id;
    private String nome;
    private String cpf;
    private String email;
    private String fone;
    private String endereco;
    private String cidade;
    private String cep;
    private String estado;

}


