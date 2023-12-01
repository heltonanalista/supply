package com.supply.api.repository;

import com.supply.api.model.DemandaModel;
import com.supply.api.model.EstoqueModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemandaRepository extends JpaRepository<DemandaModel,Long> {
}
