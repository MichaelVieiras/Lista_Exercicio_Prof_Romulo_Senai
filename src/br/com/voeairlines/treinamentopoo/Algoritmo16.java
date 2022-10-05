package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritmo16 {
	Scanner scan = new Scanner(System.in);

	public void resultado() {
		String nome;
		int tamNome, indice;
		System.out.println("Algoritmo 16");
		System.out.println("Entrar com um nome e imprimir: Todo nome, Primeiro caractere, Ultimo caractere, Do primeiro ate o terceiro, Quarto caractere, Todos menos o primeiro, Os dois últimos");
		do {
		System.out.print("Informe um nome: ");
		nome = scan.nextLine();
		tamNome = nome.length();
		if (nome.length() < 4) {
				System.out.println("Informe um nome que contenha 4 letras ou mais!");
			}
		}while(nome.length() < 4);
		System.out.println("\nResultado: ");
		System.out.println();
		
		if (nome.length() >= 4) {
			System.out.println("Todo nome: " + nome);
			System.out.println("Primeiro caractere: " + nome.charAt(0));
			System.out.println("Ultimo caractere: " + nome.charAt(tamNome - 1));
			System.out.print("Do primeiro até o terceiro: ");
			for (indice = 0; indice < 3; indice++) {
				System.out.print(nome.charAt(indice));
			}
			System.out.println("\nQuarto caractere: " + nome.charAt(3));
			System.out.print("Todos menos o primeiro: ");
			for (indice = 1; indice < tamNome; indice++) {
				System.out.print(nome.charAt(indice));
			}
			System.out.println("\nOs dois últimos: " + nome.charAt(tamNome - 2) + "" + nome.charAt(tamNome - 1));
		}
	}	
}
