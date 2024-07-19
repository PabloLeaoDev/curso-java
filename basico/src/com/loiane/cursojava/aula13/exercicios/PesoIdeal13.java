package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class PesoIdeal13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua altura:");
		double altura = sc.nextDouble();
		System.out.println("Digite seu sexo [M/F]:");
		String sexo = sc.next();
		double pesoIdeal = 0;
		if (sexo.equalsIgnoreCase("M")) {
			pesoIdeal = 72.7 * altura - 58;		
		} else if (sexo.equalsIgnoreCase("F")) {
			pesoIdeal = 62.1 * altura - 44.7;
		} else {
			System.out.println("Sexo inválido!");
			return;
		}
		System.out.println("O peso ideal de uma pessoa com o sexo " + sexo + 
					" de altura " + altura + " é " + pesoIdeal);
	}

}
