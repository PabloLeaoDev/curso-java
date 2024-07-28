package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class MorangoMaca27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite quantos Kilos (Kg) de Morango você deseja:");
		final double strawberryWeight = sc.nextDouble(); 
		System.out.println("Digite quantos Kilos (Kg) de Maçã você deseja:");
		final double appleWeight = sc.nextDouble();
		final double totalWeight = strawberryWeight + appleWeight; 
		double totalPrice = 0;
		
		if (strawberryWeight <= 5) {
			totalPrice += strawberryWeight * 2.5;
		} else {
			totalPrice += strawberryWeight * 2.2;
		}
		if (appleWeight <= 5) {
			totalPrice += appleWeight * 1.9;
		} else {
			totalPrice += appleWeight * 1.5;
		}
		
		double desc = 0;
		
		if (totalWeight > 8 || totalPrice > 25) {
			desc = (totalPrice * 10) / 100;
			totalPrice -= desc;
		}
		
		System.out.println("O valor total a ser pago é de " + totalPrice + " R$.");
	}

}
