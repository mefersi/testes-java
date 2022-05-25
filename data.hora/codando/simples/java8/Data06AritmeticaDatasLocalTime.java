package codando.simples.java8;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Data06AritmeticaDatasLocalTime {

	public static void main(String[] args) {

		LocalTime localTime = LocalTime.of(10, 30);
		System.out.println(localTime);

		// abaixo h� uma opera��o mais gen�rica, se for passado no enum uma unidade n�o
		// suportada dar� uma exception
		LocalTime changedLocalTime = localTime.plus(1, ChronoUnit.MINUTES);
//		LocalTime changedLocalTime = localTime.plusHours(1).minusMinutes(20);
		System.out.println(changedLocalTime);
	}
}
