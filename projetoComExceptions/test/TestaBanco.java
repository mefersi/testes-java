package banco.application;

import banco.entities.Cliente;
import banco.entities.Conta;
import banco.entities.ContaCorrente;
import banco.entities.ExtratoUtil;
import banco.entities.ValorInvalidoException;

public class Pr01TestaBanco {

	public static void main(String[] args) {
		
		ContaCorrente cc1 = new ContaCorrente(1231, 1231);
		Cliente c1 = new Cliente();
		
		try {
			c1.setNome("Maria Silva");
			cc1.deposita(250.0);
			cc1.setTitular(c1);
			//System.out.println(cc1.extratoConta(cc1));
			
			ExtratoUtil extrato = new ExtratoUtil();
			System.out.println(extrato.geraExtrato(cc1));
			
		} catch (ValorInvalidoException | IllegalArgumentException | NullPointerException e) {
			System.out.println("Exception: " + e.getClass() + " " + e.getMessage());
		} 
		
		System.out.println("Total de contas criadas: " + Conta.getTotalContasNoBanco());
		
	}
	
}
