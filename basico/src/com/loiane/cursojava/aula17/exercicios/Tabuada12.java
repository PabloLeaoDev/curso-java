package com.loiane.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Tabuada12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha um número inteiro de 1 a 10 para a impressão da tabuada:");
		int tabuada = sc.nextInt();
		
		System.out.println("Tabuada de " + tabuada + ":");
		for (int i = 0; i <= 10; i++) {
			System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
		}
	}

}
