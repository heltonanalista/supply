package com.supply.api.repository;

import com.supply.api.model.PecaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PecaRepository extends JpaRepository<PecaModel,Long> {
}
