package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Triangulo15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Primeiro lado:");
		final double l1 = sc.nextDouble();
		System.out.println("Segundo lado:");
		final double l2 = sc.nextDouble();
		System.out.println("Terceiro lado:");
		final double l3 = sc.nextDouble();
		
		if ((l1 + l2 < l3) || (l1 + l3 < l2) || (l2 + l3 < l1)) {
			System.out.println("Triângulo inválido!");
			return;
		}
		
		if ((l1 == l2) && (l1 == l3)) {
			System.out.println("Triângulo Equilátero!");
		} else if ((l1 == l2) || (l1 == l3) || (l2 == l3)) {
			System.out.println("Triângulo Isósceles!");
		} else {
			System.out.println("Triângulo Escaleno!");
		}
	}

}
