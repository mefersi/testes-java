package model;

import java.security.InvalidParameterException;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
	
	private String nome;
	private Double preco;
	private int quantidade;
	
	public Produto(String nome, Double preco, int quantidade) {
		if (nome == null) {
			throw new NullPointerException("O nome do produto nao deve ser nulo!");
		}
		if (preco == 0 || quantidade == 0) {
			throw new InvalidParameterException("Preco e quantidade devem ser diferentes de zero!");
		}
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Double getPreco() {
		return preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public double precoTotal() {
		return preco * quantidade;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		Produto outro = (Produto) obj;
//		return this.nome.equals(outro.nome) && this.preco.equals(outro.preco);
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
		Produto other = (Produto) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(preco, other.preco);
	}

	@Override
	public String toString() {
		return "Produto: " + this.nome + ", R$" + this.preco + ", quantidade: " + this.quantidade;
	}
	
	@Override
	public int compareTo(Produto o) {
		return this.nome.compareTo(o.nome);
	}
}
