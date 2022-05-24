package com.Esocial.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Esocial.entidades.ResponsavelLegal;
import com.Esocial.repositories.ResponsavelLegalRepository;

@Service
public class ResponsavelLegalService {

	private ResponsavelLegalRepository repository;

	public List<ResponsavelLegal> findAll() {
		return repository.findAll();
	}

	public ResponsavelLegal findById (Long id) {
		Optional<ResponsavelLegal> obj = repository.findById(id);
		return obj.get();
	}
}
