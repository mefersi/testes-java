package entities;

public class AutenticaUsuario {
	
	private int senha;

	public void setUsuario(String usuario) {
		if (usuario == null) {
			System.out.println("Usuario nao pode ser nulo!");
		} else {
			System.out.println("Usuario inserido com sucesso!");
		}		
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
}
