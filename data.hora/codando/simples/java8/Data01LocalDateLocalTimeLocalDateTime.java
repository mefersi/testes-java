package codando.simples.java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Data01LocalDateLocalTimeLocalDateTime {

	public static void main(String[] args) {

		// grupo de classes Local n�o possui informa��o de timezone, usa o timezone
		// defaut s� para criar a data, depois descarta
		// LocalDate � usado para dia mes e ano
		LocalDate date = LocalDate.of(2022, 02, 12);
		System.out.println(date);

		// para horario � utilizado o LocalTime
		LocalTime hour = LocalTime.of(10, 30);
		System.out.println(hour);

		// para trabalhar com data e hora
		LocalDateTime localDateTime = LocalDateTime.of(date, hour);
		System.out.println(localDateTime);

		// essa api n�o tem comportamento leniente
		System.out.println("--------------------------------------------------------");
		LocalDate now = LocalDate.now();
		System.out.println(now);
		DayOfWeek dayOfWeek = now.getDayOfWeek();
		System.out.println("Dia da semana: " + dayOfWeek);
		int dayOfMonth = now.getDayOfMonth();
		System.out.println("Dia: " + dayOfMonth);
		Month month = now.getMonth();
		System.out.println("M�s: " + month);
		int year = now.getYear();
		System.out.println("Ano: " + year);

		LocalTime hourNow = LocalTime.now();
		System.out.println(hourNow);
		int hour2 = hourNow.getHour();
		System.out.println("Hora: " + hour2);
		int minute = hourNow.getMinute();
		System.out.println("Minutos: " + minute);
	}
}
