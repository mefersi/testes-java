package codando.simples.java8;

import java.time.Duration;
import java.time.Period;

public class Data07PeriodEDuration {

	public static void main(String[] args) {
		// Period representa uma duração em anos, meses e dias
		Period period = Period.ofYears(4);
		System.out.println(period);
		
		Period period1 = period.plusMonths(6).plusDays(15);
		System.out.println(period1);
		
		period1 = period1.minusMonths(3);
		System.out.println(period1);
		
		Period period2 = Period.parse("P10Y6M15D");
		System.out.println(period2);
		
		System.out.println(period2.getYears());

		// para horas, minutos e segundos temos o Duration
		// internamente converte tudo para segundos
		
		Duration duration = Duration.ofHours(16);
		System.out.println(duration);
		Duration iso8601 = Duration.parse("PT30M");
		System.out.println(iso8601);
		
		Duration duration2 = duration.minusHours(6).plusMinutes(30).plusSeconds(15);
		System.out.println(duration2);
		
		System.out.println(duration2.getSeconds());
		
		
		
		
		
		
	}
}
