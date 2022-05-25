package codando.simples.java8;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

public class Data04OffsetDateTime {

	public static void main(String[] args) {

		// a diferen�a entre o zdt r o ofdt � o timezone do primeiro
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);

		OffsetDateTime now = OffsetDateTime.now();
		System.out.println(now);

		// � possivel criar um ofdt a partir de um zdt

		OffsetDateTime offsetDateTime = zdt.toOffsetDateTime();
		System.out.println(offsetDateTime);
	}
}
