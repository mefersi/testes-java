package model;

public class Pessoa {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
		return nome;
	}
}
