package test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TestesLocaleESimpleDateFormat {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE dd/MMMM/yyyy");
		SimpleDateFormat sdf1 = new SimpleDateFormat("EEEE dd/MMMM/yyyy", Locale.ENGLISH);
		SimpleDateFormat sdf2 = new SimpleDateFormat("EEEE dd/MMMM/yyyy", Locale.FRANCE);
		SimpleDateFormat sdf3 = new SimpleDateFormat("EEEE dd/MMMM/yyyy", Locale.GERMAN);
		
		Date data = new Date();
		
		System.out.println(sdf.format(data));
		System.out.println(sdf1.format(data));
		System.out.println(sdf2.format(data));
		System.out.println(sdf3.format(data));
	}
}
