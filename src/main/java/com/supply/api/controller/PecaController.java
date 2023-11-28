package com.supply.api.controller;

import com.supply.api.model.FornecedorModel;
import com.supply.api.model.PecaModel;
import com.supply.api.service.FornecedorService;
import com.supply.api.service.PecaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Value;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("pecas")
//ConfigurationProperties(prefix = "data")
//@PropertySource("classpath:/application.yml}")
public class PecaController {
    //@Value("${data.name}")
    private String name;
    @Autowired
    public PecaService pecaService;
    private List<PecaModel> pecaModel;
    @PostMapping("cadastrar")
    public ResponseEntity<PecaModel> registarPecas(@RequestBody @Valid PecaModel pecaModel) {
        //log.info("valor fornecedor=={}",pecaModel);



            pecaService.saveSupply(pecaModel);
          //  log.info("m=salvando cadastro fornecedor",pecaModel);

         //   log.info("m=erro ao cadastrar fornecedor",pecaModel);



        return ResponseEntity.status(HttpStatus.CREATED).body(pecaModel);
    }
    @GetMapping("listar")
    public List<PecaModel> ListaPecas() {

           pecaModel= pecaService.listarPeca();


        return pecaModel;
    }
    @GetMapping("teste")
    public String data() {
        System.out.println(name);
            return name;
    }
}
