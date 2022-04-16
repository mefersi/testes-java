package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import model.Musica;

public class TesteMusicaStream {

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
		
		//---------------------------------------------------------------- soma do tempo das musicas
		double somaTempoDasMusicas = musicas.stream()
			.mapToDouble(Musica::getTempo)
			.sum();
		System.out.println("O total do tempo das musicas é: " + String.format("%.2f", somaTempoDasMusicas));
		System.out.println("------------------------------------------------------------------------------");
		
		//----------------------------------------------------------------  nome das musicas
		Stream<String> nomesDasMusicas = musicas.stream()
			.map(Musica::getNome)
			.limit(21)
			.distinct();
		System.out.println("Musicas:");
		nomesDasMusicas.forEach(System.out::println);
		System.out.println("------------------------------------------------------------------------------");
		
		//----------------------------------------------------------------  musicas acima de 6 min
		Map<Boolean, List<Musica>> mapMusicasAcimaDe6min = musicas.stream()
			.filter(m -> m.getTempo() > 5.00)
			.collect(Collectors.groupingBy(m -> m.getTempo() > 6.00));
		System.out.println(mapMusicasAcimaDe6min);
		System.out.println("------------------------------------------------------------------------------");
		
		//----------------------------------------------------------------  min
		Optional<Musica> min = musicas.stream()
			.min(Musica::compareTo);
		System.out.println("A musica de menor tempo é: " + min);
		System.out.println("------------------------------------------------------------------------------");
		
		//---------------------------------------------------------------- max
		Optional<Musica> max = musicas.stream()
			.max(Musica::compareTo);
		System.out.println("A musica de maior tempo é: " + max);
		System.out.println("------------------------------------------------------------------------------");
		
		//----------------------------------------------------------------  quantidade de musicas
		long count = musicas.stream()
			.count();
		System.out.println("Há " + count + " musicas.");
		System.out.println("------------------------------------------------------------------------------");
		
		//------------------------------------------------------------- Collectors.toMap - Interpretes que começam com A e suas musicas
		musicas.stream()
			.filter(m -> m.getInterprete().charAt(0) == 'A')
			.collect(Collectors.toMap(
					m -> m.getInterprete(),
					m -> m.getNome()))
			.forEach((interprete, musica) -> System.out.println("Intérprete: " + interprete + ", música: " + musica));
		System.out.println("------------------------------------------------------------------------------");
		
		//------------------------------------------------------------- Collectors.toList - interpretes que começam com L e suas musicas
		List<Musica> interpretesQueComecamComL = musicas.stream()
			.filter(m -> m.getInterprete().charAt(0) == 'L')
			.collect(Collectors.toList());
		interpretesQueComecamComL.forEach(System.out::println);
		System.out.println("------------------------------------------------------------------------------");
		
		//------------------------------------------------------------- Collectors.toMap - Musicas com mais de 4 minutos e seu tempo
		
		musicas.stream()
			.filter(m -> m.getTempo() > 4.00)
			.collect(Collectors.toMap(m -> m.getNome(), m -> m.getTempo()))
			.forEach((musica, tempo) -> System.out.println("Música: " + musica + " - duração: " + tempo));
	}
}
