package test;

import java.util.Optional;

public class TesteOptionalMetodos {

	public static void main(String[] args) {
		// ---------------------------------------------------------------- ofNullable

		// N�o � poss�vel chamar o m�todo of passando null como argumento, ele lan�a uma
		// exception
//		Optional<String> optionalStrNull1 = Optional.of(null); // lan�a NullPointerException
//		System.out.println(optionalStrNull1);

		// ofNullable aceita valor null e retorna um optional empty
		Optional<String> optionalStrNull2 = Optional.ofNullable(null); // retorna um optional empty
		System.out.println(optionalStrNull2);

		// ---------------------------------------------------------------- ifPresent

		Optional<String> optionalVazio = Optional.empty();
		Optional<String> optionalComValor = Optional.of("valor");

		// Com o m�todo ifPresent � poss�vel executar uma express�o lambda apenas se o
		// Optional tiver valor.
		optionalVazio.ifPresent(valor -> System.out.println("Vazio: " + valor)); // nao imprime nada pois o optional
																					// esta vazio
		optionalComValor.ifPresent(valor -> System.out.println("Com valor: " + valor)); // imprime pois o optional tem
																						// valor

		// ---------------------------------------------------------------- get

		System.out.println(optionalComValor.get()); // recupera o valor corretamente
//		System.out.println(optionalVazio.get()); // lan�a uma exce��o

		// ---------------------------------------------------------------- orElse e
		// orElseGet

		// recuperando um valor padr�o caso o optional esteja vazio
		Optional<String> optionalEmpty = Optional.empty();

		String orElse = optionalEmpty.orElse("Valor padr�o diretamente");// obt�m o valor diretamente
		String orElseGet = optionalEmpty.orElseGet(() -> {
			return "valor padr�o atrav�s de lambda";
		}); // obt�m o valor atraves de uma expressao lambda
		System.out.println(orElse);
		System.out.println(orElseGet);

		// ---------------------------------------------------------------- orElseThrow

		// Tamb�m � poss�vel lan�ar uma exce��o caso um valor n�o esteja presente no
		// Optional utilizando o m�todo orElseThrow.
		String orElseThrow1 = optionalComValor.orElseThrow(() -> new RuntimeException());
		System.out.println(orElseThrow1); // como o optional est� preenchido sai o valor dele

		String orElseThrow2 = optionalVazio.orElseThrow(() -> new RuntimeException("Optional vazio"));
		System.out.println(orElseThrow2); // lan�a uma excecao pois o optional est� vazio
	}
}
