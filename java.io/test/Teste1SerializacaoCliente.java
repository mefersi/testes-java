package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import model.Cliente;
import model.Endereco;

public class Teste1SerializacaoCliente {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Cliente c = new Cliente();
		c.setNome("Yuri Stefani");
		c.setEmail("yuri@gmai.com");
		c.setCpf("22222222222");

		Endereco endereco = new Endereco();
		endereco.setRua("Rua Oliveira");
		endereco.setNumero("11");
		endereco.setComplemento("Casa verde");
		endereco.setBairro("Flores");
		endereco.setCidade("S�o Paulo");
		endereco.setEstado("SP");
		endereco.setPais("Brasil");

		c.setEndereco(endereco);

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
				"C:\\Users\\jaque\\OneDrive\\Documentos\\JavaAluraTests\\clienteSerializacao.bin"));
		oos.writeObject(c);
		oos.close();
	}
}
