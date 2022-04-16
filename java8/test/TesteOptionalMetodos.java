package test;

import java.util.Optional;

public class TesteOptionalMetodos {

	public static void main(String[] args) {
		//---------------------------------------------------------------- ofNullable
		
		// Não é possível chamar o método of passando null como argumento, ele lança uma exception
//		Optional<String> optionalStrNull1 = Optional.of(null); // lança NullPointerException
//		System.out.println(optionalStrNull1);
		
		// ofNullable aceita valor null e retorna um optional empty
		Optional<String> optionalStrNull2 = Optional.ofNullable(null); // retorna um optional empty
		System.out.println(optionalStrNull2);
		
		//---------------------------------------------------------------- ifPresent
		
		Optional<String> optionalVazio = Optional.empty();
		Optional<String> optionalComValor = Optional.of("valor");
		
		// Com o método ifPresent é possível executar uma expressão lambda apenas se o Optional tiver valor.
		optionalVazio.ifPresent(valor -> System.out.println("Vazio: " + valor)); //nao imprime nada pois o optional esta vazio
		optionalComValor.ifPresent(valor -> System.out.println("Com valor: " + valor)); // imprime pois o optional tem valor
		
		//---------------------------------------------------------------- get
		
		System.out.println(optionalComValor.get()); // recupera o valor corretamente
//		System.out.println(optionalVazio.get()); // lança uma exceção
		
		//---------------------------------------------------------------- orElse e orElseGet
		
		//recuperando um valor padrão caso o optional esteja vazio 
		Optional<String> optionalEmpty = Optional.empty();
		
		String orElse = optionalEmpty.orElse("Valor padrão diretamente");//obtém o valor diretamente
		String orElseGet = optionalEmpty.orElseGet(() -> {return "valor padrão através de lambda";}); //obtém o valor atraves de uma expressao lambda
		System.out.println(orElse);
		System.out.println(orElseGet);
		
		//---------------------------------------------------------------- orElseThrow
		
		//Também é possível lançar uma exceção caso um valor não esteja presente no Optional utilizando o método orElseThrow.
		String orElseThrow1 = optionalComValor.orElseThrow(() -> new RuntimeException());
		System.out.println(orElseThrow1); // como o optional está preenchido sai o valor dele
		
		String orElseThrow2 = optionalVazio.orElseThrow(() -> new RuntimeException("Optional vazio"));
		System.out.println(orElseThrow2); // lança uma excecao pois o optional está vazio
		
		
	}
}
