package com.admin.conjuntos.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "residente")
public class Residente {
	@Id
	@Column(name = "id_residente")
	private Integer idResidente;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "telefono")
	private long telefono;
	@Column(name = "correo")
	private String correo;
	@Column(name = "casa")
	private Integer casa;
	public Residente(Integer idResidente, String nombre, long telefono, String correo, Integer casa) {
		this.idResidente = idResidente;
		this.nombre = nombre;
		this.telefono = telefono;
		this.correo = correo;
		this.casa = casa;
	}
	public Residente() {
		super();
	}
	public Integer getIdResidente() {
		return idResidente;
	}
	public void setIdResidente(Integer idResidente) {
		this.idResidente = idResidente;
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
	public Integer getCasa() {
		return casa;
	}
	public void setCasa(Integer casa) {
		this.casa = casa;
	}
	@Override
	public String toString() {
		return "Residente [idResidente=" + idResidente + ", nombre=" + nombre + ", telefono=" + telefono + ", correo="
				+ correo + ", casa=" + casa + "]";
	}
	
}
