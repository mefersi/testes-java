package banco.entities;

public class ContaPoupanca extends Conta implements Extrato {
	
	private ExtratoUtil extrato;

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void transfere(double valor, Conta destino) {
		super.saca(valor);
		destino.deposita(valor);
	}

	@Override
	public String extratoConta(Conta c) {
		return extrato.geraExtrato(c);
	}

	

}
