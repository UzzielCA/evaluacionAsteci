package com.uzziel.incidencias.entitys;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "Cat_Status")
public class Status {

	@Column(name = "id")
	private int id;
	
	@Column(name = "status")
	private String status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
