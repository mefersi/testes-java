package codando.simples.java8;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Data03OverlapHorarioDeVerao {

	public static void main(String[] args) {
		
		ZoneId zoneId = ZoneId.of("America/Sao_Paulo");
		
		// withLaterOffsetAtOverlap cria a data com o offset-3:00, depois do horário de verão
		ZonedDateTime date = ZonedDateTime.of(2018, 2, 17, 23, 0, 0, 0, zoneId).withLaterOffsetAtOverlap();
		
		// withEarlierOffsetAtOverlap o horário é executado duas vezes, ainda durante o horário de verão
//		ZonedDateTime date = ZonedDateTime.of(2018, 2, 17, 23, 0, 0, 0, zoneId).withEarlierOffsetAtOverlap();
		
		System.out.println(date);
	}
}
