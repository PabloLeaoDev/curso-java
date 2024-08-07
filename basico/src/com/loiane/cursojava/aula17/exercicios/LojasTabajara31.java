package com.loiane.cursojava.aula17.exercicios;

import java.util.Scanner;

public class LojasTabajara31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lojas Tabajara:");
		double total = 0;
		double preco;
		int produto = 1;
		
		do {
			System.out.print("Produto " + produto + ": R$ ");
			preco = sc.nextDouble();
			while (preco < 0) {
				System.out.print("Digite 0 para finalizar a compra ou um valor maior que 0 para registrar outro produto.");
				preco = sc.nextDouble();
			}
			total += preco;
			produto++;
		} while (preco > 0);

		System.out.println("\nTotal: R$ " + total);
		System.out.print("Dinheiro: R$ ");
		
		double dinheiro = sc.nextDouble();
		
		if (dinheiro >= total) {
			System.out.println("Troco: R$ " + (dinheiro - total));			
		} else if (total > 0) {
			System.out.println("Pega ladrão!");
		}
	}

}
