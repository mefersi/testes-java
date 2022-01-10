package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import model.Cliente;
import model.Endereco;

public class Teste2DesserializacaoCliente {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
//		Cliente c = new Cliente();
//		c.setNome("Yuri Stefani");
//		c.setEmail("yuri@gmai.com");
//		c.setCpf("22222222222");
//		
//		Endereco endereco = new Endereco();
//		endereco.setRua("Rua Oliveira");
//		endereco.setNumero("11");
//		endereco.setComplemento("Casa verde");
//		endereco.setBairro("Flores");
//		endereco.setCidade("São Paulo");
//		endereco.setEstado("SP");
//		endereco.setPais("Brasil");
//		
//		c.setEndereco(endereco);
//		
//		ObjectOutputStream oos = new ObjectOutputStream(
//				new FileOutputStream("C:\\Users\\jaque\\OneDrive\\Documentos\\JavaAluraTests\\clienteSerializacao.bin"));
//		oos.writeObject(c);
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("C:\\Users\\jaque\\OneDrive\\Documentos\\JavaAluraTests\\clienteSerializacao.bin"));
		Cliente c = (Cliente) ois.readObject();
		ois.close();
		System.out.println(c.getNome());
		System.out.println(c.getEmail());
		System.out.println(c.getEndereco());
	}
}
