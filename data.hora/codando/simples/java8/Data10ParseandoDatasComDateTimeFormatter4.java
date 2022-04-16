package codando.simples.java8;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

public class Data10ParseandoDatasComDateTimeFormatter4 {

	public static void main(String[] args) throws ParseException {
		
		// iso format
		
		LocalDate date = LocalDate.parse("2022-02-14");
		System.out.println(date);
		
		LocalDateTime dateTime = LocalDateTime.parse("2022-02-14T14:18:15");
		System.out.println(dateTime);
		
		OffsetDateTime offsetDateTime = OffsetDateTime.parse("2022-02-14T14:18:15-3:00");
		System.out.println(offsetDateTime);
		
		ZonedDateTime zonedDateTime = ZonedDateTime.parse("2022-02-14T14:18:15-3:00[America/Sao_Paulo]");
		System.out.println(zonedDateTime);
	}
}
