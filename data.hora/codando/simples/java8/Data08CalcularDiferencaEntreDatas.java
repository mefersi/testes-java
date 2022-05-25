package codando.simples.java8;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Data08CalcularDiferencaEntreDatas {

	public static void main(String[] args) {

		LocalDate startDate = LocalDate.of(2022, 02, 14);
		LocalDate endDate = LocalDate.of(2022, 03, 07);

		// chronounit
		long days = ChronoUnit.DAYS.between(startDate, endDate);
		System.out.println(days);

		LocalDateTime startDate2 = LocalDateTime.of(2022, 02, 14, 9, 0);
		LocalDateTime endDate2 = LocalDateTime.of(2022, 03, 7, 8, 00);

		// se quiser desconsiderar a parte das horas d� para converter de ldt para ld no
		// ChronoUnit
		long days2 = ChronoUnit.DAYS.between(startDate2.toLocalDate(), endDate2.toLocalDate());
		System.out.println(days2);

		// period
		Period period = Period.between(startDate, endDate);
		System.out.println(period);

		// duration
		Duration duration = Duration.between(startDate2, endDate2);
		System.out.println(duration);
	}
}
