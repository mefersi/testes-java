package test;

import java.util.HashMap;
import java.util.Map;

public class TesteIterarImprimirMap3 {

	public static void main(String[] args) {

		Map<Double, String> produtos = new HashMap<Double, String>();
		produtos.put(10.50, "Pasta de documentos");
		produtos.put(2.50, "Caneta");
		produtos.put(35.40, "Agenda 2022");
		produtos.put(15.00, "Sulfite");
		produtos.put(1.00, "Lapis");

		produtos.keySet().forEach(preco -> System.out.println(produtos.get(preco)));
	}
}
