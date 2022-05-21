package com.Esocial.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Esocial.entidades.Empresa;
import com.Esocial.services.EmpresaService;

@RestController
@RequestMapping(value = "/empresas")
public class EmpresaResource {

	@Autowired
	private EmpresaService service;

	@GetMapping
	public ResponseEntity<List<Empresa>> findAll() {

		List<Empresa> list = service.findAll();
		return ResponseEntity.ok().body(list);

	}

}
