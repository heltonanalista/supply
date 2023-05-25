package com.supply.api.service;

import com.supply.api.model.FornecedorModel;
import com.supply.api.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FornecedorService {
    @Autowired
    public FornecedorRepository fornecedorRepository;
    public void saveSupply(FornecedorModel fornecedorModel){

        fornecedorRepository.save(fornecedorModel);



    }

}
