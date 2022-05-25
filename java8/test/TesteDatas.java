package test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TesteDatas {

	public static void main(String[] args) {

		/**
		 * DATAS JAVA 8
		 * 
		 * LocalDate - representa uma data: 30/11/1995
		 * 
		 * LocalTime - representa uma hora: 17:45:15
		 * 
		 * LocalDateTime - representa data + hora: 30/11/1995 17:45:15
		 * 
		 * Instant - representa um instante/momento na linha do tempo (milissegundos a
		 * partir 01/01/1970 00:00:00 GMT/UTC
		 * 
		 * ZonedDateTime - LocalDateTime com TimeZone (fuso hor�rio) 30/11/1995 17:45:15
		 * GMT -3 (America/Sao_Paulo)
		 * 
		 * -----------------------------------------------------------------------------------------------------------------
		 */

		// ------------------------------- CRIAR DATAS DE AGORA
		// --------------------------------------
		// data de agora - LocalDate
		LocalDate ldNow = LocalDate.now();
		System.out.println(ldNow);

		// hor�rio de agora - LocalTime
		LocalTime ltNow = LocalTime.now();
		System.out.println(ltNow);

		// data e hora de agora - LocalDateTime
		LocalDateTime ldtNow = LocalDateTime.now();
		System.out.println(ldtNow);

		// instante - Instant
		Instant iNow = Instant.now();
		System.out.println(iNow);

		// Data e hora com fuso horario
		ZonedDateTime zdtNow = ZonedDateTime.now();
		System.out.println(zdtNow);

		// --------------------------- CRIAR OUTRAS DATAS / HORAS
		// ----------------------------------------------

		// data
		LocalDate dYuri = LocalDate.of(1995, 05, 15);
		System.out.println(dYuri);

		// hora
		LocalTime hYuri = LocalTime.of(17, 44, 15);
		System.out.println(hYuri);

		// data e hora
		LocalDateTime dhYuri = LocalDateTime.of(dYuri, hYuri);
		System.out.println(dhYuri);

		LocalDateTime dhJaque = LocalDateTime.of(1995, 11, 30, 17, 45);
		System.out.println(dhJaque);

		// instante
		Instant iMillis = Instant.ofEpochMilli(300000000L);
		System.out.println(iMillis);

		// data e hora com fuso hor�rio
		ZonedDateTime zdtYuri = ZonedDateTime.of(dhYuri, ZoneId.of("America/Sao_Paulo"));
		System.out.println(zdtYuri);

		ZonedDateTime zdtJaque = ZonedDateTime.of(1995, 11, 30, 17, 45, 15, 0, ZoneId.systemDefault());
		System.out.println(zdtJaque);

		// --------------------------------- MANIPULAC��O
		// -----------------------------------------
		// LocalDate
		LocalDate dataDeAgoraMaisSeisMeses = ldNow.plusMonths(6);
		System.out.println("Data de agora mais 6 meses: " + dataDeAgoraMaisSeisMeses);

		LocalDate dataDeAgoraMaisUmAno = ldNow.plusYears(1);
		System.out.println("Data de agora mais um ano: " + dataDeAgoraMaisUmAno);

		LocalDate dataDeAgoraMenosSeisMeses = ldNow.minusMonths(6);
		System.out.println("Data de agora menos 6 meses: " + dataDeAgoraMenosSeisMeses);

		LocalDate dataDeAgoraMenosUmAno = ldNow.minusYears(1);
		System.out.println("Data de agora menos um ano: " + dataDeAgoraMenosUmAno);

		LocalDate encadeamento = ldNow.plusMonths(2).plusDays(15);
		System.out.println("Data de agora mais 2 meses e 15 dias: " + encadeamento);

		// LocalTime
		LocalTime horaDeAgoraMaisDezHoras = ltNow.plusHours(10);
		System.out.println("Hora de agora mais dez horas: " + horaDeAgoraMaisDezHoras);

		LocalTime horaDeAgoraMenosSeisHoras = ltNow.minusHours(6);
		System.out.println("Hora de agora menos seis horas: " + horaDeAgoraMenosSeisHoras);

		// LocalDateTime
		LocalDateTime dataDeAgoraMaisTresSemanas = ldtNow.plusWeeks(3);
		System.out.println("Data de agora mais tr�s semanas: " + dataDeAgoraMaisTresSemanas);
	}
}
