package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteDefaultMethodsComparator2 {

	public static void main(String[] args) {

		List<String> bandas = new ArrayList<String>();
		bandas.add("Opeth");
		bandas.add("A-ha");
		bandas.add("Alice in Chains");
		bandas.add("Aerosmith");
		bandas.add("Depeche Mode");
		bandas.add("Placebo");

		Comparator<String> comparador = new BandasComparator();
		bandas.sort(comparador);
		bandas.forEach(b -> System.out.println(b));
	}
}

class BandasComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2);
	}
}
