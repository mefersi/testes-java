package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.Musica;

public class TesteOrdenacaoMusicas {

	public static void main(String[] args) {

		Musica m1 = new Musica("Hunting high a low", 3.45, "A-ha");
		Musica m2 = new Musica("Man in the mirror", 3.26, "Michael Jackson");
		Musica m3 = new Musica("High Hopes", 9.57, "Pink Floyd");
		Musica m4 = new Musica("Black or white", 4.13, "Michael Jackson");
		Musica m5 = new Musica("Hole in my soul", 4.42, "Aerosmith");

		List<Musica> musicas = new ArrayList<Musica>();
		musicas.add(m1);
		musicas.add(m2);
		musicas.add(m3);
		musicas.add(m4);
		musicas.add(m5);

		musicas.forEach(musica -> System.out.println(musica));
		Collections.sort(musicas);
		System.out.println("----------------------------------------");
		System.out.println("Ordenando as musicas por ordem alfabetica: ");
		musicas.forEach(musica -> System.out.println(musica));
		System.out.println("----------------------------------------");
		System.out.println("Ordenando as musicas pela duracao: ");
		musicas.sort(Comparator.comparing(Musica::getTempo));
		musicas.forEach(musica -> System.out.println(musica));
		System.out.println("----------------------------------------");
		System.out.println("Ordenando as musicas pelo interprete: ");
		musicas.sort(Comparator.comparing(Musica::getInterprete));
		musicas.forEach(musica -> System.out.println(musica));
	}
}