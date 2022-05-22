package com.Esocial.entidades;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Funcao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ID;
	private String nome;
	private String CBO;

	public Funcao() {
	}

	public Funcao(Long iD, String nome, String cBO) {
		super();
		ID = iD;
		this.nome = nome;
		CBO = cBO;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCBO() {
		return CBO;
	}

	public void setCBO(String cBO) {
		CBO = cBO;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcao other = (Funcao) obj;
		return Objects.equals(ID, other.ID);
	}

}
