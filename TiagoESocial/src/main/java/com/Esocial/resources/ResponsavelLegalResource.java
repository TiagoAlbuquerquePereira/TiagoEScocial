package com.Esocial.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Esocial.entidades.ResponsavelLegal;
import com.Esocial.services.ResponsavelLegalService;

@RestController
@RequestMapping(value = "/responsaveisl")
public class ResponsavelLegalResource {

	@Autowired
	private ResponsavelLegalService service;

	@GetMapping
	public ResponseEntity<List<ResponsavelLegal>> findAll() {

		List<ResponsavelLegal> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<ResponsavelLegal> findById(@PathVariable Long id) {
		ResponsavelLegal obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
