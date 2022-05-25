package codando.simples.java8;

import java.time.Instant;

public class Data05Instant {

	public static void main(String[] args) {

		// instant representa a quantidade de milissegundos a partir de um ponto de
		// partida
		// a sa�da � uma data em formato ISO 8601 UTC
		Instant now = Instant.now();
		System.out.println(now);

		// para saber em milissegundos usamsamos o seguinte m�todo
		System.out.println(now.toEpochMilli());

		// n�o aceita setar um timezone porque ele n�o depende de timezone
		// somente o zdt e ofdt tem um m�todo .toInstant porque eles tem informa��o de
		// offset
		// o localdatetime tamb�m tem o m�todo mas precisa que seja setado o offset no
		// m�todo para que funcione

		// se s� � necessaria a quantidade de milissegundos, � poss�vel obter de forma
		// mais simples
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println(currentTimeMillis);

		// para comparar dois instant
		Instant instant1 = Instant.now();
		Instant instant2 = Instant.now();

		// se um vem depois que o outro
		boolean after = instant1.isAfter(instant2);
		System.out.println(after);

		// se um � antes que o outro
		boolean before = instant1.isBefore(instant2);
		System.out.println(before);

		// se os dois s�o iguais
		boolean equals = instant1.equals(instant2);
		System.out.println(equals);
	}
}
