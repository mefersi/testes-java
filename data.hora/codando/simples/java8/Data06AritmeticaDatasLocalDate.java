package codando.simples.java8;

import java.time.LocalDate;

public class Data06AritmeticaDatasLocalDate {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2022, 01, 31);
		System.out.println(date);
		
		// para adicionar um periodo
		LocalDate plusDays = date.plusDays(0).plusMonths(1);
		System.out.println(plusDays);
		
	}
}
