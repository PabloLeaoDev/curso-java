package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class PeixesMulta14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o peso dos peixes:");
		final int pesoLimite = 50;
		int pesoPeixes = sc.nextInt();
		int multa = 0;
		if (pesoPeixes > pesoLimite) {
			multa = (pesoPeixes - pesoLimite) * 4;
		}
		System.out.println("Com " + pesoPeixes + "Kg de peixe a multa é de R$ " + multa + ".");
	}

}
