package codando.simples.api.legada;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Data4ComoSimpleDateFormatUsaLocale {

	public static void main(String[] args) {
		
		// para saber o default do locale na JVM
		System.out.println(Locale.getDefault());
		
		// para mudar o locale (obs. muda o Locale para toda a aplicação)
//		Locale.setDefault(Locale.US);
//		Locale.setDefault(Locale.ENGLISH);
		
		// EEEE para imprimir o dia por escrito e MMMM para imprimir o mês por escrito
//		SimpleDateFormat sdf = new SimpleDateFormat("EEEE dd/MMMM/yyyy");
		
		// para setar o Locale para apenas um ponto da aplicação, podemos passar o Locale no contrutor do sdf
//		SimpleDateFormat sdf = new SimpleDateFormat("EEEE dd/MMMM/yyyy", Locale.ENGLISH);
		
		// É possivel criar o próprio Locale
		Locale meuLocale = new Locale("pt");
		
		// mudando para o locale personalizado
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE dd/MMMM/yyyy", meuLocale);
		
		// usando o sdf com o locale em ingles
		SimpleDateFormat sdf2 = new SimpleDateFormat("EEEE dd/MMMM/yyyy", Locale.ENGLISH);
		
		// é possivel setar também o timezone
		sdf2.setTimeZone(TimeZone.getTimeZone("Australia/Sydney"));	
		
		Date date = new Date();
		
		System.out.println(sdf.format(date));
		System.out.println(sdf2.format(date));
	}
}
