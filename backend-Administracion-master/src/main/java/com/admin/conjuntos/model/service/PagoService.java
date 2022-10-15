package com.admin.conjuntos.model.service;

import java.util.Optional;

import com.admin.conjuntos.model.entity.Pago;

public interface PagoService {
	
	public Iterable<Pago>findAll();
	public Optional<Pago>findByiD (Integer id);
	public Pago save (Pago c);
	public void deleteById (Integer id);
}
