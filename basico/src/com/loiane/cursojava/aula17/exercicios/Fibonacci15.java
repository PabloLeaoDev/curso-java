package com.loiane.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Fibonacci15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite quantos termos terá a sequência de Fibonacci:");
		int n = sc.nextInt();
		int count = 1;
		int fbA = 1;
		int fbB = 1;
		
		if (n < 1) {
			System.out.print("Valor de termos inválidos para a fazer uma sequência de Fibonacci!");
			return;
		} else if (n == 1) {
			System.out.print(fbA);
			return;
		} else if (n == 2) {
			System.out.print(fbA + ", " + fbA);
			return;
		}
		
		System.out.print(fbA + ", ");
		
		while (count < n) {
			if (count == 1) {
				System.out.print(fbB + ", ");	
			} else if (count < n - 1) {
				System.out.print(", " + fbB + ", ");
			} else {
				System.out.print(", " + fbB);
			}
			fbA += fbB;
			count++;
			if (count == n) {
				break;
			}
			fbB += fbA;
			System.out.print(fbA);
			count++;
		}
		
		System.out.println();
		
	}

}
