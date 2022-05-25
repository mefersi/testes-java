package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TesteSimpleDateFormat {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String dataFormatada = sdf.format(date);
		System.out.println(dataFormatada);

		Calendar calendar = Calendar.getInstance();
		Date calendarAsDate = calendar.getTime();
		String calendarFormatado = sdf.format(calendarAsDate);
		System.out.println(calendarFormatado);
	}
}
