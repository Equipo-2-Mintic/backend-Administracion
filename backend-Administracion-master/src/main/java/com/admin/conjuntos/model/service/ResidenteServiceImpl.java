package com.admin.conjuntos.model.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.admin.conjuntos.model.entity.Residente;
import com.admin.conjuntos.repository.ResidenteRepository;

@Service
public class ResidenteServiceImpl implements ResidenteService {
	
	@Autowired
	public ResidenteRepository residenteRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Residente> findAll() {
		return residenteRepository.findAll();
	}
	@Override
	@Transactional(readOnly = true)
	public Optional<Residente> findById(Integer id) {
		return residenteRepository.findById(id);
	}
	@Override
	@Transactional
	public Residente save(Residente c) {
		return residenteRepository.save(c);
	}
	@Override
	public void deleteById(Integer id) {
		residenteRepository.deleteById(id);
	}
}
