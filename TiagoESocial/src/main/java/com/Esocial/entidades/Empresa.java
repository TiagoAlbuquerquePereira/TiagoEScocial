package com.Esocial.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Empresa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ID;
	private String nome;
	private String CNPJ;
	private String tipo_empresa;
	private int grau_de_risco;
	private String CNAE;
	private String descricao;
	private String nome_responsavel;
	private String CPF_responsavel;
	private String telefone_responsavel;

	@OneToMany(mappedBy = "empresa")
	private List<Funcionario> list = new ArrayList<>();

	public Empresa(Long iD, String nome, String cNPJ, String tipo_empresa, int grau_de_risco, String cNAE,
			String descricao, String nome_responsavel, String cPF_responsavel, String telefone_responsavel) {
		super();
		ID = iD;
		this.nome = nome;
		CNPJ = cNPJ;
		this.tipo_empresa = tipo_empresa;
		this.grau_de_risco = grau_de_risco;
		CNAE = cNAE;
		this.descricao = descricao;
		this.nome_responsavel = nome_responsavel;
		CPF_responsavel = cPF_responsavel;
		this.telefone_responsavel = telefone_responsavel;
	}

	public Empresa(Long iD, String nome, String cNPJ, String tipo_empresa, int grau_de_risco, String cNAE,
			String descricao, String nome_responsavel, String cPF_responsavel, String telefone_responsavel,
			List<Funcionario> list) {
		super();
		ID = iD;
		this.nome = nome;
		CNPJ = cNPJ;
		this.tipo_empresa = tipo_empresa;
		this.grau_de_risco = grau_de_risco;
		CNAE = cNAE;
		this.descricao = descricao;
		this.nome_responsavel = nome_responsavel;
		CPF_responsavel = cPF_responsavel;
		this.telefone_responsavel = telefone_responsavel;
		this.list = list;
	}

	public List<Funcionario> getList() {
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

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getTipo_empresa() {
		return tipo_empresa;
	}

	public void setTipo_empresa(String tipo_empresa) {
		this.tipo_empresa = tipo_empresa;
	}

	public int getGrau_de_risco() {
		return grau_de_risco;
	}

	public void setGrau_de_risco(int grau_de_risco) {
		this.grau_de_risco = grau_de_risco;
	}

	public String getCNAE() {
		return CNAE;
	}

	public void setCNAE(String cNAE) {
		CNAE = cNAE;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNome_responsavel() {
		return nome_responsavel;
	}

	public void setNome_responsavel(String nome_responsavel) {
		this.nome_responsavel = nome_responsavel;
	}

	public String getCPF_responsavel() {
		return CPF_responsavel;
	}

	public void setCPF_responsavel(String cPF_responsavel) {
		CPF_responsavel = cPF_responsavel;
	}

	public String getTelefone_responsavel() {
		return telefone_responsavel;
	}

	public void setTelefone_responsavel(String telefone_responsavel) {
		this.telefone_responsavel = telefone_responsavel;
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
		Empresa other = (Empresa) obj;
		return Objects.equals(ID, other.ID);
	}

}
