package test;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TesteAddRemovPeriodosDeDatas {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(2021, Calendar.DECEMBER, 7);
//		calendar.add(Calendar.DAY_OF_MONTH, 90);
		Date data1 = calendar.getTime();
		System.out.println(data1);
		
		Calendar calendar2 = Calendar.getInstance();
		calendar2.set(2022, Calendar.MARCH, 7);
		Date data2 = calendar2.getTime();
		System.out.println(data2);
		
		long timestamp = data2.getTime() - data1.getTime();
		long quantidadeDeDias = TimeUnit.MILLISECONDS.toDays(timestamp);
		System.out.println("Quantidade de dias entre as datas: " + quantidadeDeDias);
		
		
	}
}
