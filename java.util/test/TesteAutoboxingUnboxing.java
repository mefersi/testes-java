package test;

import java.util.ArrayList;

public class TesteAutoboxingUnboxing {

	public static void main(String[] args) {

		ArrayList<Integer> myInts = new ArrayList<Integer>();
		// autoboxing - converte de int (primitivo) para Integer (objeto)
		myInts.add(10);
		myInts.add(20);
		myInts.add(30);
		myInts.add(40);
		myInts.add(50);

		// autoboxing - converte de int (primitivo) para Integer (objeto)
		int idade = 26;
		Integer age = Integer.valueOf(idade);
		System.out.println(age);

		// unboxing - converte o objeto Integer para o primitivo int
		int n1 = myInts.get(0);
		System.out.println(n1);

		// unboxing - converte o objeto Integer para o primitivo int
		int anosDeVida = age.intValue();
		System.out.println(anosDeVida);
	}
}
