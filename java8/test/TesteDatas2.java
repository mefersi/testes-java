package test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class TesteDatas2 {

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
		 * Instant - representa um instante/momento na linha do tempo (milissegundos a partir 01/01/1970 00:00:00 GMT/UTC
		 * 
		 * ZonedDateTime - LocalDateTime com TimeZone (fuso horário) 30/11/1995 17:45:15 GMT -3 (America/Sao_Paulo)
		 * 
		 * -----------------------------------------------------------------------------------------------------------------
		 * 
		 * Period - representa/armazena um espaço de tempo baseado em datas, como dias, semanas, etc
		 * só da para trabalhar com classes que representam data (dias, meses e anos)
		 * 
		 * Duration - representa/armazena um espaço de tempo baseado em tempo, como horas, min, etc
		 * só trabalha com classes relacionadas a tempo (horas, min e segundos)
		 */ 
		
		//--------------------------------------------------- PERIOD ------------------------------------------------------------
		// of
		Period of = Period.of(1, 5, 3);
		System.out.println(of);
		
		Period ofDays = Period.ofDays(15);
		System.out.println(ofDays);
		
		Period ofMonths = Period.ofMonths(11);
		System.out.println(ofMonths);
		
		Period ofYears = Period.ofYears(26);
		System.out.println(ofYears);
		
		// between
		LocalDate ldNow = LocalDate.now();
		LocalDate ldJaque = LocalDate.of(1995, 11, 30);
		Period between = Period.between(ldNow, ldJaque);
		System.out.println("Período entre a minha data de nascimento e a data de agora: " + between);
		
		Period plusDays = between.plusDays(10);
		System.out.println("O período anterior mais 10 dias: " + plusDays);
		
		// outra forma de obter um Period
		Period until = ldNow.until(ldJaque);
		System.out.println("Data de agora até a data do meu nascimento usando o until: " + until);
		
		// adicionando um período no localdate
		LocalDate plus = ldJaque.plus(ofYears);
		System.out.println("Adicionando um periodo de 26 anos: " + plus);
		
		// ------------------------------------------------- DURATION ---------------------------------------------------------
		// of
		Duration ofDays2 = Duration.ofDays(1);
		System.out.println("Duration de 1 dia (em horas): " + ofDays2);
		
		Duration ofHours = Duration.ofHours(3);
		System.out.println("Duration de 3 horas: " + ofHours);
		
		Duration ofMinutes = Duration.ofMinutes(30000);
		System.out.println("Duration de 30000 minutos: " + ofMinutes);
		
		// between
		LocalTime ltNow = LocalTime.now();
		LocalTime ltNoite = LocalTime.of(22, 25, 15);
		Duration between2 = Duration.between(ltNow, ltNoite);
		System.out.println("Duration entre a hora de agora e 22:25 da noite: " + between2);
		
		Duration plusHours = between2.plusHours(1);
		System.out.println("Horario anterior mais uma hora: " + plusHours);
		
	}
}
