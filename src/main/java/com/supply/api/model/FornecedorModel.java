package com.supply.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "fornecedor")
public class FornecedorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private String fone;
    private String endereco;
    private String cidade;
    private String cep;
    private String estado;
    private String razao_social;
    private String cnpj;


}


