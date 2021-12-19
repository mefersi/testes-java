package model;

public abstract class Conta implements Comparable<Conta> {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int totalContasNoBanco;
	
	public Conta(int agencia, int numero) {
		totalContasNoBanco++;
		if (agencia >= 0 && numero <=0) {
			throw new IllegalArgumentException("Agencia e/ou numero da conta tem de ser maior que zero");
		}
		this.agencia = agencia;
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			throw new IllegalArgumentException("Agencia da conta tem de ser maior que zero");
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			throw new IllegalArgumentException("Numero da conta tem de ser maior que zero");
		}
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotalContasNoBanco() {
		return totalContasNoBanco;
	}
	
	public void deposita(double valor) {
		if (valor <=0) {
			throw new ValorInvalidoException("Valor de deposito deve ser maior que zero");
		}
		this.saldo += valor;
	}
	
	public void saca(double valor) {
		if (this.saldo < valor) {
			throw new ValorInvalidoException("Saldo insuficiente para realizar o saque");
		}
		if (valor <= 0) {
			throw new ValorInvalidoException("Valor de saque deve ser maior que zero");
		}
		this.saldo -= valor;
	}
	
	public abstract void transfere(double valor, Conta destino);

	@Override
	public int compareTo(Conta c) {
		return Integer.compare(this.numero, c.getNumero());
	}
	
	@Override
	public String toString() {
		return "Numero: " + this.numero + ", Agencia: " + this.agencia;
	}
}
