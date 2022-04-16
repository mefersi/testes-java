package codando.simples.api.legada;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data5ParsearUmaDataComSimpleDateFormat2 {

	public static void main(String[] args) throws ParseException {
		
		// por questão de timezone colocamos os XXX no final do formatador para indicar que estamos querendo parsear também o timezone
		SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd'T'HH:mmXXX");
		//UTC -3:00 em Brasília
		String isoDate8601 = "2022-02-09T13:09Z"; // Z significa UTC onde o offset é 0:00
		Date date = parser.parse(isoDate8601);
		System.out.println(date);
	}
}
