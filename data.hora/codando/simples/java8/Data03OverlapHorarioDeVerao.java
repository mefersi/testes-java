package codando.simples.java8;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Data03OverlapHorarioDeVerao {

	public static void main(String[] args) {

		ZoneId zoneId = ZoneId.of("America/Sao_Paulo");

		// withLaterOffsetAtOverlap cria a data com o offset-3:00, depois do hor�rio de
		// ver�o
		ZonedDateTime date = ZonedDateTime.of(2018, 2, 17, 23, 0, 0, 0, zoneId).withLaterOffsetAtOverlap();

		// withEarlierOffsetAtOverlap o hor�rio � executado duas vezes, ainda durante o
		// hor�rio de ver�o
//		ZonedDateTime date = ZonedDateTime.of(2018, 2, 17, 23, 0, 0, 0, zoneId).withEarlierOffsetAtOverlap();

		System.out.println(date);
	}
}
