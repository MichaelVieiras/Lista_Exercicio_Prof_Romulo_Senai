package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritmo12 {
	Scanner scan = new Scanner(System.in);
	public void resultado() {
		System.out.println("Algoritmo 12");
		System.out.println("Entrar com dois números reais e imprimir a média aritmética com a mensagem “média” antes do resultado");
		System.out.print("Digite um valor: ");
		double num1 = scan.nextDouble();
		System.out.print("Digite outro valor: ");
		double num2 = scan.nextDouble();
		double media = (num1 + num2) / 2;
		System.out.println("\nResultado: ");
		System.out.println("Média: " + media);
	}
}
