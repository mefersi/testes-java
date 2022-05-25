package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public interface TesteGeneroSet {

	public static void main(String[] args) {

		Collection<String> generos = new HashSet<String>();
		generos.add("Rock");
		generos.add("MPB");
		generos.add("Pop");
		generos.add("Eletronica");
		generos.add("Samba");

		boolean contemRock = generos.contains("Rock");
		System.out.println("Contem o genero musical Rock no conjunto: " + contemRock);

		boolean contemGospel = generos.contains("Gospel");
		System.out.println("Contem o genero musical Gospel no conjunto: " + contemGospel);

		generos.remove("Samba");

		System.out.println("--------- Lista de generos musicais: ---------");
		generos.forEach(g -> System.out.println(g));

		List<String> generosEmLista = new ArrayList<>(generos);
		System.out.println(generosEmLista.get(0));
		Collections.sort(generosEmLista);

		System.out.println("---------- Lista de generos musicas ordenada em ordem alfabetica: ----------");
		System.out.println(generosEmLista);
	}
}
