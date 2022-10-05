package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritmo11 {
	Scanner scan = new Scanner(System.in);
	public void resultado() {
		System.out.println("Algoritmo 11");
		System.out.println("Ler um número real e imprimir a terça parte deste número.");
		System.out.print("Digite um número: ");
		double num1 = scan.nextDouble();
		double resultado = num1 / 3;
		System.out.println("\nResultado: ");
		System.out.println(resultado);
	}
}
