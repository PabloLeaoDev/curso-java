package com.loiane.cursojava.aula17.exercicios;

import java.util.Scanner;

public class PedindoNota1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nota;
		do {
			System.out.println("Digite uma nota entre 0 e 10:");
			nota = sc.nextInt();
		} while (nota < 0 || nota > 10);
		System.out.println("Programa Encerrado!");
	}

}
