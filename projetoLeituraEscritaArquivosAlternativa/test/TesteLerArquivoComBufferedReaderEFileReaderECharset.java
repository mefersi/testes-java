package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TesteLerArquivoComBufferedReaderEFileReaderECharset {

	public static void main(String[] args) {

		String path = "C:\\Users\\jaque\\OneDrive\\Documentos\\JavaAluraTests\\testea.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path, StandardCharsets.UTF_8))) {
			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Erro ao ler aarquivo: + " + e.getMessage());
		}
	}
}
