package com.Esocial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Esocial.entidades.ResponsavelLegal;

@Repository
public interface ResponsavelLegalRepository extends JpaRepository<ResponsavelLegal, Long> {

}
