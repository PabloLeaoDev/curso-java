package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class OrdemDec9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro:");
		final int num1 = sc.nextInt();
		System.out.println("Digite outro número inteiro:");
		final int num2 = sc.nextInt();
		System.out.println("Digite novamente outro número inteiro:");
		final int num3 = sc.nextInt();
		int maior = num1;
		int entre = num1;
		int menor = num1;
		
		if (num2 > num1) {
			maior = num2;
			if (num3 > num2) {
				maior = num3;
				entre = num2;
			} else {		
				entre = num3;
			}
		} else if (num3 > num1) {
			maior = num3;
			menor = num2;
		} else {
			if (num2 < num3) {
				menor = num2;
				entre = num3;
			} else {
				menor = num3;
				entre = num2;
			}
		}
		
		if (num1 != num2 || num1 != num3) {			
			System.out.println("Ordem decrescente dos números digitados é " + maior + ", " + entre + ", " + menor + ".");
		} else {
			System.out.println("Os números digitados são iguais.");
		}
	}

}
