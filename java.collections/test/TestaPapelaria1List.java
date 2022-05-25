package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Papelaria;
import model.Produto;

public class TestaPapelaria1List {

	public static void main(String[] args) {

		Papelaria papelaria = new Papelaria("Majestade");

		papelaria.adiciona(new Produto("Agenda", 30.50, 1));
		papelaria.adiciona(new Produto("Lousa", 45.50, 1));
		papelaria.adiciona(new Produto("Caneta Bic", 2.0, 5));
		papelaria.adiciona(new Produto("Pasta", 5.50, 1));

		List<Produto> produtos = papelaria.getProdutos();
		List<Produto> produtosOrdenados = new ArrayList<Produto>(produtos);
		Collections.sort(produtosOrdenados);
		System.out.println(produtosOrdenados);
		System.out.println("Valor total dos produtos: " + papelaria.valorTotalProdutos());
	}
}
