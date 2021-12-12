package application;

import entities.SerHumano;
import entities.SerVivo;

public class Pr01TesteServivoPessoa {

	public static void main(String[] args) {
		
		SerVivo sv = new SerHumano();
		System.out.println(sv.nomeClasse());
	}
}
