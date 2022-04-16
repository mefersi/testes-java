package codando.simples.java8;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Data03ComparandoZonedDateTime {

	public static void main(String[] args) {
		
		ZonedDateTime date1 = ZonedDateTime.of(2022, 02, 9, 18, 07, 0, 0, ZoneId.of("America/Sao_Paulo"));
		
		System.out.println(date1);
		
		ZonedDateTime date2 = ZonedDateTime.of(2022, 02, 9, 13, 07, 0, 0, ZoneId.of("America/Los_Angeles"));
		
		System.out.println(date2);
		
		// o equals vai comparar todas as informações, se tudo for igual retorna true se um ponto for diferente retorna false
		System.out.println(date1.equals(date2));
		
		// o isequals compara se o instante é o mesmo, o timestamp
		System.out.println(date1.isEqual(date2));
	}
}
