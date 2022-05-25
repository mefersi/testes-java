package test;

public class TesteArray {

	public static void main(String[] args) {

		String[] nomes = new String[6];
		nomes[0] = "Nomes:";
		nomes[1] = "Regina";
		nomes[2] = "Cristiane";
		nomes[3] = "Yuri";
		nomes[4] = "Jaqueline";
		nomes[5] = "Julia";

		for (String nome : nomes) {
			System.out.println(nome);
		}

		int[] idades = new int[5];
		idades[0] = 55;
		idades[1] = 33;
		idades[2] = 26;
		idades[3] = 26;
		idades[4] = 02;

		System.out.println("\nIdades:");
		for (int idade : idades) {
			System.out.println(idade);
		}

		int[] soma = new int[11];

		for (int i = 0; i < soma.length; i++) {
			soma[i] = i + i;
		}

		System.out.println();
		for (int s : soma) {
			System.out.println(s);
		}
	}
}
