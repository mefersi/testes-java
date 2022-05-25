package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TesteParseandoData {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat parser = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

		Calendar calendar1 = Calendar.getInstance();
		calendar1.set(2022, 2 - 1, 9, 14, 29);
		Date data = calendar1.getTime();

		String dataFormatada = formatter.format(data);
		System.out.println(dataFormatada);

		Date dataParseada = parser.parse(dataFormatada);
		System.out.println(dataParseada);
	}
}
