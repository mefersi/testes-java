package test;

import java.io.IOException;
import java.io.PrintStream;

public class TesteEscreverArquivoPrintStream {

	public static void main(String[] args) throws IOException {
		
		PrintStream ps = new PrintStream("C:\\Users\\jaque\\OneDrive\\Documentos\\JavaAluraTests\\escreverArquivoPrintStream.txt");
		
		ps.println("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
		ps.println();
		ps.println("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
		
		ps.close();
	}
}
