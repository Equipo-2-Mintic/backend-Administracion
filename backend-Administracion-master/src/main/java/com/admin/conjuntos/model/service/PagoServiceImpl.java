package com.admin.conjuntos.model.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.admin.conjuntos.model.entity.Pago;
import com.admin.conjuntos.repository.PagoRepository;

@Service
public class PagoServiceImpl implements PagoService {
	
	@Autowired
	public PagoRepository pagoRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Pago> findAll() {
		return pagoRepository.findAll();
	}
	@Override
	@Transactional(readOnly = true)
	public Optional<Pago> findByiD(Integer id) {
		return pagoRepository.findById(id);
	}
	@Override
	@Transactional
	public Pago save(Pago c) {
		return pagoRepository.save(c);
	}
	@Override
	@Transactional
	public void deleteById(Integer id) {
		pagoRepository.deleteById(id);
	}
}
