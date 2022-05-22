package com.Esocial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Esocial.entidades.Exame;

@Repository
public interface ExameRepository extends JpaRepository<Exame, Long> {

}
