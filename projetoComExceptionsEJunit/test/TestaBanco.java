package test;

import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ValorInvalidoException;

public class TestaBanco {

	public static void main(String[] args) {
		
		ContaCorrente cc1 = new ContaCorrente(1231, 1231);
		Cliente c1 = new Cliente();
		c1.setNome("Maria Silva");
		cc1.setTitular(c1);
		cc1.setLimiteSaque(500);
		
		try {
			cc1.deposita(250.0);
		} catch (ValorInvalidoException | IllegalArgumentException | NullPointerException e) {
			System.out.println("Exception: " + e.getClass() + " " + e.getMessage());
		} 
		
		System.out.println(cc1.exibeExtrato(cc1));
		cc1.saca(100);
//		ExtratoUtil extrato = new ExtratoUtil();
//		System.out.println(extrato.geraExtrato(cc1));
		
		System.out.println("Total de contas criadas: " + Conta.getTotalContasNoBanco());
		
	}
	
}
