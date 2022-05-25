package codando.simples.java8;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class Data03TimezoneEZonedDateTime {

	public static void main(String[] args) {

		// classe que trabalha com o Timezone: zoneddateTime que tamb�m usa o timezone
		// da JVM
		// LocalDate, LocalDateTime e LocalTime usa o timezone setado na JVM

		// para instanciar o zdt com um timezone especifico, sem alterar o da JVM,
		// usa-se a classe zoneid
		// a� passa o zoneid para o zdt
		ZonedDateTime now = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));

		// h� diversos gets para o zdt, inclusive o offset e o timezone
		ZoneId zone = now.getZone();
		ZoneOffset offset = now.getOffset();
		System.out.println("Offset: " + offset);
		System.out.println("Timezone: " + zone);
		System.out.println(now);

		// m�todo with passando um LocalDate
		LocalDate localDate = LocalDate.of(2022, 1, 15);
		ZonedDateTime with = now.with(localDate);
		System.out.println(with);
	}
}
