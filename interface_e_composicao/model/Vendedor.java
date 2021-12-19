package model;

public class Vendedor extends PessoaLoja implements LoginLoja {

	private int codigo;
	private AutenticaUsuario autenticador;
	
	public Vendedor() {
		autenticador = new AutenticaUsuario();
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
