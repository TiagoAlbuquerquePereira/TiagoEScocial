package com.Esocial.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Esocial.entidades.Funcionario;
import com.Esocial.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {

	private FuncionarioRepository repository;

	public List<Funcionario> findAll() {
		return repository.findAll();
	}

	public Funcionario findById (Long id) {
		Optional<Funcionario> obj = repository.findById(id);
		return obj.get();
	}
}
