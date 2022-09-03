package com.idat.SUSPatriciaCanariEmpresa.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.SUSPatriciaCanariEmpresa.client.OpenFeignClient;
import com.idat.SUSPatriciaCanariEmpresa.entity.Empresa;
import com.idat.SUSPatriciaCanariEmpresa.repository.DetalleEmpresaRepository;
import com.idat.SUSPatriciaCanariEmpresa.repository.EmpresaRepository;

public class EmpresaServiceImpl implements EmpresaService {

	
	@Autowired
	private EmpresaRepository repository;
	
	@Autowired
	private DetalleEmpresaRepository repositoryDetalle;
	
	@Autowired
	private OpenFeignClient feign;
	
	@Override
	public Empresa obtenerId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(Empresa empresa) {
		// TODO Auto-generated method stub

	}

	@Override
	public void asignarEmpresa() {
		// TODO Auto-generated method stub

	}

}
