package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteDefaultMethodsComparator {

	public static void main(String[] args) {

		List<String> nomes = new ArrayList<String>();
		nomes.add("Yuri");
		nomes.add("Regina");
		nomes.add("Cristiane");
		nomes.add("Julia");
		nomes.add("Jaqueline");

		Comparator<String> comparador = new NomeComparator();
		nomes.sort(comparador);
		nomes.forEach(n -> System.out.println(n));
	}
}

class NomeComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
//		return s1.compareTo(s2);
		if (s1.length() < s2.length())
			return -1;
		if (s1.length() > s2.length())
			return 1;
		return 0;
	}
}