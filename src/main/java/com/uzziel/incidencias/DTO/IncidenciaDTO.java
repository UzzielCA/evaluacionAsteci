package com.uzziel.incidencias.DTO;

import java.util.Date;

import com.uzziel.incidencias.entitys.Equipo;
import com.uzziel.incidencias.entitys.Operador;
import com.uzziel.incidencias.entitys.Status;

public class IncidenciaDTO {
	
	private int id;
	
	private Date fechaCreacion;
	
	private Date fechaEdicion;
	
	private String decripcion;
	
	private Operador operador;
	
	private Status status;
	
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
