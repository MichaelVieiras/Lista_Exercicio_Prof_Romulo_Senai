package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritmo10 {
	Scanner scan = new Scanner(System.in);
	public void resultado() {
		System.out.println("Algoritmo 10");
		System.out.println("Ler dois números inteiros e imprimir o produto.");
		System.out.print("Digite o 1º numero: ");
		int num1 = scan.nextInt();
		System.out.print("Digite o 2º numero: ");
		int num2 = scan.nextInt();
		int produto = num1 * num2;
		System.out.println("\nResultado: ");
		System.out.println(produto);
	}
}
