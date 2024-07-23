package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class ConceitoNotas14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		final double nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota: ");
		final double nota2 = sc.nextDouble();
		final double media = (nota1 + nota2) / 2;
		char conceito = 'A';
		
		// verificação de notas
		if ((nota1 < 0 || nota2 < 0) || (nota1 > 10 || nota2 > 10)) {
			System.out.println("Valor da nota inválido!");
			return;
		}
			
		if (media >= 7.5 && media <= 9) {
			conceito = 'B';
		} else if (media >= 6 && media < 7.5) {
			conceito = 'C';
		} else if (media >= 4 && media < 6) {
			conceito = 'D';
		} else if (media >= 0 && media < 4) {
			conceito = 'E';
		}
		
		System.out.println("Primeira nota: " + nota1);
		System.out.println("Segunda nota: " + nota2);
		System.out.println("Média: " + media);
		System.out.println("Conceito: " + conceito);
		
		if (conceito == 'A' || conceito == 'B' || conceito == 'C') {
			System.out.println("APROVADO!");
		} else {
			System.out.println("REPROVADO!");
		}
	}

}
