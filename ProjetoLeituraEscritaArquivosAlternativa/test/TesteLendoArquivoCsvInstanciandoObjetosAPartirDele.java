package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Conta;
import model.ContaCorrente;

public class TesteLendoArquivoCsvInstanciandoObjetosAPartirDele {

	public static void main(String[] args) {

		String path = "C:\\Users\\jaque\\OneDrive\\Documentos\\JavaAluraTests\\contasbanco.csv";

		List<Conta> contas = new ArrayList<Conta>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				String[] vect = line.split(",");
				int agencia = Integer.parseInt(vect[0]);
				int numero = Integer.parseInt(vect[1]);

				Conta conta = new ContaCorrente(agencia, numero);
				contas.add(conta);

				line = br.readLine();
			}

			contas.sort((conta1, conta2) -> Integer.compare(conta1.getNumero(), conta2.getNumero()));

			System.out.println("CONTAS:");
			for (Conta conta : contas) {
				System.out.println(conta);
			}

		} catch (IOException e) {
			System.out.println("Erro ao ler arquivo: " + e.getMessage());
		}
	}
}
