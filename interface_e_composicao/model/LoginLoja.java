package model;

public interface LoginLoja {

	void setUsuario(String usuario);
	void setSenha(int senha);
	boolean autentica(int senha);
}
