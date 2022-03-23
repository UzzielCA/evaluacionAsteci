package com.uzziel.incidencias.entitys;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "Incidencias")
public class Incidencia {

	@Column(name = "id")
	private int id;
	
	@Column(name = "fechaCreacion")
	private Date fechaCreacion;
	
	@Column(name = "fechaEdicion")
	private Date fechaEdicion;
	
	@Column(name = "descripcion")
	private String decripcion;
	
	@ManyToOne(targetEntity = Operador.class, fetch = FetchType.LAZY)
	@Column(name = "id_oprador")
	private Operador operador;
	
	@ManyToOne(targetEntity = Status.class, fetch = FetchType.LAZY)
	@Column(name = "id_status")
	private Status status;
	
	@ManyToOne(targetEntity = Equipo.class, fetch = FetchType.LAZY)
	@Column(name = "id_equipo")
	private Equipo equipo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaEdicion() {
		return fechaEdicion;
	}

	public void setFechaEdicion(Date fechaEdicion) {
		this.fechaEdicion = fechaEdicion;
	}

	public String getDecripcion() {
		return decripcion;
	}

	public void setDecripcion(String decripcion) {
		this.decripcion = decripcion;
	}

	public Operador getOperador() {
		return operador;
	}

	public void setOperador(Operador operador) {
		this.operador = operador;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	
}
