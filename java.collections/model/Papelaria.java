package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Papelaria {

	private String nome;
	private Endereco endereco;
	private Proprietario proprietario;
	private Vendedor vendedor;
	private List<Produto> produtos = new ArrayList<Produto>();
	private Set<Servico> servicos = new HashSet<>();

	public Papelaria(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public List<Produto> getProdutos() {
		return Collections.unmodifiableList(produtos);
	}

	public Set<Servico> getServicos() {
		return Collections.unmodifiableSet(servicos);
	}

	public void adiciona(Produto produto) {
		this.produtos.add(produto);
	}

	public void adiciona(Servico servico) {
		this.servicos.add(servico);
	}

	public double valorTotalProdutos() {
		double soma = 0;
		for (Produto produto : produtos) {
			soma += produto.getPreco() * produto.getQuantidade();
		}
		return soma;
	}

	public double valorTotalServicos() {
		double soma = 0;
		for (Servico servico : servicos) {
			soma += servico.getPreco();
		}
		return soma;
	}

	public double valorTotalProdutosServicos() {
		return valorTotalProdutos() + valorTotalServicos();
	}

	public boolean servicoComprado(Servico servico) {
		return this.servicos.contains(servico);
	}

	public boolean produtoComprado(Produto produto) {
		return this.produtos.contains(produto);
	}
}
