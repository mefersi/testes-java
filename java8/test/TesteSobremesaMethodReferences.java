package test;

import java.util.Arrays;
import java.util.List;

import model.Sobremesa;

public class TesteSobremesaMethodReferences {

	public static void main(String[] args) {

		List<Sobremesa> sobremesas = Arrays.asList(new Sobremesa("Bolo de chocolate"), new Sobremesa("Sorvete"),
				new Sobremesa("Pudim"));

		sobremesas.forEach(Sobremesa::imprimeEmLetraMaiuscula);
	}
}
