package test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import model.Author;

public class TesteAuthor {

	public static void main(String[] args) {

		Author caique = new Author("Caique Jhones");
		Author junior = new Author("Junior dos Santos");
		Author flavio = new Author("Fl�vio Jos�");

		List<Author> autores = Arrays.asList(caique, junior, flavio);

		Consumer<Author> comLambda = a -> a.imprime();
		Consumer<Author> comReference = Author::imprime;

		autores.forEach(comLambda);
		System.out.println("-------------");
		autores.forEach(comReference);
	}
}