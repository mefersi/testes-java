package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TesteStreamCollectCollectorsToList {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(0, 1, 2, 1, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9, 10, 10);

		List<Integer> imparesMultiplicadosPorTres = numeros.stream().filter(n -> n % 2 != 0).map(n -> n * 3)
				.collect(Collectors.toList());

		System.out.println(imparesMultiplicadosPorTres);
	}
}
