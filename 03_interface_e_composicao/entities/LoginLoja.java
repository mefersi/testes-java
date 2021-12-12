package entities;

public interface LoginLoja {

	public void setUsuario(String usuario);
	public void setSenha(int senha);
	public boolean autentica(int senha);
}
