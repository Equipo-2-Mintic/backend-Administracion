package com.admin.conjuntos.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pago")
public class Pago {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pago")
	private Integer idPago;
	@Column(name = "valor")
	private Long valor;
	@Column(name = "fecha_pago")
	private Date fechaPago;
	@ManyToOne
	@JoinColumn(name = "residente")
	private Residente residente;
	@ManyToOne
	@JoinColumn(name = "administrador")
	private Administrador administrador;
	public Pago(Integer idPago, Long valor, Date fechaPago, Residente residente, Administrador administrador) {
		this.idPago = idPago;
		this.valor = valor;
		this.fechaPago = fechaPago;
		this.residente = residente;
		this.administrador = administrador;
	}
	public Pago() {
		super();
	}
	public Integer getIdPago() {
		return idPago;
	}
	public void setIdPago(Integer idPago) {
		this.idPago = idPago;
	}
	public Long getValor() {
		return valor;
	}
	public void setValor(Long valor) {
		this.valor = valor;
	}
	public Date getFechaPago() {
		return fechaPago;
	}
	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}
	public Residente getResidente() {
		return residente;
	}
	public void setResidente(Residente residente) {
		this.residente = residente;
	}
	public Administrador getAdministrador() {
		return administrador;
	}
	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}
	@Override
	public String toString() {
		return "Pago [idPago=" + idPago + ", valor=" + valor + ", fechaPago=" + fechaPago + ", residente=" + residente
				+ ", administrador=" + administrador + "]";
	}
	
	

		
}