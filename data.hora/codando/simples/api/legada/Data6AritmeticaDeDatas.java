package codando.simples.api.legada;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Data6AritmeticaDeDatas {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(2022, Calendar.FEBRUARY, 9, 15, 0, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		
		// para adicionar um periodo de tempo basta passar como abaixo, para subtrair basta usar o sinal de menos "-"
		calendar.add(Calendar.DAY_OF_MONTH, 5);
		calendar.add(Calendar.HOUR_OF_DAY, 6);
		System.out.println(calendar.getTime());
		
		// se adicionar days of month ou seja, dias numa data, essa pode, dependendo dos dias adicionados, pular para outros meses
		Calendar calendar2 = Calendar.getInstance();
		calendar2.set(2022, Calendar.JANUARY, 31, 0, 0, 0);
		calendar2.add(Calendar.DAY_OF_MONTH, 31);
		System.out.println(calendar2.getTime());
		
		// se quiser incrementar só o mês melhor adicionar no campo month
		Calendar calendar3 = Calendar.getInstance();
		calendar3.set(2022, Calendar.JANUARY, 31, 0, 0, 0);
		calendar3.add(Calendar.MONTH, 1);
		System.out.println(calendar3.getTime());
		
		//-------------------------------------------------------------------------------------------------------------------------------
		// para calcular a quantidade de dias entre as duas datas
		Calendar calendar4 = Calendar.getInstance();
		calendar4.set(2022, Calendar.JANUARY, 9, 15, 25);
		
		Date date = calendar4.getTime();
		Date now = new Date();
		
		// a unica forma de calcular o periodo de tempo entre uma data e outra é subtraindo o timestamp de uma pela outra
		
		long timestamp = now.getTime() - date.getTime();
		long quantidadeDeDias = TimeUnit.MILLISECONDS.toDays(timestamp);
		
		System.out.println("----------------------------------------------------");
		System.out.println(date);
		System.out.println(now);
		System.out.println("Quantidade de dias entre as datas: " + quantidadeDeDias);
	}
}
