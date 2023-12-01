package com.supply.api.controller;

import com.supply.api.model.FornecedorModel;
import com.supply.api.model.PecaModel;
import com.supply.api.service.FornecedorService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("fornecedor")
public class FornecedorController {
    @Autowired
public FornecedorService fornecedorService;
    @PostMapping("cadastrar")
    public ResponseEntity<?> registarFronecedor(@RequestBody FornecedorModel fornecedorModel) {
       // log.info("valor fornecedor=={}",fornecedorModel);


        try {
            fornecedorService.saveSupply(fornecedorModel);
        //    log.info("m=salvando cadastro fornecedor",fornecedorModel);
        } catch (Exception e) {
        //    log.info("m=erro ao cadastrar fornecedor",fornecedorModel);

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("CAMPO NAO PODE SER VAZIO OU NULO");
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(fornecedorModel);
    }

    @GetMapping("listar")
    public List<FornecedorModel> ListaFornecedor() {




        return fornecedorService.listarFornecedor();



    }

}
