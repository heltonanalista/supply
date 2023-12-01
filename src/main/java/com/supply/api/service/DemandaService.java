package com.supply.api.service;

import com.supply.api.model.DemandaModel;
import com.supply.api.model.EstoqueModel;
import com.supply.api.repository.DemandaRepository;
import com.supply.api.repository.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemandaService {
    @Autowired
    private EstoqueService estoqueService;
    @Autowired
    private DemandaRepository demandaRepository;
    public DemandaModel gerarDemanda(DemandaModel demandaModel) {

        EstoqueModel estoque = estoqueService.buscarId(demandaModel.getId());
        if (estoque.getQuantidade() >= demandaModel.getQuantidade()) {
            demandaRepository.save(demandaModel);

        }
return  demandaModel;
    }

    public List<DemandaModel> listarDemanda(){


        return demandaRepository.findAll();
    }
}

