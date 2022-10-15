package com.admin.conjuntos.model.service;

import java.util.Optional;

import com.admin.conjuntos.model.entity.Residente;

public interface ResidenteService {

	public Iterable<Residente>findAll();
	public Optional<Residente>findById(Integer id);
	public Residente save(Residente c);
	public void deleteById(Integer id);
}