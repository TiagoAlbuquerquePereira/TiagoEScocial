package com.Esocial.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Esocial.entidades.Empresa;

@RestController
@RequestMapping(value = "/empresas")
public class EmpresaResource {

	@GetMapping
	public ResponseEntity<Empresa> findAll() {

		Empresa a = new Empresa(1L, "emprol", "9999999999", "MEI", 1, "999999", "Consultoria", "Tiago",
				"99999999999", "999999999");
		return ResponseEntity.ok().body(a);

	}

}
