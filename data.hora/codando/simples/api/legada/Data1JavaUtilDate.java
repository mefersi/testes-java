package codando.simples.api.legada;

import java.util.Date;
import java.util.TimeZone;

public class Data1JavaUtilDate {

	public static void main(String[] args) {
		Date now = new Date(); // dentro dele h� um timestamp
		System.out.println("Data de agora: " + now); // � exibido bonitinho por conta do ToString

		// O valor do timestamp � o mesmo, independentemente do timezone, s� muda a
		// representa��o da data
		System.out.println("Timestamp: " + now.getTime());

		// O date utiliza o timezone padr�o da JVM
		System.out.println("Timezone da JVM: " + TimeZone.getDefault().getID());

		System.out.println(
				"Timestamp: " + now.getTime() + " => Date: " + now + " => Timezone: " + TimeZone.getDefault().getID());

		// year - 1900
		// 2021 - 1900 = 121
		// Date date = new Date(2022, 02, 03);
		// o m�s come�a em zero
		@SuppressWarnings("deprecation")
		Date date = new Date(121, 01, 03);
		System.out.println(date);
	}
}
