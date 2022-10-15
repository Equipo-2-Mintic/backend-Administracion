package com.admin.conjuntos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.admin.conjuntos.model.entity.Pago;

@Repository
public interface PagoRepository extends JpaRepository<Pago, Integer>{

}
