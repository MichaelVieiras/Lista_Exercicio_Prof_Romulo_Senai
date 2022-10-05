package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritmo26 {
	Scanner scan = new Scanner(System.in);
	public void resultado() {
		System.out.println("Algoritmo 19");
		System.out.println("Efetuar o cálculo do valor de uma prestação em atraso, utilizando a fórmula de prestação = valor + (valor*(taxa/100)*tempo).");
		System.out.print("Informe o valor: ");
		double valor = scan.nextDouble();
		System.out.print("Informe a taxa de encargos: ");
		double taxa = scan.nextDouble();
		System.out.print("Informe o tempo de atraso: ");
		double tempo = scan.nextDouble();
		double prestacao = valor + (valor * (taxa / 100) * tempo);
		
		System.out.println("\nResultado: ");
		System.out.println();
		System.out.printf("O valor da prestação é R$: %.2f", prestacao);
	}
}
