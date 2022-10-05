package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritmo25 {
	Scanner scan = new Scanner(System.in);
	public void resultado() {
		System.out.println("Algoritmo 25");
		System.out.println("Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: volume = 3.14159 * R² *altura");
		System.out.println("Informe a altura da lata: ");
		double altura = scan.nextDouble();
		System.out.println("Informe o raio da lata: ");
		double raio = scan.nextDouble();
		
		double volume = 3.14159 * Math.pow(raio, 2) * altura;
		
		System.out.println("\nResultado: ");
		System.out.println();
		System.out.printf("Volume: %.3f", volume);
	}
}
