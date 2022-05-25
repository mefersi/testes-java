package codando.simples.api.legada;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data5ParsearUmaDataComSimpleDateFormat3 {

	public static void main(String[] args) throws ParseException {

		// assim como o calendar o sdf tamb�m � leniente
		SimpleDateFormat parser = new SimpleDateFormat("dd/MM/yyyy");
		parser.setLenient(false);

		Date date = parser.parse("28/02/2022");
		System.out.println(date);
	}
}
