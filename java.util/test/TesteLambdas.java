package test;

import java.util.ArrayList;
import java.util.List;

import model.Cliente;
import model.Conta;
import model.ContaCorrente;

public class TesteLambdas {

	public static void main(String[] args) {
		
		List<Conta> contas = new ArrayList<Conta>();
		
		Conta cc1 = new ContaCorrente(11, 22);
		Cliente c1 = new Cliente();
		c1.setNome("Regina");
		cc1.setTitular(c1);
		cc1.deposita(100.0);

		Conta cc2 = new ContaCorrente(11, 11);
		Cliente c2 = new Cliente();
		c2.setNome("Cristiane");
		cc2.setTitular(c2);
		cc2.deposita(100.0);

		Conta cc3 = new ContaCorrente(11, 33);
		Cliente c3 = new Cliente();
		c3.setNome("Yuri");
		cc3.setTitular(c3);
		cc3.deposita(100.0);
		
		Conta cc4 = new ContaCorrente(11, 44);
		Cliente c4 = new Cliente();
		c4.setNome("Julia");
		cc4.setTitular(c4);
		cc4.deposita(100.0);
		
		Conta cc5 = new ContaCorrente(11, 55);
		Cliente c5 = new Cliente();
		c5.setNome("Jaqueline");
		cc5.setTitular(c5);
		cc5.deposita(100.0);

		contas.add(cc1);
		contas.add(cc2);
		contas.add(cc3);
		contas.add(cc4);
		contas.add(cc5);
		
		//contas.sort((conta1, conta2) -> Integer.compare(conta1.getNumero(), conta2.getNumero()));
		
		contas.sort((conta1, conta2) -> conta1.getTitular().getNome().compareTo(conta2.getTitular().getNome()));
		
		contas.forEach((conta) -> System.out.println(conta + ", " + conta.getTitular().getNome()));
		
	}
}
