package com.idat.SUSPatriciaCanariEmpresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.SUSPatriciaCanariEmpresa.entity.Empresa;



public interface EmpresaRepository extends JpaRepository<Empresa, Integer>{

}