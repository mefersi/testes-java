package codando.simples.java8;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class Data10ParseandoDatasComDateTimeFormatter2 {

	public static void main(String[] args) {

		// OptionalPattern s�o os colchetes dentro do pattern do formatador
		// � uma alternativa para j� deixar preenchidos valores default

		DateTimeFormatter parser = new DateTimeFormatterBuilder().appendPattern("dd/MM/yyyy[ HH:mm]")
				.parseDefaulting(ChronoField.HOUR_OF_DAY, 10).parseDefaulting(ChronoField.MINUTE_OF_HOUR, 30)
				.parseDefaulting(ChronoField.OFFSET_SECONDS, ZoneOffset.ofHours(-3).getTotalSeconds()).toFormatter();

		OffsetDateTime date = OffsetDateTime.parse("10/01/2021", parser);
		System.out.println(date);

		date = OffsetDateTime.parse("10/01/2021 08:15", parser);
		System.out.println(date);
	}
}
