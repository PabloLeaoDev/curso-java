package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class CalculaSalario15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite seu ganho em 1 hora trabalhada:");
		double ganhoHoras = scan.nextDouble();
		System.out.println("Digite quantas horas você trabalha mensalmente:");
		int horasMes = scan.nextInt();
		
		final double salarioBruto = ganhoHoras * horasMes;
		final double descIR = salarioBruto * (11.0 / 100.0);
		final double descINSS = salarioBruto * (8.0 / 100.0);
		final double descSindicato = salarioBruto * (5.0 / 100.0);
		final double salarioLiquido = salarioBruto - (descIR + descINSS + descSindicato);
		
		System.out.println("Salário bruto: R$ " + salarioBruto);
		System.out.println("Salário líquido (descontando impostos): R$ " + salarioLiquido);
	}

}
