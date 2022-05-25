package codando.simples.java8;

import java.time.LocalDateTime;

public class Data06AritmeticaDatasLocalDateTime {

	public static void main(String[] args) {

		LocalDateTime date = LocalDateTime.of(2022, 01, 31, 16, 35, 0, 0);
		System.out.println(date);

		// para incrementar
		LocalDateTime plusHours = date.plusHours(1);
		System.out.println(plusHours);

		// para decrementar
		LocalDateTime minusMinutes = date.minusDays(10).minusMinutes(15);
		System.out.println(minusMinutes);
	}
}
