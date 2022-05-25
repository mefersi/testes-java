package model;

public class SistemaSite {

	private int senha = 333;

	public void autenticacao(LoginLoja l) {
		boolean autenticou = l.autentica(this.senha);
		if (autenticou) {
			System.out.println("Pode entrar no sistema!");
		} else {
			System.out.println("Nao pode entrar no sistema!");
		}
	}
}
