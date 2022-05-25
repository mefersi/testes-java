package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TesteIterator {

	public static void main(String[] args) {

		List<String> nomes = new ArrayList<String>();
		nomes.add("Regina");
		nomes.add("Cristiane");
		nomes.add("Yuri");
		nomes.add("Jaqueline");
		nomes.add("Julia");

		Iterator<String> it = nomes.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
