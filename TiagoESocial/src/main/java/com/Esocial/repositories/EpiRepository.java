package com.Esocial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Esocial.entidades.Epi;

@Repository
public interface EpiRepository extends JpaRepository<Epi, Long> {

}
