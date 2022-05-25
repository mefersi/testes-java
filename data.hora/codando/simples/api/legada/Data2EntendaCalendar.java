package codando.simples.api.legada;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Data2EntendaCalendar {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("America/Sao_Paulo"));
		// faz com que argumentos invalidos retornem excecao
		calendar.setLenient(false);
		calendar.set(Calendar.YEAR, 2022);
		calendar.set(Calendar.MONTH, Calendar.FEBRUARY);
		calendar.set(Calendar.DAY_OF_MONTH, 07);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);

		// o gettime do calendar devolve um date
		Date time = calendar.getTime();

		System.out.println("Data: " + time);
		System.out.println("Timestamp do calendar: " + calendar.getTimeInMillis());
		// o gettime do date devolve um timestamp
		System.out.println("Timestamp do date:     " + time.getTime());

		System.out.println("Ano: " + calendar.get(Calendar.YEAR));
		System.out.println("M�s: " + calendar.get(Calendar.MONTH));
		System.out.println("Dia: " + calendar.get(Calendar.DAY_OF_MONTH));
	}
}
