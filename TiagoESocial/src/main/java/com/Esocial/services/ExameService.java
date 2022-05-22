package com.Esocial.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Esocial.entidades.Exame;
import com.Esocial.repositories.ExameRepository;

@Service
public class ExameService {

	private ExameRepository repository;

	public List<Exame> findAll() {
		return repository.findAll();
	}

	public Exame findById (Long id) {
		Optional<Exame> obj = repository.findById(id);
		return obj.get();
	}
}
