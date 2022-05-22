package com.Esocial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Esocial.entidades.Setor;

@Repository
public interface SetorRepository extends JpaRepository<Setor, Long> {

}
