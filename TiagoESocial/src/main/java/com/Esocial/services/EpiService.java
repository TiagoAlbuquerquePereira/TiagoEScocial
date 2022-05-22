package com.Esocial.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Esocial.entidades.Epi;
import com.Esocial.repositories.EpiRepository;

@Service
public class EpiService {

	private EpiRepository repository;

	public List<Epi> findAll() {
		return repository.findAll();
	}

	public Epi findById (Long id) {
		Optional<Epi> obj = repository.findById(id);
		return obj.get();
	}
}
