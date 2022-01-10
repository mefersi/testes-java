package test;

import model.ClienteLoja;
import model.SistemaSite;

public class TesteLoja {

	public static void main(String[] args) {
		
		ClienteLoja cliente = new ClienteLoja();
		cliente.setNome("Maria Silva");
		cliente.setCpf("222222222");
		cliente.setUsuario("maria");
		cliente.autentica(123);
		cliente.setSenha(333);
		//cliente.autentica(123);
		System.out.println(cliente.autentica(333));
		
		SistemaSite sistema = new SistemaSite();
		sistema.autenticacao(cliente);
	
		
	}
}
