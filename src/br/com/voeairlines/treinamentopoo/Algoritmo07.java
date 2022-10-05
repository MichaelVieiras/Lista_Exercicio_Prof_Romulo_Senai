package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritmo07 {
	
	Scanner scan = new Scanner(System.in);
	public void resultado() {
		System.out.println("Algoritmo 7");
		System.out.println("Ler um número inteiro e escrever o seu sucessor e seu antecessor.");
		System.out.print("Digite um numero: ");
		int num = scan.nextInt();
		int sucessor = num + 1;
		int antecessor = num - 1;
		System.out.println("\nResultado: ");
		System.out.println("Numero digitado: " + num);
		System.out.println("Numero sucessor: " + sucessor);
		System.out.println("Numero antecessor: " + antecessor);
	}
}
