package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Artigo {

	private String nome;
	private Date dataDePublicacao;
	
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	
	public Artigo(String nome) {
		this.nome = nome;
	}
	
//	public Artigo(String nome, Date dataDePublicacao) {
//		this.nome = nome;
//		this.dataDePublicacao = dataDePublicacao = formato.format(dataDePublicacao);
//	}
	
	public String getNome() {
		return nome;
	}
	
	public Date getDataDeLancamento() {
		return dataDePublicacao;
	}
	
	public void setDataDePublicacao(Date dataDePublicacao) {
		this.dataDePublicacao = dataDePublicacao;
	}
	
	@Override
	public String toString() {
		return "Artigo: " + this.nome + ", publicação: " + formato.format(this.dataDePublicacao);
	}
}
