package test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TesteStreamCollectCollectorsGroupingBy {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(0, 1, 2, 1, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9, 10, 10);

		Map<Boolean, List<Integer>> mapa = numeros.stream()
			.filter(n -> n % 2 == 0)
			.map(n -> n * 2)
			.collect(Collectors.groupingBy(n -> n > 10));
			
		System.out.println(mapa);
		
	}
}
