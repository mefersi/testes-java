package model;

public class Vendedor extends Pessoa {

	private double salario;
	
	public Vendedor() {
	}

	public Vendedor(String nome, String cpf, String email, int telefone, double salario) {
		super(nome, cpf, email, telefone);
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
