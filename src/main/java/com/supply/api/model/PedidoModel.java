package com.supply.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PedidoModel {
       private Long id;
       private ClienteModel clienteModel;
       private FornecedorModel fornecedorModel;
       private PecaModel pecaModel;
       private Integer quantidade;


}


