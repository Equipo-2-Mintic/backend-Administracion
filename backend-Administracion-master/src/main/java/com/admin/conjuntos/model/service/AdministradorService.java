package com.admin.conjuntos.model.service;

import java.util.Optional;

import com.admin.conjuntos.model.entity.Administrador;

public interface AdministradorService {
	
	public Iterable<Administrador>findAll();
	public Optional<Administrador>findById(Integer id);
	public Administrador save(Administrador c);
	public void deleteById(Integer id);

}
