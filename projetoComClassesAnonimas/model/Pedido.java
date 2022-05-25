package model;

import java.util.List;

public interface Pedido {

	Integer getCodigo();

//	Double calcularValorTotal();
	void adicionarItem(ItemPedido itemPedido);

//	void removerItem(ItemPedido itemPedido);
//	void imprimirItens();
//	List<ItemPedido> ordenarItensPedidos();
	List<ItemPedido> getItensPedidos();
//	ItemPedido[] ordenarItensPedidos();
//	ItemPedido[] getItensPedidos();
}
