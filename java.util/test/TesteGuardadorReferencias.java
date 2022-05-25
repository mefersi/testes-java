package test;

import model.Conta;
import model.ContaCorrente;
import model.GuardadorDeReferenciasArray;

public class TesteGuardadorReferencias {

	public static void main(String[] args) {

		GuardadorDeReferenciasArray guardador = new GuardadorDeReferenciasArray();
		Conta cc1 = new ContaCorrente(11, 11);
		guardador.adiciona(cc1);

		System.out.println(guardador.getQtdElementos());

		Conta ref = (Conta) guardador.getReferencia(0);
		System.out.println(ref.getNumero());
	}
}
