package com.Esocial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Esocial.entidades.MedicoResponsavel;

@Repository
public interface MedicoResponsavelRepository extends JpaRepository<MedicoResponsavel, Long> {

}
