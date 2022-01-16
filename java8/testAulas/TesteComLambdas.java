package testAulas;

import java.util.ArrayList;
import java.util.List;

import model.Musica;

public class TesteComLambdas {

	public static void main(String[] args) {
		
		List<Musica> musicas = new ArrayList<Musica>();
		musicas.add(new Musica("Take on me", 4.12, "A-ha"));
		musicas.add(new Musica("Shape of my heart", 3.48, "Sting"));
		musicas.add(new Musica("Olhos vermelhos", 3.56, "Capital Inicial"));
		musicas.add(new Musica("Patience", 4.57, "Guns n' Roses"));
		musicas.add(new Musica("Pictures of you", 5.57, "The Cure"));
		
		musicas.sort((m1, m2) -> m1.getNome().compareTo(m2.getNome()));
		
		musicas.forEach(m -> System.out.println(m));
	}
}
