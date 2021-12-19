package test;

import model.SerHumano;
import model.SerVivo;

public class TesteServivoPessoa {

	public static void main(String[] args) {
		
		SerVivo sv = new SerHumano();
		System.out.println(sv.nomeClasse());
	}
}
