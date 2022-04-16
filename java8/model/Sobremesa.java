package model;

public class Sobremesa {

	private String tipo;

	public Sobremesa(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void imprimeEmLetraMaiuscula() {
		System.out.println(this.tipo.toUpperCase());
	}
	
	@Override
	public String toString() {
		return this.tipo;
	}
}
