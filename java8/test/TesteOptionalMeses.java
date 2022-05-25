package test;

import java.util.Optional;

public class TesteOptionalMeses {

	public static void main(String[] args) {

		Optional<String> mesNovembro = recupereNomeMesOptional(11);
		System.out.println(mesNovembro);

		Optional<String> mesTreze = recupereNomeMesOptional(13);
		System.out.println(mesTreze);
	}

	private static Optional<String> recupereNomeMesOptional(int mes) {

		switch (mes) {
		case 1:
			return Optional.of("Janeiro");
		case 2:
			return Optional.of("Fevereiro");
		case 3:
			return Optional.of("Mar�o");
		case 4:
			return Optional.of("Abril");
		case 5:
			return Optional.of("Maio");
		case 6:
			return Optional.of("Junho");
		case 7:
			return Optional.of("Julho");
		case 8:
			return Optional.of("Agosto");
		case 9:
			return Optional.of("Setembro");
		case 10:
			return Optional.of("Outubro");
		case 11:
			return Optional.of("Novembro");
		case 12:
			return Optional.of("Dezembro");
		default:
			return Optional.empty();
		}
	}
}
