package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escreva sua melhor frase: ");
		String frase = scan.nextLine();
		
		String[] word = frase.split(" ");
		
		for(int i = (word.length - 1); i >= 0; i--) {
			System.out.print(word[i] + " ");
		}
		
		/* Caixa alta e baixa */
		System.out.println("\n" + frase.toUpperCase());
		System.out.println(frase.toLowerCase());
	}

}
