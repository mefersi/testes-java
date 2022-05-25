package test;

import java.util.ArrayList;

import model.Pessoa;

public class TesteEquals {

	public static void main(String[] args) {

		ArrayList<Pessoa> lista = new ArrayList<Pessoa>();

		Pessoa p1 = new Pessoa();
		p1.setNome("Regina");

		Pessoa p2 = new Pessoa();
		p2.setNome("Cristiane");

		Pessoa p3 = new Pessoa();
		p3.setNome("Julia");

		Pessoa p4 = new Pessoa();
		p4.setNome("Regina");

		lista.add(p1);
		lista.add(p2);
		lista.add(p3);

		System.out.println("Regina existe na lista? " + lista.contains(p4));
		System.out.println("p1 � igual p4? " + p1.equals(p4));
	}
}
