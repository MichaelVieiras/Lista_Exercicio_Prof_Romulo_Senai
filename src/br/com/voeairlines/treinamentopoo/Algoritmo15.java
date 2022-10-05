package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritmo15 {
	Scanner scan = new Scanner(System.in);
	public void resultado() {
		System.out.println("Algoritmo 15");
		System.out.println("Antes de o racionamento de energia ser decretado, quase ninguém falava em quilowatts; mas, agora, todos incorporaram essa palavra em seu vocabulário. Sabendo-se que 100 quilowatts de energia custa um sétimo do salário mínimo, fazer um algoritmo que receba o valor do salário mínimo e a quantidade de quilowatts gasta por uma residência e calcule. Imprima: \nValor em reais de cada quilowatt: \nValor em reais a ser pago: \nO novo valor a ser pago por essa residência com um desconto de 10%:\n");
		System.out.print("Digite o valor do salário mínimo: ");
		double salarioMinimo = scan.nextDouble();
		System.out.print("Digite a quantidade de QuiloWatts: ");
		double qtdWatts = scan.nextDouble();
		double precoWatts = salarioMinimo / 700;
		double valorPago = precoWatts * qtdWatts;
		double valorDesconto = valorPago - (valorPago * 0.1);
		System.out.println("\nResultado: ");
		System.out.printf("Valor em reais de cada quiloWatts: %.2f", precoWatts);
		System.out.printf("\nValor em reais a ser pago: %.2f", valorPago);
		System.out.printf("\nO novo valor a ser pago por essa residência com um desconto de 10 por cento: %.2f", valorDesconto);
	}
}
