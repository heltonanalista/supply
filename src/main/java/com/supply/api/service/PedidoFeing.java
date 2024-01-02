package com.supply.api.service;


import com.supply.api.model.PedidoModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("carrier")
public interface PedidoFeing {


        @PostMapping("/encomenda")
       void transportadora(PedidoModel pedidoModel);

}
