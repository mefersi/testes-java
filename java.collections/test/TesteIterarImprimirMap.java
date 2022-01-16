package test;

import java.util.LinkedHashMap;
import java.util.Map;

public class TesteIterarImprimirMap {

	public static void main(String[] args) {
		
		Map<Integer, String> pessoasIdades = new LinkedHashMap<Integer, String>();
		
		pessoasIdades.put(26, "Yuri");
		pessoasIdades.put(33, "Cristiane");
		pessoasIdades.put(56, "Regina");
		pessoasIdades.put(02, "Julia");
		
		pessoasIdades.keySet().forEach(idade -> System.out.println(pessoasIdades.get(idade)));
	}
}
