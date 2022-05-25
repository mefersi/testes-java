package codando.simples.api.legada;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Data5ParsearUmaDataComSimpleDateFormat {

	public static void main(String[] args) throws ParseException {

		// o ideal � ter dois sdf um para formatar e outro para parsear
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat parser = new SimpleDateFormat("dd/MM/yyyy");

		Calendar calendar = Calendar.getInstance();
		calendar.set(2021, Calendar.FEBRUARY, 9, 12, 32, 0);
		;
		calendar.set(Calendar.MILLISECOND, 0);
		Date date = calendar.getTime();

		String dataFormatada = formatter.format(date);

		System.out.println(date);
		System.out.println(date.getTime());
		System.out.println(dataFormatada);
		System.out.println("----------------------------------");

		Date dateParseado = parser.parse(dataFormatada);

		// quando faz o format/parse perde informa��o de hor�rio e � preciso setar via
		// calendar
		Calendar calendarParseado = Calendar.getInstance();
		calendarParseado.setTime(dateParseado);
		calendar.set(Calendar.HOUR_OF_DAY, 12);
		calendar.set(Calendar.MINUTE, 32);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);

		dateParseado = calendar.getTime();

		System.out.println(dateParseado.getTime());
		System.out.println(dateParseado);
	}
}
