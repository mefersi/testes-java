package test;

import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ExtratoUtil;
import model.ValorInvalidoException;

public class TestaBanco {

	public static void main(String[] args) {
		
		ContaCorrente cc1 = new ContaCorrente(1231, 1231);
		Cliente c1 = new Cliente();
		
		try {
			c1.setNome("Maria Silva");
			cc1.deposita(250.0);
			cc1.setTitular(c1);
//			System.out.println(cc1.extratoConta(cc1));
			
			ExtratoUtil extrato = new ExtratoUtil();
			System.out.println(extrato.geraExtrato(cc1));
			
		} catch (ValorInvalidoException | IllegalArgumentException | NullPointerException e) {
			System.out.println("Exception: " + e.getClass() + " " + e.getMessage());
		} 
		
		System.out.println("Total de contas criadas: " + Conta.getTotalContasNoBanco());
		
	}
	
}
