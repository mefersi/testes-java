package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TesteCalendarParaDate {

	public static void main(String[] args) {
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Calendar calendar = Calendar.getInstance();
		
		calendar.setLenient(false);
		calendar.set(Calendar.YEAR, 2022);
		calendar.set(Calendar.MONTH, 2);
		calendar.set(Calendar.DAY_OF_MONTH, 8);
		
		Date time = calendar.getTime();
		System.out.println(formato.format(time));
	}
}
