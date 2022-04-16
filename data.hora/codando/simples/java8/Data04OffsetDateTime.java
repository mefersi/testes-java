package codando.simples.java8;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

public class Data04OffsetDateTime {

	public static void main(String[] args) {
		
		// a diferença entre o zdt r o ofdt é o timezone do primeiro
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		
		OffsetDateTime now = OffsetDateTime.now();
		System.out.println(now);
		
		// é possivel criar um ofdt a partir de um zdt
		
		OffsetDateTime offsetDateTime = zdt.toOffsetDateTime();
		System.out.println(offsetDateTime);
	}
}
