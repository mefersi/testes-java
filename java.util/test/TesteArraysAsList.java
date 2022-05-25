package test;

import java.util.Arrays;
import java.util.List;

public class TesteArraysAsList {

	public static void main(String[] args) {

		String[] nomes = new String[6];
		nomes[0] = "Nomes:";
		nomes[1] = "Regina";
		nomes[2] = "Cristiane";
		nomes[3] = "Yuri";
		nomes[4] = "Jaqueline";
		nomes[5] = "Julia";

		List<String> names = Arrays.asList(nomes);

		for (String n : names) {
			System.out.println(n);
		}
	}
}
