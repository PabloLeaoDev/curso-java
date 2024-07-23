package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class MaiorNum1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro:");
		final int num1 = sc.nextInt();
		System.out.println("Digite outro número inteiro:");
		final int num2 = sc.nextInt();
		int maior = num1;
		
		if (num2 > num1) {
			maior = num2;
		}
		
		if (num1 != num2) {			
			System.out.println("O maior número entre os dois digitados é o " + maior + ".");
		} else {
			System.out.println("Os números digitados são iguais.");
		}
	}

}
