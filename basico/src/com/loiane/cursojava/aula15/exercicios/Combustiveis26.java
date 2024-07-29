package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Combustiveis26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tipo de combustível de sua escolha [A - Álcool, G - Gasolina]:");
		final String fuelType = sc.next();
		String fuel = "";
		if (fuelType.equalsIgnoreCase("A")) {
			fuel = "Álcool";
		} else if (fuelType.equalsIgnoreCase("G")) {
			fuel = "Gasolina";
		} else {
			System.out.println("Tipo de combustível inválido!");
			return;
		}
		System.out.println("Digite quantos litros de " + fuel + " você deseja:");
		final int fuelLiter = sc.nextInt();
		if (fuelLiter < 1) {
			System.out.println("Litragem inválida, valor menor do que 1 litro!");
			return;
		}
		int price = 0;
		double desc = 0;
		if (fuel.equals("Álcool")) {
			price = fuelLiter * 4;
			if (fuelLiter <= 20) {
				desc = ((price * 3) / 100);
				price -= desc;
			} else {
				desc = ((price * 5) / 100);
				price -= desc;
			}
		} else {
			price = fuelLiter * 6;
			if (fuelLiter <= 20) {
				desc = ((price * 4) / 100);
				price -= desc;
			} else {
				desc = ((price * 6) / 100);
				price -= desc;
			}
		}
		System.out.println("O valor a ser pago por " + fuelLiter + " litros de " + fuel + " é de " + price + " R$.");
		System.out.println("Desconto de " + desc + " R$ já aplicado ao valor final.");
		
	}

}
