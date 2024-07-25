package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class EquacaoSegundograu16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dado \"ax² + bx + c\".");
		System.out.println("Informe os valores de \"a\":");
		final int a = sc.nextInt();
		if (a == 0) {
			System.out.println("Valor de \"a\" inválido!");
			return;
		}
		System.out.println("Informe os valores de \"b\":");
		final int b = sc.nextInt();
		System.out.println("Informe os valores de \"c\":");
		final int c = sc.nextInt();
		
		final double delta = (Math.pow(b, 2)) - 4 * a * c;
		final double x1 = ((b * (-1)) + (Math.sqrt(delta))) / (2 * a);
		final double x2 = ((b * (-1)) - (Math.sqrt(delta))) / (2 * a);
		
		if (delta < 0) {
			System.out.println("O valor de delta é negativo.");
			System.out.println("A equação não possui raízes reais!");
			return;
		} else if (delta == 0) { 
			System.out.println("O valor de delta é 0 (zero). A equação possui apenas uma raíz!");
			System.out.println("x = " + x1);
		} else {
			System.out.println("O valor de delta é " + delta + ". As raízes da equação são \"x1\" e \"x2\"");
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}
	}

}
