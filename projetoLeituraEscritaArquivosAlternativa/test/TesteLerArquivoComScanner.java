package test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TesteLerArquivoComScanner {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\jaque\\OneDrive\\Documentos\\JavaAluraTests\\testea.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Erro ao ler arquivo: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
