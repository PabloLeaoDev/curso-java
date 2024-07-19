package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class QtdTintasGaloes17 {

	public static void main(String[] args) {
		
		final int areaPintadaLitro = 6;
		final int lataVol = 18;
		final int lataPreco = 80;		
		final double galaoVol = 3.6;
		final int galaoPreco = 25;
		System.out.println("Informe o tamanho, em metros quadrados (m²), da área a ser pintada:");
		String latas = " latas";
		String galoes = " galões";
		Scanner sc = new Scanner(System.in);
		int area = sc.nextInt();
		if (area <= 0) {
			System.out.println("Valor da área inválido!");
			return;
		}
		int qtdLatas = 0;
		double qtdGaloes = 0;
		double valorPagar = 0;
		System.out.println("Informe o número da opção desejada:");
		System.out.println("1. Comprar somente latas.");
		System.out.println("2. Comprar somente galões.");
		System.out.println("3. Comprar ambos, latas e galões.");
		int escolha = sc.nextInt();
		
		if (escolha == 1) {
			if (area <= (areaPintadaLitro * lataVol)) {
				qtdLatas = 1;
				valorPagar = lataPreco;
				latas = " lata";
			} else if (area > (areaPintadaLitro * lataVol)) {
				qtdLatas = area / (areaPintadaLitro * lataVol);
				if (area % (areaPintadaLitro * lataVol) != 0) {
					qtdLatas++;
				}
				valorPagar = qtdLatas * lataPreco;
			}
			System.out.println("Para pintar " + area + "m² se precisa de " + qtdLatas + latas +
					" de tinta e o total a pagar é R$ " + (int) valorPagar + ".");	
		} else if (escolha == 2) {
			if (area <= (areaPintadaLitro * galaoVol)) {
				qtdGaloes = 1;
				valorPagar = galaoPreco;
				galoes = " galão";
			} else if (area > (areaPintadaLitro * galaoVol)) {
				qtdGaloes = area / (areaPintadaLitro * galaoVol);
				if (area % (areaPintadaLitro * galaoVol) != 0) {
					qtdGaloes++;
				}
				valorPagar = qtdGaloes * galaoPreco;
			}
			System.out.println("Para pintar " + area + "m² se precisa de " + (int) qtdGaloes + galoes +
					" de tinta e o total a pagar é R$ " + (int) valorPagar + ".");
		} else if (escolha == 3) {
			if (area <= (areaPintadaLitro * galaoVol)) {
				qtdGaloes = 1;
				valorPagar = galaoPreco;
				galoes = " galão";
			} else if (area <= (areaPintadaLitro * galaoVol) * 4) {
				qtdGaloes = (int) (area / (areaPintadaLitro * galaoVol));
				if (area % (areaPintadaLitro * galaoVol) > 0) {
					qtdGaloes++;
				}
				valorPagar = qtdGaloes * galaoPreco;
			} else if (area <= areaPintadaLitro * lataVol) {
				qtdLatas = 1;
				valorPagar = lataPreco;
				latas = " lata";
			} else if (area > areaPintadaLitro * lataVol) {
				double exVol = area % (areaPintadaLitro * lataVol);
				qtdLatas = area / (areaPintadaLitro * lataVol);
				if (exVol > 0 && exVol <= (areaPintadaLitro * galaoVol) * 4) {
					qtdGaloes = exVol / (areaPintadaLitro * galaoVol);
					double tintaExtra = qtdGaloes - (int) qtdGaloes;
					if (tintaExtra > 0) {
						qtdGaloes++;
					}
				} else if (exVol > (areaPintadaLitro * galaoVol) * 4) {
					qtdLatas++;
				}
				valorPagar = lataPreco * qtdLatas + galaoPreco * (int) qtdGaloes;
			}
			System.out.println("Para pintar " + area + "m² se precisa de " + qtdLatas + latas + " e " 
					+ (int) qtdGaloes + galoes + " de tinta e o total a pagar é R$ " + (int) valorPagar + ".");
		} else {
			System.out.println("Opção inválida!");
			return;
		}
		
	}

}
