package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritmo18 {
	Scanner scan = new Scanner(System.in);
	
	public void resultado() {
		System.out.println("Algoritmo 18");
		System.out.println("Entrar com o raio de um círculo e imprimir a seguinte saída: Perímetro e Área ");
		System.out.print("Informe o raio: ");
		double raio = scan.nextDouble();
		double perimetro = 2 * Math.PI * raio;
		double area = Math.PI * Math.pow(raio, 2);
		System.out.println("\nResultado: ");
		System.out.println();
		System.out.printf("Perímetro: %.3f", perimetro);
		System.out.printf("\nÁrea: %.3f", area);
	}
}
