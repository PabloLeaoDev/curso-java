package com.loiane.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Fatorial17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número para calcular seu fatorial:");
		int n = sc.nextInt();
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
		
	}

}
