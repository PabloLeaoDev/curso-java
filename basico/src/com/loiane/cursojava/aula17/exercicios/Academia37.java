package com.loiane.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Academia37 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int code;
		int codeMagro = 0;
		int codeGordo = 0;
		int codeAlto = 0;
		int codeBaixo = 0;
		int loop = 0;
		double magro = Double.MAX_VALUE;
		double gordo = Double.MIN_VALUE;
		double alto = Double.MIN_VALUE;
		double baixo = Double.MAX_VALUE;
		double peso;
		double h;
		
		do {
			System.out.print("Digite seu código: ");
			code = sc.nextInt();
			
			if (code == 0) {
				break;
			} else if (code < 0) {
				System.out.print("Digite 0 para finalizar os cadastros ou um válido para registrar outro aluno.");
				continue;
			}
			
			System.out.print("Digite seu peso: ");
			peso = sc.nextDouble();
			
			if (peso > gordo) {
				gordo = peso;
				codeGordo = code;
				if (loop == 0) {
					magro = peso;
				}
			} else if (peso < magro) {
				magro = peso;
				codeMagro = code;
			}
			
			System.out.print("Digite sua altura: ");
			h = sc.nextDouble();
			
			if (h > alto) {
				alto = h;
				codeAlto = code;
				if (loop == 0) {
					baixo = h;
				}
			} else if (h < baixo) {
				baixo = h;
				codeBaixo = code;
			}
			
			loop++;
		} while (code > 0);

		System.out.println("O mais gordo da academia pesa " + gordo + " Kg, seu código é " + codeGordo + ".");
		System.out.println("O mais magro da academia pesa " + magro + " Kg, seu código é " + codeMagro + ".");
		System.out.println("O mais baixo da academia mede " + baixo + " m, seu código é " + codeBaixo + ".");
		System.out.println("O mais alto da academia mede " + alto + " m, seu código é " + codeAlto + ".");
	}

}
