package test;

public class TesteArrayFormaLiteral {

	public static void main(String[] args) {

		String[] nomes = { "Regina", "Cristiane", "Yuri", "Jaqueline", "Julia" };

		for (String nome : nomes) {
			System.out.println(nome);
		}

		int[] idades = { 55, 33, 26, 26, 02 };

		System.out.println("\nIdades:");
		for (int idade : idades) {
			System.out.println(idade);
		}
	}
}
