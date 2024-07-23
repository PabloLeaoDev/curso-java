package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Aprovacao5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota:");
		final double nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota:");
		final double nota2 = sc.nextDouble();
		final double media = (nota1 + nota2) / 2;
		
		if (media < 7) {
			System.out.println("Reprovado!");
		} else {
			if (media <= 9.9) {
				System.out.println("Aprovado!");
			} else {
				System.out.println("Aprovado com distinção!");
			}
		}
	}

}
