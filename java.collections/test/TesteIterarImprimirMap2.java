package test;

import java.util.HashMap;
import java.util.Map;

public class TesteIterarImprimirMap2 {

	public static void main(String[] args) {
		
		Map<Integer, String> musicas = new HashMap<Integer, String>();
		musicas.put(1, "Hunting high a low");
		musicas.put(2, "Rotten apple");
		musicas.put(3, "Wrong");
		musicas.put(4, "Earth song");
		musicas.put(5, "Nutshell");
		
		musicas.keySet().forEach(codigo -> System.out.println(musicas.get(codigo)));
	}
}
