package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import model.Musica;

public class TesteMusicaOptional {

	public static void main(String[] args) {

		List<Musica> musicas = new ArrayList<>();
		musicas.add(new Musica("Hunting high a low", 3.49, "A-ha"));
		musicas.add(new Musica("The Unforgiven", 6.24, "Metallica"));
		musicas.add(new Musica("Engel", 4.26, "Rammstein"));
		musicas.add(new Musica("Run", 3.30, "Lighthouse Family"));
		musicas.add(new Musica("Run", 3.30, "Lighthouse Family"));
		musicas.add(new Musica("Lovin' every minute", 4.20, "Lighthouse Family"));
		musicas.add(new Musica("Every you every me", 3.36, "Placebo"));
		musicas.add(new Musica("Pure Morning", 3.56, "Placebo"));
		musicas.add(new Musica("I miss you", 3.50, "Blink 182"));
		musicas.add(new Musica("Primeiros erros", 5.36, "Capital Inicial"));
		musicas.add(new Musica("My Immortal", 4.33, "Evanescence"));
		musicas.add(new Musica("Enjoy the silence", 4.40, "Depeche Mode"));
		musicas.add(new Musica("Enjoy the silence", 4.40, "Depeche Mode"));
		musicas.add(new Musica("Best of you", 4.16, "Foo Fighters"));
		musicas.add(new Musica("Feel good Inc.", 4.14, "Gorillaz"));
		musicas.add(new Musica("Trolltind", 4.19, "Lumsk"));
		musicas.add(new Musica("Bresso", 5.15, "Lacrimosa"));
		musicas.add(new Musica("Would?", 3.28, "Alice in Chains"));
		musicas.add(new Musica("Ironic", 4.07, "Alanis Morissette"));
		musicas.add(new Musica("The phantom of the opera", 4.44, "Nightwish"));
		musicas.add(new Musica("Hope Leaves", 4.29, "Opeth"));
		musicas.add(new Musica("Toxicity", 3.45, "System Of a Down"));
		musicas.add(new Musica("What could have been", 6.30, "Novembers Doom"));

		Optional<Musica> m1 = Optional.of(new Musica("What could have been", 6.30, "Novembers Doom"));
		if (m1.isPresent()) {
			System.out.println(m1.get());
		}

		// como aplicar os demais metodos optional aqui?

//		Optional<Musica> primeiroArtistaComL = musicas.stream()
//			.filter(m -> m.getInterprete().charAt(0) == 'L')
//			.findFirst();
//		Musica m2 = primeiroArtistaComL.orElse("Nenhum artista encontrado");
//		Musica m22 = primeiroArtistaComL.orElse(null);
//		Musica m3 = primeiroArtistaComL.orElseGet(() -> {System.out.println("Nenhum artista encontrado");});
//		Musica m4 = primeiroArtistaComL.orElseThrow(new RuntimeException("Nenhum artista encontrado"));
	}
}
