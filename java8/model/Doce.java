package model;

public class Doce {

	private String nome;
	private double preco;

	public Doce(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public static int comparePorNome(Doce a, Doce b) {
		return a.getNome().compareTo(b.getNome());
	}

	public static int comparePorPreco(Doce a, Doce b) {
		return Double.compare(a.getPreco(), b.getPreco());
	}

	@Override
	public String toString() {
		return this.nome + ", R$" + this.preco;
	}
}
