package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritmo20 {
	Scanner scan = new Scanner(System.in);
	public void resultado() {
		System.out.println("Algoritmo 20");
		System.out.println("Entrar com os lados a,b,c de um paralelepípedo. Calcular e imprimir a diagonal.");
		System.out.print("Informe o lado A: ");
		double ladoA = scan.nextDouble();
		System.out.print("Informe o lado B: ");
		double ladoB = scan.nextDouble();
		System.out.print("Informe o lado C: ");
		double ladoC = scan.nextDouble();
		

		double teoremaP = Math.pow(ladoA, 2) + Math.pow(ladoB, 2) + Math.pow(ladoC, 2);
		double diagonal = Math.sqrt(teoremaP);
		
		System.out.println("\nResultado: ");
		System.out.println();
		System.out.printf("Diagonal: %.2f", diagonal);
	}
}
