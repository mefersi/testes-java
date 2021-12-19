package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import model.Cliente;
import model.Conta;
import model.ContaCorrente;

public class TesteClassesAnonimas2 {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<String>();
		
		lista.add("Regina");
		lista.add("Cristiane");
		lista.add("Yuri");
		lista.add("Jaqueline");
		lista.add("Julia");
		lista.add("Ramona");
		lista.add("Sky");
		lista.add("Luck");
		lista.add("Pretinho");
		
		lista.sort(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		});
		
		for (String s : lista) {
			System.out.println(s);
		}	
	}
}
