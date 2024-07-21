package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class CalculaAreaCirculo6 {
	
	public static void main(String[] args) {
		final double PI = Math.PI;
		System.out.println("Digite o Raio do círculo:");
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		final double areaCirculo = PI * Math.pow(r, 2);
		System.out.println("A área do círculo com Raio " + r + " é " + areaCirculo);
	}
	
}
