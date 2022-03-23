package com.uzziel.incidencias.entitys;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "Equipo")
public class Equipo {

	@Column(name = "id")
	private int id;
	
	@Column(name = "nombre_equipo")
	private String nombre;
	
	@Column(name = "descripcion_equipo")
	private String descripcion;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
