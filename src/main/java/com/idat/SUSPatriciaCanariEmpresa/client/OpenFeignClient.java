package com.idat.SUSPatriciaCanariEmpresa.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.SUSPatriciaCanariEmpresa.dto.Cliente;





@FeignClient(name="SUS-PatriciaCanariEmpresa", url="localhost:8090")
public interface OpenFeignClient {

	@GetMapping("/api/cliente/v1/listar")
	public List<Cliente> listarEmpresa();
}
