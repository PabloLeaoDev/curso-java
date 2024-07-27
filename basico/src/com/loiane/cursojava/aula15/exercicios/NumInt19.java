package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class NumInt19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro positivo menor do que 1000:");
		final int num = sc.nextInt();
		String unidade = " unidade";
		String dezena = " dezena";
		String centena = " centena";
		
		if (num < 1 || num > 1000) {
			System.out.println("Valor digitado inválido!");
			return;
		}
		
		if (num < 10) {
			if (num != 1) {
				unidade = " unidades";
			}
			System.out.println(num + unidade);
		} else if (num < 100) {
			int dez = num / 10;
			int uni = num % 10; 
			if (uni != 1) {
				unidade = " unidades";
			}
			if (dez != 1) {
				dezena = " dezenas";
			}
			System.out.println(dez + dezena + " e " + uni + unidade);
		} else {
			int cent = num / 100;
			int dez = (num % 100) / 10;
			int uni = num % 10;
			if (uni != 1) {
				unidade = " unidades";
			}
			if (dez != 1) {
				dezena = " dezenas";
			}
			if (cent != 1) {
				centena = " centenas";
			}
			System.out.println(cent + centena + ", " + dez + dezena + " e " + uni + unidade);
		}

	}

}
