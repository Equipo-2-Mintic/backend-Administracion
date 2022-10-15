package com.admin.conjuntos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.admin.conjuntos.model.entity.Residente;

@Repository
public interface ResidenteRepository extends JpaRepository<Residente, Integer>{

}
