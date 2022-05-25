package test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscreverArquivoComBufferedWriterEFileWriter {

	public static void main(String[] args) {

		String[] linhas = new String[] { "System of a down", "Rammstein", "Opeth", "Alice in Chains" };
		String path = "C:\\Users\\jaque\\OneDrive\\Documentos\\JavaAluraTests\\testeb.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String s : linhas) {
				bw.write(s);
				bw.newLine();
			}
		} catch (IOException e) {
			System.out.println("Erro na escrita do arquivo: " + e.getMessage());
		}
	}
}
