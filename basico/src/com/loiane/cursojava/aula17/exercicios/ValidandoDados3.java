package com.loiane.cursojava.aula17.exercicios;

import java.util.Scanner;

public class ValidandoDados3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome;
		do {
			System.out.println("Digite seu nome [min.: 4 caracteres]:");
			nome = sc.next();
		} while (nome.length() < 4);
		
		int idade;
		do {
			System.out.println("Digite sua idade [0 a 150]:");
			idade = sc.nextInt();
		} while (idade < 0 || idade > 150);
		
		double salario;
		do {
			System.out.println("Digite seu salário [min.: maior que 0]:");
			salario = sc.nextDouble();
		} while (salario <= 0);
		
		String sexo;
		do {
			System.out.println("Digite seu sexo [M - Masculino ou F - Feminino]:");
			sexo = sc.next();
		} while (!(sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")));
		
		String estadoCivil;
		do {
			System.out.println("Digite seu Estado Civil [S - Solteiro(a), C - Casado(a), V - Viúvo(a) ou D - Divórciado(a)]:");
			estadoCivil = sc.next();
		} while (!(estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")));
	
		System.out.println("Programa Encerrado!");
	}

}
