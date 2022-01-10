package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Cliente;
import model.Conta;
import model.ContaCorrente;

public class TesteOrdenacaoComparable {

	public static void main(String[] args) {
		
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
		
		List<Conta> lista = new ArrayList<Conta>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		System.out.println("-----------------------------------------------");
		
		//lista.sort(null);
		Collections.sort(lista);
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
	}
}
