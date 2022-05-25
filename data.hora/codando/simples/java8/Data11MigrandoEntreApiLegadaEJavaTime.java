package codando.simples.java8;

import java.time.Instant;
import java.util.Date;

public class Data11MigrandoEntreApiLegadaEJavaTime {

	public static void main(String[] args) {

		// date e isntant s�o muito parecidos por guardarem um timestamp
		// de date para instant
		Date date = new Date();
		Instant instant = date.toInstant();
		System.out.println(instant);

		// de instant para date
		Instant instant2 = Instant.parse("2021-01-15T10:30:00.123456789Z");
		Date date2 = Date.from(instant2);
		instant2 = date2.toInstant();
		System.out.println(instant2);
	}
}
