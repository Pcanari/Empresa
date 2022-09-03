package com.idat.SUSPatriciaCanariEmpresa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="detalle_empresa_cliente")
public class EmpresaDetalle {
	
	@Id
	private ClienteEmpresaFK fk =new ClienteEmpresaFK();

	public ClienteEmpresaFK getFk() {
		return fk;
	}

	public void setFk(ClienteEmpresaFK fk) {
		this.fk = fk;
	}
	

}