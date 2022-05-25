package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Papelaria;
import model.Produto;
import model.Servico;

public class TestaPapelaria2ListESet {

	public static void main(String[] args) {

		Papelaria papelaria = new Papelaria("Majestade");

		papelaria.adiciona(new Produto("Agenda", 30.50, 1));
		papelaria.adiciona(new Produto("Lousa", 45.50, 1));
		papelaria.adiciona(new Produto("Caneta Bic", 2.0, 5));
		papelaria.adiciona(new Produto("Pasta", 5.50, 1));

		List<Produto> produtos = papelaria.getProdutos();
		List<Produto> produtosOrdenados = new ArrayList<Produto>(produtos);
		Collections.sort(produtosOrdenados);
		System.out.println("----- Todos os produtos comprados: -----");
		produtosOrdenados.forEach(p -> System.out.println(p));
		System.out.println("Valor dos produtos: " + String.format("%.2f", papelaria.valorTotalProdutos()));

		Servico s1 = new Servico("Impressao", 2.0);
		Servico s2 = new Servico("Encaderacao", 10.50);
		Servico s3 = new Servico("Copia de documento", 1.0);

		papelaria.adiciona(s1);
		papelaria.adiciona(s2);
		papelaria.adiciona(s3);

		System.out.println("----- Todos os servi�os realizados: -----");
		papelaria.getServicos().forEach(s -> System.out.println(s));
		System.out.println("Valor dos servicos: " + String.format("%.2f", papelaria.valorTotalServicos()));
		System.out.println("------------------------------------------");
		System.out.println(
				"VALOR TOTAL (PRODUTOS E SERVICOS): " + String.format("%.2f", papelaria.valorTotalProdutosServicos()));
	}
}
