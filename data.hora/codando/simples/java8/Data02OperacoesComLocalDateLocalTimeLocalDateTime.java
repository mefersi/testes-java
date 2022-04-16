package codando.simples.java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;

public class Data02OperacoesComLocalDateLocalTimeLocalDateTime {

	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		System.out.println("Data de agora: " + now);
		LocalDate withMonth = now.withMonth(3).withDayOfMonth(12);
		System.out.println("Data alterada: " + withMonth);
		
		LocalTime now2 = LocalTime.now();
		System.out.println("Hora de agora: " + now2);
		LocalTime withHour = now2.withHour(22).withMinute(30);
		System.out.println("Hora alterada: " + withHour);
		
		// temporal adjuster é uma interface que podemos estar implementando para fazer o calculo que a gente deseja
		// temporal adjuster é a interface, temporal adjusters é a classe utilitária
		
		LocalDate date = LocalDate.of(2022, 1, 15);
		LocalDate ultimoDiaMes = date.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("Data: " + date);
		System.out.println("Ultimo dia do mês: " + ultimoDiaMes);
		LocalDate primeiroDiaDoMes = date.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("Primeiro doa do mês: " + primeiroDiaDoMes);
		
		System.out.println("----------------------------");
		System.out.println("Data de agora: " + now);
		DayOfWeek dayOfWeek = now.getDayOfWeek();
		System.out.println("Dia da semana: " + dayOfWeek);
		LocalDate proximoSabado = now.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println("Próximo sabado: " + proximoSabado);
		LocalDate sabadoAnterior = now.with(TemporalAdjusters.previous(DayOfWeek.SATURDAY));
		System.out.println("Sabado anterior: " + sabadoAnterior);
		
		System.out.println("------------------------------");
		
		// localTime não tem informações de data, por isso não devemos pedir infos de data
		// passando uma data ou hora no with
		
		LocalDate dataX = LocalDate.of(2022, 01, 01);
		
		LocalTime horaX = LocalTime.of(18, 00);
		
		LocalDateTime now3 = LocalDateTime.now();
		LocalDateTime dataAlterada = now3.with(dataX);
		System.out.println("Data alterada: " + dataAlterada);
		
		LocalDateTime now4 = LocalDateTime.now();
		LocalDateTime horaAlterada = now4.with(horaX);
		System.out.println("Hora alterada: " + horaAlterada);
		
		System.out.println("--------------------------------------------");
		
		// comparando duas datas
		
		LocalDate janeiro = LocalDate.of(2022, 01, 10);
		LocalDate fevereiro = LocalDate.of(2022, 02, 10);
		
		boolean janeiroEstaAntesDeFevereiro = janeiro.isBefore(fevereiro);
		System.out.println("Janeiro está antes de fevereiro? " + janeiroEstaAntesDeFevereiro);
		
		boolean janeiroEstaDepoisDeFevereiro = janeiro.isAfter(fevereiro);
		System.out.println("Janeiro está depois de fevereiro? " + janeiroEstaDepoisDeFevereiro);
		
		boolean equal = janeiro.isEqual(fevereiro);
		System.out.println("Janeiro é igual fevereiro? " + equal);
			
	}
}
