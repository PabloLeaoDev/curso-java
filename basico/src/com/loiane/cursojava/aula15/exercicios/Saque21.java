package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Saque21 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor a ser sacado [min.: 10 e max.: 600]:");
		final int saque = sc.nextInt();
		int nota1 = 0;
		int nota5 = 0;
		int nota10 = 0;
		int nota20 = 0;
		int nota50 = 0;
		int nota100 = 0;
		String notas1 = " nota";
		String notas5 = " nota";
		String notas10 = " nota";
		String notas20 = " nota";
		String notas50 = " nota";
		String notas100 = " nota";
		
		if (saque < 10 || saque > 600) {
			System.out.println("Valor digitado para saque inválido!");
			return;
		}
		
		int valorRetirar = saque;
		
		while (valorRetirar != 0) {
			if (valorRetirar >= 100) {
				nota100++;
				valorRetirar -= 100;
			} else if (valorRetirar >= 50) {
				nota50++;
				valorRetirar -= 50;
			} else if (valorRetirar >= 20) {
				nota20++;
				valorRetirar -= 20;
			} else if (valorRetirar >= 10) {
				nota10++;
				valorRetirar -= 10;
			} else if (valorRetirar >= 5) {
				nota5++;
				valorRetirar -= 5;
			} else if (valorRetirar >= 1) {
				nota1++;
				valorRetirar -= 1;
			}
		}
		
		if (nota100 != 1) {
			notas100 = " notas";
		}
		if (nota50 != 1) {
			notas50 = " notas";
		}
		if (nota20 != 1) {
			notas20 = " notas";
		}
		if (nota10 != 1) {
			notas10 = " notas";
		}
		if (nota5 != 1) {
			notas5 = " notas";
		}
		if (nota1 != 1) {
			notas1 = " notas";
		}
		System.out.println("Para sacar uma quantia de " + saque + " reais, o programa fornece " + nota100 + notas100 + " de 100, "
		+ nota50 + notas50 + " de 50, " + nota20 + notas20 + " de 20, " + nota10 + notas10 + " de 10, " + nota5 + notas5 + " de 5 e "
		+ nota1 + notas1 + " de 1.");
	}

}
