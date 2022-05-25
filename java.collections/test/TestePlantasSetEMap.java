package test;

import model.Cacto;
import model.Planta;
import model.Suculenta;

public class TestePlantasSetEMap {
	public static void main(String[] args) {

		Planta plantas = new Planta("Plantas ornamentais");

		plantas.adiciona(new Cacto("Cacto Coroa de Frade", 101));
		plantas.adiciona(new Cacto("Cacto Pera", 102));
		plantas.adiciona(new Cacto("Cacto San Pedro", 103));

		Suculenta s1 = new Suculenta("Echeveria", 201);
		Suculenta s2 = new Suculenta("Planta Jade", 202);
		Suculenta s3 = new Suculenta("Babosa", 203);
		Suculenta s4 = new Suculenta("Dedo-de-mo�a", 204);
		Suculenta s5 = new Suculenta("Aeonium", 205);

		plantas.adiciona(s1);
		plantas.adiciona(s2);
		plantas.adiciona(s3);
		plantas.adiciona(s4);
		plantas.adiciona(s5);

		System.out.println("-------------------- Cactos: --------------------");
		plantas.getCactos().forEach(c -> System.out.println(c));
		System.out.println("-------------------- Suculentas: --------------------");
		plantas.getSuculentas().forEach(s -> System.out.println(s));
		System.out.println("-------------------------------------------------");
		System.out.println("Quem � a suculenta de codigo 201?");
		Suculenta suculenta = plantas.buscaSuculenta(201);
		System.out.println(suculenta);
	}
}
