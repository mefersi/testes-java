package codando.simples.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class Data11MigrandoEntreApiLegadaEJavaTime2 {

	public static void main(String[] args) {
		
		// localdate para date
		// primeiro precisamos obter um instant e dele obter um date
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		LocalDateTime localDateTime = now.atTime(14, 49);
		ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of("America/Sao_Paulo"));
		Date from = Date.from(zonedDateTime.toInstant());
		System.out.println(from);
		
		// de um date para um localdate
		LocalDate localDate = from.toInstant().atZone(ZoneId.of("America/Sao_Paulo")).toLocalDate();
		System.out.println(localDate);
	}
}
