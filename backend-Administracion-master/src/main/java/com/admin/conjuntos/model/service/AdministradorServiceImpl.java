package com.admin.conjuntos.model.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.admin.conjuntos.model.entity.Administrador;
import com.admin.conjuntos.repository.AdministradorRepository;

@Service
public class AdministradorServiceImpl implements AdministradorService{
	
	@Autowired
	private AdministradorRepository administradorRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Administrador> findAll() {
		return administradorRepository.findAll();
	}
	@Override
	@Transactional(readOnly = true)
	public Optional<Administrador> findById(Integer id) {
		return administradorRepository.findById(id);
	}
	@Override
	@Transactional
	public Administrador save(Administrador c) {
		return administradorRepository.save(c);
	}
	@Override
	@Transactional
	public void deleteById(Integer id) {
		administradorRepository.deleteById(id);
	}
}
