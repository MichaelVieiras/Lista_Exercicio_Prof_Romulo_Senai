package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritmo09 {
	Scanner scan = new Scanner(System.in);
	public void resultado() {
		System.out.println("Algoritmo 9");
		System.out.println("Ler dois números inteiros e imprimir a soma. Antes do resultado, deverá aparecer a mensagem: Soma");
		System.out.print("Digite o 1º numero: ");
		int num1 = scan.nextInt();
		System.out.print("Digite o 2º numero: ");
		int num2 = scan.nextInt();
		int soma = num1 + num2;
		System.out.println("\nResultado: ");
		System.out.println("Soma: " + soma);
	}
}
