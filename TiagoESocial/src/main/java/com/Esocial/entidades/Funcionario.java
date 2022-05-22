package com.Esocial.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Funcionario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ID;
	private String nome;
	private String CPF;
	private Date data_nascimento;
	private String CLT;

	@JsonIgnore
	@OneToOne
	@JoinColumn(name = "Funcao_id")
	private Funcao funcao;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "Empresa_id")
	private Empresa empresa;

	@JsonIgnore
	@OneToMany
	@JoinColumn(name = "Epi_id")
	private List<Epi> list = new ArrayList<>();

	public Funcionario() {
	}

	public Funcionario(Long iD, String nome, String cPF, Date data_nascimento, Empresa empresa, Funcao funcao,
			String cLT) {
		super();

		ID = iD;
		this.nome = nome;
		CPF = cPF;
		this.data_nascimento = data_nascimento;
		this.empresa = empresa;
		this.funcao = funcao;
		CLT = cLT;
	}

	public Funcionario(Long iD, String nome, String cPF, Date data_nascimento, String cLT, Funcao funcao,
			Empresa empresa, List<Epi> list) {
		super();
		ID = iD;
		this.nome = nome;
		CPF = cPF;
		this.data_nascimento = data_nascimento;
		CLT = cLT;
		this.funcao = funcao;
		this.empresa = empresa;
		this.list = list;
	}

	public List<Epi> getList() {
		return list;
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

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Funcao getFuncao() {
		return funcao;
	}

	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}

	public String getCLT() {
		return CLT;
	}

	public void setCLT(String cLT) {
		CLT = cLT;
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
		Funcionario other = (Funcionario) obj;
		return Objects.equals(ID, other.ID);
	}

}
