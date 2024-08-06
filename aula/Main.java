package aula;

import java.util.Scanner;

import ulti.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual a cotação do dólar ? ");
		double dollarRate = sc.nextDouble();

		System.out.print("Quantos dólares você vai comprar? ");
		double dollarAmount = sc.nextDouble();

		double amountInReais = CurrencyConverter.dollarToReal(dollarAmount, dollarRate);

		System.out.printf("Valor a ser pago em reais = %.2f%n", amountInReais);

		sc.close();
	}
}
