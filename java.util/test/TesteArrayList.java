package test;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteArrayList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<String>();
		
		System.out.print("Quantos nomes deseja adicionar na lista? ");
		int n = sc.nextInt();
		
		System.out.println("Digite os nomes:");
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String nome = sc.nextLine();
			list.add(nome);
		}
		
		System.out.println("\nNomes: ");
		for (String nome : list) {
			System.out.println(nome);
		}
		
		ArrayList<String> otherList = new ArrayList<String>(list);
		otherList.add("Virgulino");
		otherList.add("Abstencio");
		
		System.out.println("\nOutra lista: ");
		for (String nome : otherList) {
			System.out.println(nome);
		}
	}
}
