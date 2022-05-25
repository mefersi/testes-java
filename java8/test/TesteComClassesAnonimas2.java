package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import model.Musica;

public final class TesteComClassesAnonimas2 {

	public static void main(String[] args) {

		List<Musica> musicas = new ArrayList<>();
		musicas.add(new Musica("Take on me", 4.12, "A-ha"));
		musicas.add(new Musica("Shape of my heart", 3.48, "Sting"));
		musicas.add(new Musica("Olhos vermelhos", 3.56, "Capital Inicial"));
		musicas.add(new Musica("Patience", 4.57, "Guns n' Roses"));
		musicas.add(new Musica("Pictures of you", 5.57, "The Cure"));

		musicas.sort(new Comparator<Musica>() {
			@Override
			public int compare(Musica m1, Musica m2) {
				return m1.getNome().compareTo(m2.getNome());
				// return m1.getInterprete().compareTo(m2.getInterprete());
			}
		});

		musicas.forEach(new Consumer<Musica>() {
			@Override
			public void accept(Musica m) {
				System.out.println(m);
			}
		});
	}
}
