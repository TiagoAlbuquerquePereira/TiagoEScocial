package com.Esocial.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Esocial.entidades.Empresa;
import com.Esocial.repositories.EmpresaRepository;

@Service
public class EmpresaService {

	private EmpresaRepository repository;

	public List<Empresa> findAll() {
		return repository.findAll();
	}

	public Empresa findById (Long id) {
		Optional<Empresa> obj = repository.findById(id);
		return obj.get();
	}
}
