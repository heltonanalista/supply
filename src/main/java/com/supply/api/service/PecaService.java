package com.supply.api.service;

import com.supply.api.model.FornecedorModel;
import com.supply.api.model.PecaModel;
import com.supply.api.model.PedidoModel;
import com.supply.api.repository.FornecedorRepository;
import com.supply.api.repository.PecaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PecaService {

    @Autowired
    public PecaRepository pecaRepository;
    public void saveSupply(PecaModel pecaModel){

        pecaRepository.save(pecaModel);
    }
    public List<PecaModel> listarPeca(){


        return pecaRepository.findAll();
    }

}
