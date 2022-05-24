package com.Esocial.entidades;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_Funcao")
public class Funcao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ID;
	private String nome;
	private String CBO;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "Setor_id")
	private Setor setor;

	public Funcao() {
	}

	public Funcao(Long iD, String nome, String cBO) {
		super();
		ID = iD;
		this.nome = nome;
		CBO = cBO;
	}

	public Funcao(Long iD, String nome, String cBO, Setor setor) {
		super();
		ID = iD;
		this.nome = nome;
		CBO = cBO;
		this.setor = setor;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
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
