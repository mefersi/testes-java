package codando.simples.java8;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Data03GapHorarioDeVerao {

	public static void main(String[] args) {
		
		// gap do horário de verão é esse salto de tempo que vai da meia noite para a uma da manhã
		
		ZoneId zoneId = ZoneId.of("America/Sao_Paulo");
		
		ZonedDateTime date = ZonedDateTime.of(2017, 10, 15, 0, 0, 0, 0, zoneId);
		
		System.out.println(date);
	}
}
