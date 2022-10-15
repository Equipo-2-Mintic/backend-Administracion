package com.admin.conjuntos.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "administrador")
public class Administrador {
	@Id
	@Column(name = "id_administrador")
	private Integer idAdministrador;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "telefono")
	private long telefono;
	@Column(name = "correo")
	private String correo;
	public Administrador(Integer idAdministrador, String nombre, long telefono, String correo) {
		this.idAdministrador = idAdministrador;
		this.nombre = nombre;
		this.telefono = telefono;
		this.correo = correo;
	}
	public Administrador() {
		super();
	}
	public Integer getIdAdministrador() {
		return idAdministrador;
	}
	public void setIdAdministrador(Integer idAdministrador) {
		this.idAdministrador = idAdministrador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getTelefono() {
		return telefono;
	}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	@Override
	public String toString() {
		return "Administrador [idAdministrador=" + idAdministrador + ", nombre=" + nombre + ", telefono=" + telefono
				+ ", correo=" + correo + "]";
	}
}
