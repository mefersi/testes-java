package test;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscreverArquivoPrintWriter {

	public static void main(String[] args) throws IOException {

		PrintWriter pw = new PrintWriter(
				"C:\\Users\\jaque\\OneDrive\\Documentos\\JavaAluraTests\\escreverArquivoPrintWriter.txt");

		pw.println("ahahahahahahahahahahahahahhahahahahahahhahahahah");
		pw.println();
		pw.println("ahahahahahahhahahahahahahahahahahahhahahahahhahahha");

		pw.close();
	}
}
