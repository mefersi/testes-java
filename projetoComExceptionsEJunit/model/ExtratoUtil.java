package model;

public class ExtratoUtil {

	public String geraExtrato(Conta c) {
		return "EXTRATO: " 
				+ "\nTitular: " + c.getTitular().getNome() 
				+ "\nAgencia: " + c.getAgencia() 
				+ "\nConta: " + c.getNumero() 
				+ "\nSaldo: " + c.getSaldo();
	}
}
