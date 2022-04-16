package codando.simples.java8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.ResolverStyle;
import java.time.temporal.ChronoField;
import java.util.Date;

public class Data10ParseandoDatasComDateTimeFormatter3 {

	public static void main(String[] args) throws ParseException {
		
		// o sdf trabalha de forma leniente, ou seja, vai encaixando os valores dentro da data que ele gerar
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = sdf.parse("33/01/2022"); // gera 02 de fev
		System.out.println(sdf.format(date));
		
		// o dtf não é leniente, dá erro se não for passado um formato válido
//		DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		LocalDate.parse("33/01/2022");
		
		// fica de forma leniente
		DateTimeFormatter lenientParser = DateTimeFormatter.ofPattern("dd/MM/yyyy")
				.withResolverStyle(ResolverStyle.LENIENT);
		LocalDate date1 = LocalDate.parse("33/01/2022", lenientParser);
		System.out.println(date1);
		
		// RssolverrStyle.SMART por padrão, no exemplo vai até o último dia de fevereiro de forma inteligente
		DateTimeFormatter defaultParser = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date2 = LocalDate.parse("31/02/2022", defaultParser);
		System.out.println(date2);
		
		// Fica mais restrito, gera uma exceção por não haver o dia 31 de fev
//		DateTimeFormatter strictParser = DateTimeFormatter.ofPattern("dd/MM/yyyy")
//				.withResolverStyle(ResolverStyle.STRICT);
//		LocalDate date3 = LocalDate.parse("33/02/2022", strictParser);
//		System.out.println(date3);
		
		// ou usa uuuu no lugar do yyyy ou, exclui o resolverstyle.STRICT, ou seta a era via dtfbuilder
		DateTimeFormatter strictParser2 = new DateTimeFormatterBuilder()
				.appendPattern("dd/MM/yyyy")
				.parseDefaulting(ChronoField.ERA, 1)
				.toFormatter()
				.withResolverStyle(ResolverStyle.STRICT);
		LocalDate date4 = LocalDate.parse("15/02/2022", strictParser2);
		System.out.println(date4);
	}
}
