package com.supply.api.service;


import com.supply.api.model.EstoqueModel;
import com.supply.api.model.PedidoModel;
import com.supply.api.model.SalvarPedido;
import com.supply.api.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {
    @Autowired
    private EstoqueService estoqueService;
    private SalvarPedido salvarPedido=new SalvarPedido();
    @Autowired
    private PedidoRepository pedidoRepository;
    public PedidoModel gerarPedido(PedidoModel pedidoModel) {

        EstoqueModel estoque = estoqueService.buscarId(pedidoModel.getId());
        if (estoque.getQuantidade() >= pedidoModel.getQuantidade()) {
            salvarPedido.setClienteid(pedidoModel.getClienteModel().getId());
            salvarPedido.setFornecedorid(pedidoModel.getFornecedorModel().getId());
            salvarPedido.setPecaid(pedidoModel.getPecaModel().getId());
            salvarPedido.setQuantidade(pedidoModel.getQuantidade());
            pedidoRepository.save(salvarPedido);

        }
return pedidoModel;
    }


}

