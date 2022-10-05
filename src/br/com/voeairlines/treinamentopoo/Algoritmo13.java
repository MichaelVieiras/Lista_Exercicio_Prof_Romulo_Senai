package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritmo13 {
	Scanner scan = new Scanner(System.in);
	public void resultado() {
		System.out.println("Algoritmo 13");
		System.out.println("Entrar com quatro números e imprimir a média ponderada, sabendo-se que os pesos são respectivamente: 1,2,3 e 4");
		System.out.print("Digite um valor: ");
		double num1 = scan.nextDouble();
		System.out.print("Digite o segundo valor: ");
		double num2 = scan.nextDouble();
		System.out.print("Digite o terceiro valor: ");
		double num3 = scan.nextDouble();
		System.out.print("Digite o quarto valor: ");
		double num4 = scan.nextDouble();
		double media = ((num1 * 1) + (num2 * 2) + (num3 * 3) + (num4 * 4)) / 10;
		System.out.println("\nResultado: ");
		System.out.println("Media: " + media);
	}
}
