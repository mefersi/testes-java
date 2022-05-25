package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.ProdutoArquivo;

public class TesteLerEEscreverArquivoCsv {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<ProdutoArquivo> produtos = new ArrayList<ProdutoArquivo>();

		String arquivoOrigemPath = "C:\\Users\\jaque\\OneDrive\\Documentos\\JavaAluraTests\\produtos.csv";

		File arquivoOrigem = new File(arquivoOrigemPath);
		String pastaOrigemPath = arquivoOrigem.getParent();

		boolean criarPastaSucess = new File(pastaOrigemPath + "\\saida").mkdir();
		System.out.println("Diret�rio criado com sucesso!" + criarPastaSucess);

		String arquivoDestinoPath = pastaOrigemPath + "\\saida\\saidaProdutos.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(arquivoOrigemPath))) {

			String itemCsv = br.readLine();
			while (itemCsv != null) {

				String[] fields = itemCsv.split(",");
				String nome = fields[0];
				double preco = Double.parseDouble(fields[1]);
				int quantidade = Integer.parseInt(fields[2]);

				produtos.add(new ProdutoArquivo(nome, preco, quantidade));

				itemCsv = br.readLine();
			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoDestinoPath))) {

				for (ProdutoArquivo p : produtos) {
					bw.write(p.getNome() + ", " + String.format("%.2f", p.total()));
					bw.newLine();
				}
				System.out.println(arquivoDestinoPath + "Arquivo dewstino criado!");

			} catch (IOException e) {
				System.out.println("Erro na escrita do arquivo: " + e.getMessage());
			}

		} catch (IOException e) {
			System.out.println("Erro na leitura do arquivo: " + e.getMessage());
		}
	}
}
