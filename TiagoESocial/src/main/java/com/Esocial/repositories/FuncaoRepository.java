package com.Esocial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Esocial.entidades.Funcao;

@Repository
public interface FuncaoRepository extends JpaRepository<Funcao, Long> {

}
