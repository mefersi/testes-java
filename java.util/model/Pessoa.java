package model;

public class Pessoa {

	private String nome;
	private String cpf;
	private String email;
	private int telefone;

	public Pessoa() {
	}
	
	public Pessoa(String nome, String cpf, String email, int telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
	}

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

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	@Override
	public boolean equals(Object obj) {
		Pessoa p = (Pessoa) obj;
		if (this.nome != p.nome) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Nome: " + this.nome + ", cpf: " + this.cpf + ", email: " + this.email + ", telefone: " + this.telefone;
	}
}
