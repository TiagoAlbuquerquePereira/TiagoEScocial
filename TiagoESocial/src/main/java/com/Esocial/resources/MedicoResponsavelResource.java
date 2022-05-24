package com.Esocial.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Esocial.entidades.MedicoResponsavel;
import com.Esocial.services.MedicoResponsavelService;

@RestController
@RequestMapping(value = "/medicos")
public class MedicoResponsavelResource {

	@Autowired
	private MedicoResponsavelService service;

	@GetMapping
	public ResponseEntity<List<MedicoResponsavel>> findAll() {

		List<MedicoResponsavel> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<MedicoResponsavel> findById(@PathVariable Long id) {
		MedicoResponsavel obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
