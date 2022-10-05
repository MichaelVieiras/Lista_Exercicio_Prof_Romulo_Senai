package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritmo21 {
	Scanner scan = new Scanner(System.in);
	public void resultado() {
		System.out.println("Algoritmo 21");
		System.out.println("Criar um algoritmo que calcule e imprima a área de um triângulo.");
		System.out.print("Informe a base: ");
		double base = scan.nextDouble();
		System.out.print("Informe a Altura: ");
		double altura = scan.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.println("\nResultado: ");
		System.out.println();
		System.out.printf("Area: %.2f", area);
	}
}
