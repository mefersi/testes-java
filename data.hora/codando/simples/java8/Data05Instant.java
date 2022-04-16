package codando.simples.java8;

import java.time.Instant;

public class Data05Instant {

	public static void main(String[] args) {
		
		// instant representa a quantidade de milissegundos a partir de um ponto de partida
		// a saída é uma data em formato ISO 8601 UTC
		Instant now = Instant.now();
		System.out.println(now);
		
		// para saber em milissegundos usamsamos o seguinte método
		System.out.println(now.toEpochMilli());
		
		// não aceita setar um timezone porque ele não depende de timezone
		// somente o zdt e ofdt tem um método .toInstant porque eles tem informação de offset	
		// o localdatetime também tem o método mas precisa que seja setado o offset no método para que funcione
		
		// se só é necessaria a quantidade de milissegundos, é possível obter de forma mais simples
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println(currentTimeMillis);
		
		// para comparar dois instant
		Instant instant1 = Instant.now();
		Instant instant2 = Instant.now();
		
		// se um vem depois que o outro
		boolean after = instant1.isAfter(instant2);
		System.out.println(after);
		
		// se um é antes que o outro
		boolean before = instant1.isBefore(instant2);
		System.out.println(before);
		
		// se os dois são iguais
		boolean equals = instant1.equals(instant2);
		System.out.println(equals);
	}
}
