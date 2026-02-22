package org.ray.fempo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.validation.Valid;

import java.util.List;

import org.ray.fempo.service.EmpresaService;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

	private final EmpresaService empresaService;

    	@GetMapping("crear")
    	public ResponseEntity<Boolean> crearEmpresa( @Valid @RequestParam String nom, @Valid @RequestParam int CIF, @Valid @RequestParam String sector, @Valid @RequestParam String adreca, @Valid @RequestParam int telefon, @Valid @RequestParam String email, @Valid @RequestParam String estat) {
		return ResponseEntity.ok(empresaService.crearEmpresa(					nom, CIF, sector, adreca, telefon, email, estat));	
	}

	@GetMapping("lista")
	public ResponseEntity<List<String>> listado(){
		List<String>
		return ResponseEntity.ok();
	}
}
