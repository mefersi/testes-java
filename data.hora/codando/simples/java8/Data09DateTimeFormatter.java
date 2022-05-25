package codando.simples.java8;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Data09DateTimeFormatter {

	public static void main(String[] args) {

		LocalDate now = LocalDate.now();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
		String formattedDate = formatter.format(now);
		System.out.println(formattedDate);

		// com zdt o timezone influencia
		ZonedDateTime now2 = ZonedDateTime.now();

		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")
				.withZone(ZoneId.of("America/Sao_Paulo"));
		String formattedDate2 = formatter2.format(now2);
		System.out.println(formattedDate2);
	}
}
