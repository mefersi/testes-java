package model;

public class Proprietario extends Pessoa {

	private String cnpj;

	public Proprietario() {
	}

	public Proprietario(String nome, String cpf, String email, int telefone, String cnpj) {
		super(nome, cpf, email, telefone);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
