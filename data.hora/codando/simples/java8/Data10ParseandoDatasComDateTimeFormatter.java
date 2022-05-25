package codando.simples.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;

public class Data10ParseandoDatasComDateTimeFormatter {

	public static void main(String[] args) {

		// o pattern deve ser compat�vel com a string que est� sendo passada e o tipo de
		// data/hora

		DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter parserComOffset = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mmXXX");

		LocalDateTime local = LocalDateTime.parse("10/01/2021 10:30", parser);
		System.out.println(local);

		OffsetDateTime offsetDateTime = OffsetDateTime.parse("10/01/2021 10:30-03:00", parserComOffset);
		System.out.println(offsetDateTime);

		// o ld s� pega o que � relevante para ele mas funciona
		LocalDate local2 = LocalDate.parse("10/01/2021 10:30", parser);
		System.out.println(local2);

		// outra forma de parsear � pelo pr�prio parser do dtf
		TemporalAccessor acessor = parser.parse("10/01/2021 10:30");
		System.out.println("Dia: " + acessor.get(ChronoField.DAY_OF_MONTH));
		System.out.println("M�s: " + acessor.get(ChronoField.MONTH_OF_YEAR));
	}
}
