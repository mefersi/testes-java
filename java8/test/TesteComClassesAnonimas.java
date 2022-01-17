package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public final class TesteComClassesAnonimas {

	public static void main(String[] args) {
		
		List<String> filmes = new ArrayList<String>();
		filmes.add("Nosferatu");
		filmes.add("Freaks");
		filmes.add("Um Sonho de Liberdade");
		filmes.add("Harry Potter");
		filmes.add("Megan is Missing");
		
		filmes.sort(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		});
		
		filmes.forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		});
	}
}
