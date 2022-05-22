package com.Esocial.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Esocial.entidades.ResponsavelTecnico;
import com.Esocial.services.ResponsavelTecnicoService;

@RestController
@RequestMapping(value = "/responsaveis")
public class ResponsavelTecnicoResource {

	@Autowired
	private ResponsavelTecnicoService service;

	@GetMapping
	public ResponseEntity<List<ResponsavelTecnico>> findAll() {

		List<ResponsavelTecnico> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<ResponsavelTecnico> findById(@PathVariable Long id) {
		ResponsavelTecnico obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
