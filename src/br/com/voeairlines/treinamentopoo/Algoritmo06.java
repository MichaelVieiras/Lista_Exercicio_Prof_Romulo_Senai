package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritmo06 {
	
	Scanner scan = new Scanner(System.in);

	public void resultado() {
		System.out.println("Algoritmo 6");
		System.out.println("Ler dois números inteiros e imprimi-los.");
		System.out.println("Digite o primeiro numero: ");
		int num1 = scan.nextInt();
		System.out.println("Digite o primeiro numero: ");
		int num2 = scan.nextInt();
		System.out.println("\nResultado: ");
		System.out.println(num1 + " e " + num2);
	}
}
