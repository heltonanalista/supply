package com.supply.api.exceptions;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class GetError {

    private LocalDateTime data;
    private Integer status;
    private String codigo;
    private List<Errors> erros;
}
