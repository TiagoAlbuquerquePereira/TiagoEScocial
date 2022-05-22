package com.Esocial.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Esocial.entidades.Exame;
import com.Esocial.services.ExameService;

@RestController
@RequestMapping(value = "/exames")
public class ExameResource {

	@Autowired
	private ExameService service;

	@GetMapping
	public ResponseEntity<List<Exame>> findAll() {

		List<Exame> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Exame> findById(@PathVariable Long id) {
		Exame obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
