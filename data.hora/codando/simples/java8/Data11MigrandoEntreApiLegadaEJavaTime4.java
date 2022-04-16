package codando.simples.java8;

import java.time.ZoneId;
import java.util.TimeZone;

public class Data11MigrandoEntreApiLegadaEJavaTime4 {

	public static void main(String[] args) {
		
		// converter de timezone para zoneid
		TimeZone timeZone = TimeZone.getTimeZone("America/Sao_Paulo");
		ZoneId zoneId = timeZone.toZoneId();
		System.out.println(zoneId);
		
	}
}
