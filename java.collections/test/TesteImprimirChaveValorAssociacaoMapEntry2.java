package test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TesteImprimirChaveValorAssociacaoMapEntry2 {

	public static void main(String[] args) {

		Map<String, Double> produtos = new HashMap<String, Double>();
		produtos.put("Agenda", 35.40);
		produtos.put("Pasta de documentos", 8.50);
		produtos.put("Caneta", 2.50);
		produtos.put("Lapis", 1.00);
		produtos.put("Borracha", 0.50);

		// para acessar as chaves e exibir o nome do produto
		Set<String> chaves = produtos.keySet();
		chaves.forEach(nomeProduto -> System.out.println(nomeProduto));

		// para acessar os valores e exibir o preco
		Collection<Double> valores = produtos.values();
		valores.forEach(preco -> System.out.println(preco));

		// para acessar a associacao e imprimir a chave e o valor
		Set<Entry<String, Double>> associacoes = produtos.entrySet();
		associacoes.forEach(associacao -> System.out.println(associacao.getKey() + " - " + associacao.getValue()));
	}
}
