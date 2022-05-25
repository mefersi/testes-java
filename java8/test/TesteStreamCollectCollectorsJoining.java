package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TesteStreamCollectCollectorsJoining {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(0, 1, 2, 1, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9, 10, 10);

		String numerosEmString = numeros.stream().map(String::valueOf).collect(Collectors.joining(","));

		System.out.println(numerosEmString);
	}
}
