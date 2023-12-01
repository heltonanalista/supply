package com.supply.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name = "estoque")
public class EstoqueModel {
    @Id
    private Long id;
    private Long fornecedorid;
    private Long pecaid;

    private Integer quantidade;
}
