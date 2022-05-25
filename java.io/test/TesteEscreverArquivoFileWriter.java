package test;

import java.io.FileWriter;
import java.io.IOException;

public class TesteEscreverArquivoFileWriter {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter(
				"C:\\Users\\jaque\\OneDrive\\Documentos\\JavaAluraTests\\escreverArquivoFileWriter.txt");

		fw.write("cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
		fw.write(System.lineSeparator());
		fw.write("cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");

		fw.close();
	}
}
