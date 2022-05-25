package model;

import java.util.Objects;

public class Suculenta {

	private String nome;
	private int codigo;

	public Suculenta(String nome, int codigo) {
		super();
		this.nome = nome;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Suculenta other = (Suculenta) obj;
		return codigo == other.codigo && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Suculenta: " + this.nome + ", codigo: " + this.codigo;
	}
}
