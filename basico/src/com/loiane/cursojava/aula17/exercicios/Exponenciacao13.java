package com.loiane.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exponenciacao13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a base da exponeciação:");
		int base = sc.nextInt();
		System.out.println("Digite o expoente:");
		int expoente = sc.nextInt();
		int result = base;
		
		for (int i = 1; i < expoente; result *= base, i++);
		
		System.out.println(base + " elevado a " + expoente + " é igual a " + result + ".");
	}

}
