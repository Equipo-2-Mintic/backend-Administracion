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

import com.admin.conjuntos.model.entity.Residente;
import com.admin.conjuntos.model.service.ResidenteService;

@RestController
@RequestMapping("/resi")
public class ResidenteController {
		
	@Autowired
	private ResidenteService residenteservice;
	@PostMapping
	public Residente guardar (@RequestBody Residente residente) {
		return residenteservice.save(residente);
	}
	@GetMapping("/{id}")
	public Optional<Residente>buscarPorId(@PathVariable Integer id){
		return residenteservice.findById(id);
	}
	@GetMapping("/listar")
	public Iterable<Residente>listarTodos(){
		return residenteservice.findAll();
	}
	@DeleteMapping("{id}")
	public void eliminar (@PathVariable Integer id) {
		residenteservice.deleteById(id);
	}
	
}
