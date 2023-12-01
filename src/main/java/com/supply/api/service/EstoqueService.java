package com.supply.api.service;

import com.supply.api.model.EstoqueModel;
import com.supply.api.model.FornecedorModel;
import com.supply.api.model.PecaModel;
import com.supply.api.repository.EstoqueRepository;
import com.supply.api.repository.PecaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EstoqueService {


    @Autowired
    public EstoqueRepository estoqueRepository;
    public void salvarEstoque(EstoqueModel estoqueModel){

        estoqueRepository.save(estoqueModel);
    }
    public List<EstoqueModel> listarEstoque(){


        return estoqueRepository.findAll();
    }
    public EstoqueModel buscarId(Long id){


         return estoqueRepository.findById(id).get();


    }

}
