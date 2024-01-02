package com.supply.api.controller;


import com.supply.api.model.EstoqueModel;
import com.supply.api.model.PedidoModel;
import com.supply.api.service.EstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("estoque")
public class EstoqueController {
    @Autowired
private EstoqueService estoqueService;
    @PostMapping("cadastrar")
    public ResponseEntity<EstoqueModel> registrarEstoque(@RequestBody EstoqueModel estoqueModel) {

estoqueService.salvarEstoque(estoqueModel);

        return ResponseEntity.status(HttpStatus.CREATED).body(estoqueModel);
    }
    @GetMapping("listar")
    public List<EstoqueModel> ListaEstoque() {

        return estoqueService.listarEstoque();
    }

    @PostMapping("solicitar")
    public ResponseEntity<PedidoModel> solicitarPeca(@RequestBody PedidoModel pedidoModel) {
        //log.info("valor fornecedor=={}",pecaModel);







     return ResponseEntity.status(HttpStatus.CREATED).body(pedidoModel);
   }
}
