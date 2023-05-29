package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		String[] nomes = new String[n];
		int[] idades = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa: ");
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
		}
		
		int maioridade = idades[0];
		int posicaoMaior = 0;
		
		for (int i = 0; i < n; i++) {
			if (idades[i] > maioridade) {
				maioridade = idades[i];
				posicaoMaior = i;
			}
		}
		
		System.out.printf("PESSOA MAIS VELHA: %s%n", nomes[posicaoMaior]);
		
		
		sc.close();

	}

}
