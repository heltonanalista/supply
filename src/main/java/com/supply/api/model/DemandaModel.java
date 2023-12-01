package com.supply.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "demanda")
public class DemandaModel {

        @Id
        private Long id;

        private Long pecaid;

        private Integer quantidade;


    }


