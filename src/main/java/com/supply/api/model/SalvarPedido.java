package com.supply.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SalvarPedido {
    @Id
    private Long id;
    private Long clienteid;
    private  Long fornecedorid;
    private  Long pecaid;

    private  Integer quantidade;

}
