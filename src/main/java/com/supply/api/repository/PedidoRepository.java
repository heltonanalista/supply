package com.supply.api.repository;


import com.supply.api.model.PedidoModel;
import com.supply.api.model.SalvarPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<SalvarPedido,Long> {
}
