package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Papelaria;
import model.Produto;
import model.Servico;

public class TestaPapelaria3EqualsHashCode {

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
		
		System.out.println("----- Todos os serviços realizados: -----");
		papelaria.getServicos().forEach(s -> System.out.println(s));
		System.out.println("Valor dos servicos: " + String.format("%.2f", papelaria.valorTotalServicos()));
		System.out.println("------------------------------------------");
		System.out.println("VALOR TOTAL (PRODUTOS E SERVICOS): " + String.format("%.2f", papelaria.valorTotalProdutosServicos()));
		System.out.println("------------------------------------------");
		System.out.println("Testes equals e hashcode - servico:");
		System.out.println("O " + s1 + " foi utilizado? " + papelaria.servicoComprado(s1));
		Servico impressao = new Servico("Impressao", 2.0);
		System.out.println("E essa impressao foi comprada? " + papelaria.servicoComprado(impressao));
		System.out.println("O s1 é equals impressao? " + s1.equals(impressao));
		System.out.print("O hashcode de s1 é igual ao hashcode de impressao? ");
		System.out.println(s1.hashCode() == impressao.hashCode());
		System.out.println("------------------------------------------");
		System.out.println("Testes equals e hashcode - produto:");
		Produto produto = new Produto("Agenda", 30.50, 1);
		System.out.println("Esse produto agenda foi comprado? " + papelaria.produtoComprado(produto));
		
	}
}
