package application;

import entities.Animal1;
import entities.Cachorro1;
import entities.Gato1;

public class Pr02TesteAnimais {

	public static void main(String[] args) {
		
		Animal1 c = new Cachorro1();
		Animal1 g = new Gato1();
		
		System.out.println(c.comunica());
		System.out.println(g.comunica());
	}
}
