package com.Esocial.entidades;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ResponsavelTecnico {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String CPF;
	private String registro_conselho;

	public ResponsavelTecnico() {
	}

	public ResponsavelTecnico(Long id, String nome, String cPF, String registro_conselho) {
		super();
		this.id = id;
		this.nome = nome;
		CPF = cPF;
		this.registro_conselho = registro_conselho;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getRegistro_conselho() {
		return registro_conselho;
	}

	public void setRegistro_conselho(String registro_conselho) {
		this.registro_conselho = registro_conselho;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResponsavelTecnico other = (ResponsavelTecnico) obj;
		return Objects.equals(id, other.id);
	}

}
