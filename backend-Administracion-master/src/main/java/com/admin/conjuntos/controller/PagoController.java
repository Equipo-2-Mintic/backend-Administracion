package com.admin.conjuntos.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.admin.conjuntos.model.entity.Pago;
import com.admin.conjuntos.model.service.PagoService;

// Este es un comentario para hacer push al repositorio

@RestController
@RequestMapping("/pay")
public class PagoController {
	@Autowired
	private PagoService pagoservice;
	@PostMapping
	public Pago guardar (@RequestBody Pago pago) {
		return pagoservice.save(pago);
	}
	@GetMapping("/{id}")
	public Optional<Pago>buscarPorId(@PathVariable Integer id){
		return pagoservice.findByiD(id);
	}
	@GetMapping("/listar")
	public Iterable<Pago>listarTodos(){
		return pagoservice.findAll();
	}
	@DeleteMapping("/{id}")
	public void eliminar (@PathVariable Integer id) {
		pagoservice.deleteById(id);
	}
}
