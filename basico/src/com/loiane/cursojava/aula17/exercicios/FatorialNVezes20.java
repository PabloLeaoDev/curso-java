package com.loiane.cursojava.aula17.exercicios;

import java.util.Scanner;

public class FatorialNVezes20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("Digite um número entre 1 e 15 para calcular seu fatorial:");
			int n = sc.nextInt();
			if (n < 1 || n > 15) {
				System.out.println(n + " não é um valor válido!");
				break;
			}
			int result = n;
			
			System.out.print(n + "! = ");
			
			while (n >= 1) {
				if (n == 1) {
					System.out.print(n + " = " + result);				
				} else {
					System.out.print(n + " . ");
				}
				n--;
				result *= n;
			}
			
			System.out.println("\nDeseja calcular outro fatorial? [y/n]");
			String again = sc.next();
			if (again.equalsIgnoreCase("n")) {
				System.out.println("Fim do programa!");
				break;
			}
		}
		
		
		
	}

}
