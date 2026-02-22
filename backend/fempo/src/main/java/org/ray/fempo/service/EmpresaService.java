package org.ray.fempo.service;

import org.ray.fempo.model.Empresa;
import org.ray.fempo.repository.EmpresaRepository;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {
	private final EmpresaRepository empresaRepository;
	public boolean crearEmpresa(String nom, int CIF, String sector, String adreca, int telefon, String email, String estat){
		Empresa empresa = new Empresa();
		empresa.setNom(nom);
		empresa.setCIF(CIF);
		empresa.setSector(sector);
		empresa.setAdreca(adreca);
		empresa.setTelefon(telefon);
		empresa.setEstat(estat);
		empresaRepository.save(empresa);
		return true;
	}
}
