package com.loiane.cursojava.aula17.exercicios;

import java.util.Scanner;

public class ConjuntoN19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe quantos números terá o conjunto:");
		int n = sc.nextInt();
		int num = 0;
		int maior = 0;
		int menor = 999;
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite o " + (i + 1) + "° número do conjunto [0 > x < 1000]:");
			num = sc.nextInt();
			if (num <= 0 || num >= 1000) {
				System.out.println("Número digitado fora do escopo solicitado!");
				return;
			} else {
				if (num > maior) {
					maior = num;
				}
				
				if (num < menor) {
					menor = num;
				}
				
				sum += num;
			}
		}
		
		System.out.println("\nO menor número do conjunto é o " + menor + ".");
		System.out.println("O maior número do conjunto é o " + maior + ".");
		System.out.println("A soma de todos os números do conjunto é " + sum + ".");
	}

}
