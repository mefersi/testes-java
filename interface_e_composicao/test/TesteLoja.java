package application;

import entities.Cliente3;
import entities.SistemaSite;

public class Pr01testeLoja {

	public static void main(String[] args) {
		
		Cliente3 cliente = new Cliente3();
		cliente.setNome("Maria Silva");
		cliente.setCpf("222222222");
		cliente.setUsuario("maria");
		cliente.setSenha(333);
		//cliente.autentica(333);
		
		SistemaSite sistema = new SistemaSite();
		sistema.autenticacao(cliente);
	
		
	}
}
