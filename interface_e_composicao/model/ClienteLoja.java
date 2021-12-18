package entities;

public class Cliente3 extends Pessoa implements LoginLoja {

	private String sexo;
	private AutenticaUsuario autenticador;
	
	public Cliente3() {
		autenticador = new AutenticaUsuario();
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public void setUsuario(String usuario) {
		this.autenticador.setUsuario(usuario);
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return autenticador.autentica(senha);
	}
}
