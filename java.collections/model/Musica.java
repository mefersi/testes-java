package model;


public class Musica implements Comparable<Musica> {

	private String nome;
	private double tempo;
	private String interprete;

	public Musica(String nome, String interprete) {
		this.nome = nome;
		this.interprete = interprete;
	}

	public Musica(String nome, double tempo, String interprete) {
		this.nome = nome;
		this.tempo = tempo;
		this.interprete = interprete;
	}

	public String getNome() {
		return nome;
	}
	
	public double getTempo() {
		return tempo;
	}
	
	public String getInterprete() {
		return interprete;
	}
	
	@Override
	public String toString() {
		return "musica: " + this.nome + ", Interprete: " + this.interprete + ", duracao: " + this.tempo;
	}

	@Override
	public int compareTo(Musica outraMusica) {
		return this.nome.compareTo(outraMusica.nome);
	}
}
