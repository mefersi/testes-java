package test;

import java.util.Arrays;
import java.util.List;

public class TesteStreamNumerosSkipLimitDistinct {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(0, 1, 2, 1, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9, 10, 10);

		numeros.stream().skip(3).limit(12).distinct().forEach(n -> System.out.println(n));
	}
}
