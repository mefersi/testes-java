package codando.simples.api.legada;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Data3FormatandoComSimpleDateFormat {

	public static void main(String[] args) {
		
	/**
	 * Simpledateformat aceita um date, mas, da erro se passar para ele o calendar
	 * Para isso é necessario converter de calendar para date e aí sim usar o simpledateformat
	 */
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		// padrão ISO8601
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
		Date date = new Date();
		String dataFormatada = sdf.format(date);
		System.out.println(dataFormatada);
		
		Calendar calendar = Calendar.getInstance();
		Date calendarAsDate = calendar.getTime();
		String calendarFormatado = sdf.format(calendarAsDate);
		System.out.println(calendarFormatado);
	}
}
