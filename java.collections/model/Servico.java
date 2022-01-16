package model;

import java.security.InvalidParameterException;
import java.util.Objects;

public class Servico {

	private String nome;
	private double preco;
	
	public Servico(String nome, double preco) {
		if (nome == null) {
			throw new NullPointerException("O nome nao deve ser nulo!");
		}
		if (preco == 0) {
			throw new InvalidParameterException("O preco deve ser diferente de zero!");
		}
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		Servico outro = (Servico) obj;
//		return this.nome.equals(outro.nome);
//	}
//	
//	@Override
//	public int hashCode() {
//		return this.nome.hashCode();
//	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, preco);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Servico other = (Servico) obj;
		return Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(preco) == Double.doubleToLongBits(other.preco);
	}
	
	@Override
	public String toString() {
		return "Servico: " + this.nome + ", R$" + this.preco;
	}
}
