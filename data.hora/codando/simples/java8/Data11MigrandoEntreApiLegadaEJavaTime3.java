package codando.simples.java8;

import java.time.Instant;
import java.util.Calendar;

public class Data11MigrandoEntreApiLegadaEJavaTime3 {

	public static void main(String[] args) {

		// de calendar para instant
		Calendar calendar = Calendar.getInstance();
		Instant instant = calendar.toInstant();
		System.out.println(instant);

		// de instant para calendar
		Calendar calendar2 = Calendar.getInstance();
		calendar2.setTimeInMillis(instant.toEpochMilli());
		System.out.println(calendar2.getTime());
	}
}
