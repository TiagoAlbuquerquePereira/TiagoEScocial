package com.Esocial.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Esocial.entidades.Funcao;
import com.Esocial.repositories.FuncaoRepository;

@Service
public class FuncaoService {

	private FuncaoRepository repository;

	public List<Funcao> findAll() {
		return repository.findAll();
	}

	public Funcao findById (Long id) {
		Optional<Funcao> obj = repository.findById(id);
		return obj.get();
	}
}
