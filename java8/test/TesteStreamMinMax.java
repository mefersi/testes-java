package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TesteStreamMinMax {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(0, 1, 2, 1, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9, 10, 10);

		Optional<Integer> min = numeros.stream().map(n -> n * 5).min(Comparator.naturalOrder());

		System.out.println("Minimo: " + min.get());

		Optional<Integer> max = numeros.stream().map(n -> n * 5).max(Comparator.naturalOrder());

		System.out.println("Maximo: " + max.get());
	}
}
