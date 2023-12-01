package com.supply.api.controller;

import com.supply.api.model.DemandaModel;
import com.supply.api.model.EstoqueModel;
import com.supply.api.service.DemandaService;
import com.supply.api.service.EstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("demanda")
public class DemandaController {





        @Autowired
        private DemandaService demandaService;
        @PostMapping("cadastrar")
        public ResponseEntity<DemandaModel> registrarDemanda(@RequestBody DemandaModel demandaModel) {

            demandaService.gerarDemanda(demandaModel);

            return ResponseEntity.status(HttpStatus.CREATED).body(demandaModel);
        }
        @GetMapping("listar")
        public List<DemandaModel> ListaEstoque() {

            return demandaService.listarDemanda();
        }






}
