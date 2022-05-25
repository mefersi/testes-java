package model;

import java.util.List;

public class PedidoImpl implements Pedido {

	private Integer codigo;
	private List<ItemPedido> itens;

	@Override
	public Integer getCodigo() {
		return codigo;
	}

	@Override
	public void adicionarItem(ItemPedido itemPedido) {
		itens.add(itemPedido);

	}

	@Override
	public List<ItemPedido> getItensPedidos() {
		return itens;
	}
}
