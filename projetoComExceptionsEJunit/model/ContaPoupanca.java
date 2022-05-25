package model;

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
	public String exibeExtrato(Conta c) {
		return extrato.geraExtrato(c);
	}

	@Override
	public String toString() {
		return "ContaPoupanca, " + super.toString();
	}
}
