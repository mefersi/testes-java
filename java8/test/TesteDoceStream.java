package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import model.Doce;

public class TesteDoceStream {

	public static void main(String[] args) {
		
		List<Doce> doces = new ArrayList<>();
		doces.add(new Doce("Bolo de chocolate", 100.00));
		doces.add(new Doce("Balas", 8.00));
		doces.add(new Doce("Barra de chocolate", 6.00));
		doces.add(new Doce("Pudim", 25.00));
		doces.add(new Doce("Bolo de Ninho com morango", 100.00));
		doces.add(new Doce("Merengue", 75.00));
		
		//filtrando
//		doces.stream()
//			.filter(d -> d.getPreco() > 30.00)
//			.forEach(d -> System.out.println(d));
		
		//filtrando e transformando
//		doces.stream()
//			.filter(d -> d.getPreco() < 30.00)
//			.map(d -> d.getPreco() + 2.00)
//			.forEach(d -> System.out.println(d));
		
		// min e max
//		Optional<Doce> min = doces.stream()
//			.min(Doce::comparePorPreco);
//		System.out.println("O doce de menor valor é: " + min);
//		
//		Optional<Doce> max = doces.stream()
//			.max(Doce::comparePorPreco);
//		System.out.println("O doce de maior valor é: " + max);
		
		//count
//		long quantidade = doces.stream()
//			.count();
//		System.out.println("A quantidade de doces é: " + quantidade);
		
		//collectors groupingBy
//		Map<Boolean, List<Doce>> mapPrecos = doces.stream()
//			.collect(Collectors.groupingBy(d -> d.getPreco() < 30.00));
//		System.out.println(mapPrecos);
		
//		Map<Boolean, List<Doce>> mapPrecoMenorQue30LetraB = doces.stream()
//			.filter(d -> d.getNome().charAt(0) == 'B')
//			.collect(Collectors.groupingBy(d -> d.getPreco() < 30.00));
//		System.out.println(mapPrecoMenorQue30LetraB);
		
//		Map<Object, List<Doce>> mapPrecoMenorQue30LetraDiferenteDeB = doces.stream()
//			.filter(d -> d.getNome().charAt(0) != 'B')
//			.collect(Collectors.groupingBy(d -> d.getPreco() < 30.00));
//		System.out.println(mapPrecoMenorQue30LetraDiferenteDeB);
		
		//collectors joining
//		String docesEmString = doces.stream()
//			.map(String::valueOf)
//			.collect(Collectors.joining("; "));
//		System.out.println(docesEmString);
		
		//collectors toList
//		List<Double> listaDocesComBMenosUmReal = doces.stream()
//			.filter(d -> d.getNome().charAt(0) == 'B')
//			.map(d -> d.getPreco() - 1.00)
//			.collect(Collectors.toList());
//		System.out.println(listaDocesComBMenosUmReal);
		
		List<Doce> listaDocesComB = doces.stream()
			.filter(d -> d.getNome().charAt(0) == 'B')
			.collect(Collectors.toList());
		System.out.println(listaDocesComB);
	}
}
