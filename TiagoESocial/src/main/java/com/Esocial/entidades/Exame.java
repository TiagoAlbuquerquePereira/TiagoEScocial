package com.Esocial.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Exame implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;

	@JsonIgnore
	@OneToOne
	private ResponsavelTecnico medico;
	private Date data;
	private String aptidao;

	public Exame() {
	}

	public Exame(Long id, String nome, ResponsavelTecnico medico, Date data, String aptidao) {
		super();
		this.id = id;
		this.nome = nome;
		this.medico = medico;
		this.data = data;
		this.aptidao = aptidao;
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

	public ResponsavelTecnico getMedico() {
		return medico;
	}

	public void setMedico(ResponsavelTecnico medico) {
		this.medico = medico;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getAptidao() {
		return aptidao;
	}

	public void setAptidao(String aptidao) {
		this.aptidao = aptidao;
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
		Exame other = (Exame) obj;
		return Objects.equals(id, other.id);
	}

}
