package com.idat.SUSPatriciaCanariEmpresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.SUSPatriciaCanariEmpresa.entity.EmpresaDetalle;



@Repository
public interface DetalleEmpresaRepository extends JpaRepository<EmpresaDetalle, Integer> {

}
