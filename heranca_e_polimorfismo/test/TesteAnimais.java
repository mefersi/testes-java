package test;

import model.Animal1;
import model.Cachorro1;
import model.Gato1;

public class TesteAnimais {

	public static void main(String[] args) {
		
		Animal1 c = new Cachorro1();
		Animal1 g = new Gato1();
		
		System.out.println(c.comunica());
		System.out.println(g.comunica());
	}
}
