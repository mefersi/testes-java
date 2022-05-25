package model;

import java.io.Serializable;

public class Cliente implements Comparable<Cliente>, Serializable {
	private static final long serialVersionUID = 1L;

	private String nome;
	private String cpf;
	private String email;
	private Endereco endereco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public int compareTo(Cliente o) {
		return this.getNome().compareTo(o.getNome());
	}
}
