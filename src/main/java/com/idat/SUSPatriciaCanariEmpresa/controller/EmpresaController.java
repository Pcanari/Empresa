package com.idat.SUSPatriciaCanariEmpresa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.idat.SUSPatriciaCanariEmpresa.entity.Empresa;
import com.idat.SUSPatriciaCanariEmpresa.service.EmpresaService;



@RestController
@RequestMapping("/api/empresa/v1")
public class EmpresaController {

	@Autowired
	private EmpresaService service;

	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody Empresa empresa) {
		service.guardar(empresa);
	}
	
	@GetMapping("/asignar")
	public @ResponseBody void asignarEmpresaCliente() {
		service.asignarEmpresa();
	}
}
