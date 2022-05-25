package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteOrdenacaoComparator2 {

	public static void main(String[] args) {

		List<String> nomes = new ArrayList<>();
		nomes.add("Regina");
		nomes.add("Cristiane");
		nomes.add("Yuri");
		nomes.add("Jaqueline");
		nomes.add("Julia");

		for (String string : nomes) {
			System.out.println(string);
		}

		nomes.sort(new NomesComparator());

		System.out.println("--------------------------------------");
		for (String string : nomes) {
			System.out.println(string);
		}
	}
}

class NomesComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2);
	}
}
