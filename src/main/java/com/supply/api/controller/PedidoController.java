package com.supply.api.controller;


import com.supply.api.model.PedidoModel;
import com.supply.api.service.PedidoFeing;
import com.supply.api.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("demanda")
public class PedidoController {



@Autowired
    public PedidoFeing pedidoFeing;

        @Autowired
        private PedidoService pedidoService;
        @PostMapping("cadastrar")
        public ResponseEntity<PedidoModel> cadastrarPedido(@RequestBody PedidoModel pedidoModel) {

            pedidoService.gerarPedido(pedidoModel);
pedidoFeing.transportadora(pedidoModel);
            return ResponseEntity.status(HttpStatus.CREATED).body(pedidoModel);
        }







}
