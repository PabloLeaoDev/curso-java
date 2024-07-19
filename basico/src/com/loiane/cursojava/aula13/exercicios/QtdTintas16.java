package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class QtdTintas16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o tamanho, em metros quadrados (m²), da área a ser pintada:");
		int area = sc.nextInt();
		// cada litro da lata de tinta de 18 litros pinta uma área de 3m², então uma lata inteira pinta (18 * 3)m².		
		final int lataAreaPintada = 18 * 3;
		final int lataPreco = 80;
		int qtdLatas;
		int valorPagar;
		String latas;
		
		if (area > 0 && area <= lataAreaPintada) {
			qtdLatas = 1;
			valorPagar = lataPreco;
			latas = " lata";
		} else if (area > lataAreaPintada) {
			qtdLatas = area / lataAreaPintada;
			if (area % lataAreaPintada != 0) {
				qtdLatas++;
			}
			valorPagar = qtdLatas * lataPreco;
			latas = " latas";
		} else {
			System.out.println("Valor da área inválido!");
			return;
		}
		System.out.println("Para pintar " + area + "m² se precisa de " + qtdLatas + latas + " de tinta e o total a pagar é R$ " + valorPagar + ".");
		
	}

}
