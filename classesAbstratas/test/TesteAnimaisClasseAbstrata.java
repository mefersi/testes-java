package test;

import model.Animal2;
import model.Cachorro2;
import model.Cobra;
import model.Peixe;

public class TesteAnimaisClasseAbstrata {

	public static void main(String[] args) {

		Animal2 cachorro = new Cachorro2();
		Animal2 peixe = new Peixe();
		Animal2 cobra = new Cobra();

		System.out.println("Cachorro se movimenta: " + cachorro.movimenta());
		System.out.println("Peixe se movimenta: " + peixe.movimenta());
		System.out.println("Cobra se movimenta: " + cobra.movimenta());
	}
}
