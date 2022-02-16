package model;

public class ContaCorrente extends Conta implements Extrato {

	private double limiteSaque;
	private ExtratoUtil extrato;

	public double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
		this.extrato = new ExtratoUtil();
	}

	@Override
	public void saca(double valor) {
		if (valor > limiteSaque) {
			throw new ValorInvalidoException("Valor de saque superior ao limite");
		}
		if (valor <= 0) {
			throw new ValorInvalidoException("Valor de saque deve ser maior que zero");
		}
		super.saca(valor);
	}

	@Override
	public void transfere(double valor, Conta destino) {
		this.saca(valor - 0.50);
		destino.deposita(valor);
	}

	@Override
	public String exibeExtrato(Conta c) {
		return extrato.geraExtrato(c);
	}

	@Override
	public String toString() {
		return "ContaCorrente, " + super.toString();
	}

}
