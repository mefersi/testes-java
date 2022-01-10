package test;

import model.Brinquedo;
import model.ItemPedido;
import model.Livro;
import model.Pedido;
import model.PedidoImpl;

public class TesteProjetoComClasseAnonima {

	public static void main(String[] args) {
		
		Pedido pedido = new PedidoImpl();
		
		Livro livro = new Livro();
		Brinquedo brinquedo = new Brinquedo();
		
		pedido.adicionarItem(livro);
		pedido.adicionarItem(brinquedo);
		
		ItemPedido caneta = new ItemPedido() {
			
			private Integer codigo;
			private Double valor;
			private String descricao;
			
			@Override
			public Integer getCodigo() {
				return codigo;
			}

			@Override
			public void setCodigo(Integer codigo) {
				this.codigo = codigo;
			}

			@Override
			public Double getValor() {
				return valor;
			}

			@Override
			public void setValor(Double valor) {
				this.valor = valor;	
			}

			@Override
			public String getDescricao() {
				return descricao;
			}

			@Override
			public void setDescricao(String descricao) {
				this.descricao = descricao;	
			}
		};
		
		pedido.adicionarItem(caneta);
		
		pedido.adicionarItem(new ItemPedido() {
			
			private Integer codigo;
			private Double valor;
			private String descricao;
			
			@Override
			public Integer getCodigo() {
				return codigo;
			}

			@Override
			public void setCodigo(Integer codigo) {
				this.codigo = codigo;
			}

			@Override
			public Double getValor() {
				return valor;
			}

			@Override
			public void setValor(Double valor) {
				this.valor = valor;	
			}

			@Override
			public String getDescricao() {
				return descricao;
			}

			@Override
			public void setDescricao(String descricao) {
				this.descricao = descricao;	
			}
		});
		
		System.out.println(pedido.getItensPedidos());
		
	}
}
