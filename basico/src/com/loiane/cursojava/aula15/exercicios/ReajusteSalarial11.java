package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class ReajusteSalarial11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu salário atual:");
		final double salario = sc.nextDouble();
		int percentual = 0;
		
		if (salario <= 280) {
			percentual = 20; 
		} else if (salario > 280 && salario < 700) {
			percentual = 15;
		} else if (salario >= 700 && salario < 1500) {
			percentual = 10;  
		} else {
			percentual = 5;
		}
		
		double aumento = (salario * percentual) / 100;
		double reajuste = salario + aumento;
		
		System.out.println("Antigo Salário: R$ " + salario);
		System.out.println("Percentual de Aumento: " + percentual + "%");
		System.out.println("Aumento Bruto: R$ " + aumento);
		System.out.println("Novo Salário: R$ " + reajuste);
	}

}
