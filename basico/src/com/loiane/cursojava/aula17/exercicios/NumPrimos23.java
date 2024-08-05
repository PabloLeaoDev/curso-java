package com.loiane.cursojava.aula17.exercicios;

import java.util.Scanner;

public class NumPrimos23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número inteiro para determinarmos os números primos entre 1 e ele:");
		int n = sc.nextInt(), count = 0;
		
		if (n <= 1) {
			System.out.println("Valor informado inválido!");
			return;
		}
		
		System.out.println("Os números primos entre 1 e " + n + " são:");
		
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= i; j++) {
				count++;
				if ((i % j) == 0 && j != 1 && j != i) {
					break;
				} else if (j == i) {
					System.out.println(i);
				}
			}
		}
		
		System.out.println("Foram necessárias " + count + " operações para determinar os números primos acima.");
	}

}
