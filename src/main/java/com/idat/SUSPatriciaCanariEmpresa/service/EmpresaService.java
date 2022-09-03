package com.idat.SUSPatriciaCanariEmpresa.service;

import com.idat.SUSPatriciaCanariEmpresa.entity.Empresa;

public interface EmpresaService {
	
	Empresa obtenerId(Integer id);
	
	void guardar(Empresa empresa);

	
	void asignarEmpresa();
}
