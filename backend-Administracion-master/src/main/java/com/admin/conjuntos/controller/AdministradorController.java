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

import com.admin.conjuntos.model.entity.Administrador;
import com.admin.conjuntos.model.service.AdministradorService;

@RestController
@RequestMapping("/admin")
public class AdministradorController {

	@Autowired
	private AdministradorService administradorservice;
	@PostMapping
	public Administrador guardar (@RequestBody Administrador administrador) {
		return administradorservice.save(administrador);
	}
	@GetMapping("/{id}")
	public Optional<Administrador>buscarPorId (@PathVariable Integer id){
		return administradorservice.findById(id);
	}
	@GetMapping("/listar")
	public Iterable<Administrador>listarTodos(){
		return administradorservice.findAll();				
	}
	@DeleteMapping("/{id}")
	public void eliminar (@PathVariable Integer id) {
		administradorservice.deleteById(id);
	}
}
