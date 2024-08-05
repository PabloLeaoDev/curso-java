package com.loiane.cursojava.aula17.exercicios;

import java.util.Scanner;

public class EhPrimo22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número inteiro para determinarmos se ele é primo ou não:");
		int n = sc.nextInt(), count = 0;
		
		for (int i = 2; i < n; i++) {
			if ((n % i) == 0 && n != i) {
				if (count == 0) {
					System.out.println(n + " não é um número primo.");
					count++;
				}
				System.out.println(n + " é divisível por " + i + ".");
			}
		}
		
		if (count == 0) {
			System.out.println(n + " é um número primo.");
		}
		
	}

}
