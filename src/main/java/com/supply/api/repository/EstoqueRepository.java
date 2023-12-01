package com.supply.api.repository;

import com.supply.api.model.EstoqueModel;
import com.supply.api.model.FornecedorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstoqueRepository extends JpaRepository<EstoqueModel,Long> {


}
