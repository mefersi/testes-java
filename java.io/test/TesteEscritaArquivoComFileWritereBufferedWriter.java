package test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaArquivoComFileWritereBufferedWriter {

	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(
				new FileWriter("C:\\Users\\jaque\\OneDrive\\Documentos\\JavaAluraTests\\arquivo4.txt"));

		bw.write("Texto jajhajhahahahaahajjajajajajajajajajakjakjakjakjakjkaka");
		bw.newLine();
		bw.write("gddhghdhdhdhddhhdhdhdhgdhgghdhgdghhgdhgdhgdhdhdhghdhdhhgdhdhh");

		bw.close();
	}
}
