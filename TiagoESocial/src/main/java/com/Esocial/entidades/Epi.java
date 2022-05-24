package com.Esocial.entidades;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_Epi")
public class Epi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private int CA;

	@OneToOne
	private ResponsavelTecnico responsavelTecnico;

	public Epi() {
	}

	public Epi(Long id, String nome, int cA) {
		super();
		this.id = id;
		this.nome = nome;
		CA = cA;
	}

	public ResponsavelTecnico getResponsavelTecnico() {
		return responsavelTecnico;
	}

	public void setResponsavelTecnico(ResponsavelTecnico responsavelTecnico) {
		this.responsavelTecnico = responsavelTecnico;
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

	public int getCA() {
		return CA;
	}

	public void setCA(int cA) {
		CA = cA;
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
		Epi other = (Epi) obj;
		return Objects.equals(id, other.id);
	}

}
