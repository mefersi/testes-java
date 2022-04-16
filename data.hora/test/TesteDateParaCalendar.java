package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import model.Artigo;

public class TesteDateParaCalendar {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		Artigo artigo = new Artigo("Medições");
		Date data = formato.parse("08/02/2022");
		artigo.setDataDePublicacao(data);
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
		
		System.out.println(formato.format(calendar.getTime()));
		
		System.out.println("Ano: " + calendar.get(Calendar.YEAR));
		System.out.println("Mês: " + calendar.get(Calendar.MONTH));
		System.out.println("Dia: " + calendar.get(Calendar.DAY_OF_MONTH));
		
		//----------------------------------------------------------------------------------------
		System.out.println("==================================================================");
		
		Artigo artigo2 = new Artigo("Radiações");
		Date data2 = formato.parse("09/02/2022");
		artigo2.setDataDePublicacao(data2);
		
		Calendar calendar2 = Calendar.getInstance();
		calendar.setTime(data2);
		
		System.out.println(formato.format(calendar2.getTime()));

		System.out.println("Ano: " + calendar.get(Calendar.YEAR));
		System.out.println("Mês: " + calendar.get(Calendar.MONTH));
		System.out.println("Dia: " + calendar.get(Calendar.DAY_OF_MONTH));
		
		//----------------------------------------------------------------------------------------
		System.out.println("==================================================================");
		
		Artigo artigo3 = new Artigo("Física");
		Date data3 = formato.parse("10/02/2022");
		artigo3.setDataDePublicacao(data3);
		
		Calendar calendar3 = Calendar.getInstance();
		calendar3.setTime(data3);
		
		System.out.println(formato.format(calendar3.getTime()));
		
		System.out.println("Ano: " + calendar.get(Calendar.YEAR));
	}
}
