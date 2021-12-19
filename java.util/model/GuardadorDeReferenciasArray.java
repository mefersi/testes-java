package model;

public class GuardadorDeReferenciasArray {

	private Object[] referencias;
	private int posicaoLivre;
	
	public GuardadorDeReferenciasArray() {
		this.referencias = new Object[10];
		this.posicaoLivre = 0;
	}
	
	public void adiciona(Object ref) {
		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}
	
	public int getQtdElementos() {
		return this.posicaoLivre;
	}
	
	public Object getReferencia(int pos) {
		return this.referencias[pos];
	}
}
