package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class CalculosAleatorios11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número inteiro:");
		int num1 = scan.nextInt();
		System.out.println("Digite outro número inteiro:");
		int num2 = scan.nextInt();
		System.out.println("Digite um número real:");
		double num3 = scan.nextDouble();
		
		double opA = num1 * 2 / (num2 / 2);
		double opB = num1 * 3 + num3;
		double opC = Math.pow(num3, 3);
		
		System.out.println("Operação A: " + opA);
		System.out.println("Operação B: " + opB);
		System.out.println("Operação C: " + opC);
	}

}
