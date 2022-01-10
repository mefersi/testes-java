package test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscreverArquivo {

	public static void main(String[] args) throws IOException {
		
		OutputStream fos = new FileOutputStream("C:\\Users\\jaque\\OneDrive\\Documentos\\JavaAluraTests\\arquivo3.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Um texto qualquer");
		bw.newLine();
		bw.newLine();
		bw.write("Outro texto qualquer!");
		
		bw.close();
	}
}
