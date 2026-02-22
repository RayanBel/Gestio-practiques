package org.ray.fempo.repository;

import org.ray.fempo.model.Empresa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
	 List<Empresa> findAll();
}
