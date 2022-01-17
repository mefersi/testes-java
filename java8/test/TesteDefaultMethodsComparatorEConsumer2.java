package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class TesteDefaultMethodsComparatorEConsumer2 {

	public static void main(String[] args) {
		
		List<String> bandas = new ArrayList<String>();
		bandas.add("Opeth");
		bandas.add("A-ha");
		bandas.add("Alice in Chains");
		bandas.add("Aerosmith");
		bandas.add("Depeche Mode");
		bandas.add("Placebo");
		
		Comparator<String> comparador= new BandasComparator2();
		bandas.sort(comparador);
//		bandas.forEach(b -> System.out.println(b));
		
		Consumer<String> consumidor = new ImprimeBandas();
		bandas.forEach(consumidor);
	}
}
class ImprimeBandas implements Consumer<String> {

	@Override
	public void accept(String s) {
		System.out.println(s);
	}
}

class BandasComparator2 implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2);
	}
	
}
