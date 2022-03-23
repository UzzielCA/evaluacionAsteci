package com.uzziel.incidencias.entitys;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "Operador")
public class Operador {

	@Column(name = "id")
	private int id;
	
	@Column(name = "nombre")
	private String nombre;

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
	
}
