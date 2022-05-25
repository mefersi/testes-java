package test;

import model.Conta;
import model.ContaCorrente;

public class TesteArrayReferencias {

	public static void main(String[] args) {

		Conta[] contas = new Conta[5];

		contas[0] = new ContaCorrente(123, 111);
		contas[1] = new ContaCorrente(123, 222);
		contas[2] = new ContaCorrente(123, 333);
		contas[3] = new ContaCorrente(123, 444);
		contas[4] = new ContaCorrente(123, 555);

		for (Conta c : contas) {
			System.out.println(c.getNumero());
		}
	}
}
