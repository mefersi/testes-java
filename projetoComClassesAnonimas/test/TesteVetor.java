package test;

public class TesteVetor {

	String[] itens = new String[10];
	int posicao;

	public static void main(String[] args) {

		new TesteVetor().adicionar("Livro");
		new TesteVetor().listar();
	}

	public void adicionar(String nome) {
		this.itens[this.posicao] = nome;
		this.posicao++;
	}
//		for (int i = 0; i < this.itens.length; i++) {
//			if (this.itens[i] != null) {
//				this.posicao += 1;
//			}
//		}
//		this.itens[posicao] = nome;
//	}

//	this.itens[posicao] = nome;
//	posicao++;

	public void listar() {
		for (String s : itens) {
			System.out.println(s);
		}
	}
}
