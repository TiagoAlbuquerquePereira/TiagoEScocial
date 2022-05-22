package com.Esocial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Esocial.entidades.ResponsavelTecnico;

@Repository
public interface ResponsavelTecnicoRepository extends JpaRepository<ResponsavelTecnico, Long> {

}
