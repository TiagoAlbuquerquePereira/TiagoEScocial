package com.Esocial.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Esocial.entidades.Funcao;
import com.Esocial.services.FuncaoService;

@RestController
@RequestMapping(value = "/funcoes")
public class FuncaoResource {

	@Autowired
	private FuncaoService service;

	@GetMapping
	public ResponseEntity<List<Funcao>> findAll() {

		List<Funcao> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Funcao> findById(@PathVariable Long id) {
		Funcao obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
