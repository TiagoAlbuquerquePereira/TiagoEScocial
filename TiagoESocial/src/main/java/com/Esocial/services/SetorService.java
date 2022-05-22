package com.Esocial.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Esocial.entidades.Setor;
import com.Esocial.repositories.SetorRepository;

@Service
public class SetorService {

	private SetorRepository repository;

	public List<Setor> findAll() {
		return repository.findAll();
	}

	public Setor findById (Long id) {
		Optional<Setor> obj = repository.findById(id);
		return obj.get();
	}
}
