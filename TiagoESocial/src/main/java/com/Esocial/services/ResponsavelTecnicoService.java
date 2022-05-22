package com.Esocial.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Esocial.entidades.ResponsavelTecnico;
import com.Esocial.repositories.ResponsavelTecnicoRepository;

@Service
public class ResponsavelTecnicoService {

	private ResponsavelTecnicoRepository repository;

	public List<ResponsavelTecnico> findAll() {
		return repository.findAll();
	}

	public ResponsavelTecnico findById (Long id) {
		Optional<ResponsavelTecnico> obj = repository.findById(id);
		return obj.get();
	}
}
