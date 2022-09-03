package com.idat.SUSPatriciaCanariEmpresa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;



@Embeddable
public class ClienteEmpresaFK implements Serializable{
	

	private static final long serialVersionUID = 4417214286334278898L;

	@Column(name="idEmpresa", nullable = false, unique = true)
	private Integer idEmpresa;
	
	@Column(name="idCliente", nullable = false, unique = true)
	private Integer idCliente;

	public Integer getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	
	
}