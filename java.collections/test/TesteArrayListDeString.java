package test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteArrayListDeString {

	public static void main(String[] args) {
		
		String trechoMusica1 = "É preciso amar as pessoas como se não houvesse amanhã.";
		String trechoMusica2 = "Não deixe nada para depois, não deixe o tempo passar, "
				+ "não deixe nada para semana que vem porque a semana que vem pode nem chegar.";
		String trechoMusica3 = "Quem é de verdade sabe quem é de mentira";
		String trechoMusica4 = "Devia ter, amado mais, me importado mais, ter visto o sol nascer.";
		String trechoMusica5 = "Qualquer lugar comum, outro lugar qualquer.";
		
		List<String> musicas = new ArrayList<String>();
		
		musicas.add(trechoMusica1);
		musicas.add(trechoMusica2);
		musicas.add(trechoMusica3);
		musicas.add(trechoMusica4);
		musicas.add(trechoMusica5);
		
//		for (String m : musicas) {
//			System.out.println(m);
//		}
		
		Collections.sort(musicas);
		
		musicas.forEach(musica -> {System.out.println("Trecho de musica: " + musica);});
	}
}
