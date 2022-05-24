package com.Esocial.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Esocial.entidades.MedicoResponsavel;
import com.Esocial.repositories.MedicoResponsavelRepository;

@Service
public class MedicoResponsavelService {

	private MedicoResponsavelRepository repository;

	public List<MedicoResponsavel> findAll() {
		return repository.findAll();
	}

	public MedicoResponsavel findById (Long id) {
		Optional<MedicoResponsavel> obj = repository.findById(id);
		return obj.get();
	}
}
