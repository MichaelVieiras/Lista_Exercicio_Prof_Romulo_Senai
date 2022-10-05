package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritmo17 {
	Scanner scan = new Scanner(System.in);
	
	public void resultado() {
		System.out.println("Algoritmo 17");
		System.out.println("Entrar com a base e a altura de um retângulo e imprimir a seguinte saída: Perímetro, Area e Diagonal.");
		double base, altura, perimetro, area, diagonal;
		System.out.print("Informe a base: ");
		base = scan.nextDouble();
		System.out.print("Informe a Altura: ");
		altura = scan.nextDouble();
		
		area = base * altura;
		
		perimetro = 2 * (base + altura);
		
		double teoremaP = Math.pow(altura, 2) + Math.pow(base, 2);
		diagonal = Math.sqrt(teoremaP);
		
		System.out.println("\nResultado: ");
		System.out.println();
		System.out.println("Perímetro: " + perimetro);
		System.out.println("Area: " + area);
		System.out.println("Diagonal: " + diagonal);
	}
}
