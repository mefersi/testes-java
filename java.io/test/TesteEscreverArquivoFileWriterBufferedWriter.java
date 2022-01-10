package test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscreverArquivoFileWriterBufferedWriter {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\jaque\\OneDrive\\"
				+ "Documentos\\JavaAluraTests\\escreverArquivoFileWritterBufferedWriter.txt"));
		
		bw.write("ddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
		bw.newLine();
		bw.write("ddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
		
		bw.close();
	}
}
