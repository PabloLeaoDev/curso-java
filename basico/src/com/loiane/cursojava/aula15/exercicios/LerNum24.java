package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class LerNum24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número:");
		final double num1 = sc.nextDouble();
		System.out.println("Digite o segundo número:");
		final double num2 = sc.nextDouble();
		System.out.println("Digite a operação que deseja realizar [+, -, * ou /]:");
		final String op = sc.next();
		
		double result = 0;
		
		if (op.equals("+")) {
			result = num1 + num2;
		} else if (op.equals("-")) {
			result = num1 - num2;
		} else if (op.equals("*")) {
			result = num1 * num2;
		} else if (op.equals("/")) {
			result = num1 / num2;
		} else {
			System.out.println("Operação inválida!");
			return;
		}
		
		final boolean ehPar = result % 2 == 0;
		final boolean ehPositivo = result > 0;
		final boolean ehInteiro = isInteger(result);
		
		System.out.println("Resultado de " + num1 + " e " + num2 + " na operação é " + result);
		
		if (ehPar) {
			System.out.println("Ele é Par.");
		} else {
			System.out.println("Ele é Ímpar.");
		}
		
		if (ehPositivo) {
			System.out.println("É Positivo.");
		} else if (result == 0) {
			System.out.println("É Neutro.");
		} else {
			System.out.println("É Negativo.");
		}
		
		if (ehInteiro) {
			System.out.println("É Inteiro.");
		} else {
			System.out.println("É Decimal.");
		}
	}

	private static boolean isInteger(double result) {
		int resultInt = (int) result;
		double possibleDecimal = result - (double) resultInt;
		
		if (possibleDecimal == 0) {
			return true;
		} else {
			return false;
		}
	}

}
