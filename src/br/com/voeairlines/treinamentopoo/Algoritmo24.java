package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritmo24 {
	Scanner scan = new Scanner(System.in);
	public void resultado() {
		System.out.println("Algoritmo 24");
		System.out.println("Ler uma temperatura em graus centígrados e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é :  F = (9 * c + 160) / 5 Onde F é a temperatura em Fahrenheit e C é a temperatura em centígrados. ");
		System.out.println("Informa a temperatura em graus Celsius: ");
		double celsius = scan.nextDouble();
		double fahrenheit = (9 * celsius + 160) / 5;
		System.out.println("\nResultado: ");
		System.out.println();
		System.out.printf("A temperatura convertida para Fahrenheit é: %.1fºF", fahrenheit);
	}
}
