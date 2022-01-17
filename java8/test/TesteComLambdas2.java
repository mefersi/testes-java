package test;

import java.util.ArrayList;
import java.util.List;

public class TesteComLambdas2 {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<String>();
		nomes.add("Felipe Sousa Costa");
		nomes.add("Axl Rose");
		nomes.add("Slash");
		nomes.add("Duff McKagan");
		
		nomes.sort((n1, n2) -> n1.compareTo(n2));
		
		nomes.forEach(n -> System.out.println(n));
	}
}
