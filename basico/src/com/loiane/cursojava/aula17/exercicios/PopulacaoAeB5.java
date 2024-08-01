package com.loiane.cursojava.aula17.exercicios;

import java.util.Scanner;

public class PopulacaoAeB5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a população do país A:");
		int popA = sc.nextInt();
		System.out.println("Digite o crescimento anual da população do país A (em %):");
		double growthA = sc.nextDouble();
		System.out.println("Digite a população do país B:");
		int popB = sc.nextInt();
		System.out.println("Digite o crescimento anual da população do país B (em %):");
		double growthB = sc.nextDouble();
		
		int tempoPopIguais = 0;
		
		if (popA < popB && growthA > growthB) {
			while (popA < popB) {
				popA += (popA * growthA) / 100;
				popB += (popB * growthB) / 100;
				tempoPopIguais++;
			}
		} else if (popA > popB && growthA < growthB) {
			while (popA > popB) {
				popA += (popA * growthA) / 100;
				popB += (popB * growthB) / 100;
				tempoPopIguais++;
			}
		} else {
			String maiorPop = "A";
			String menorPop = "B";
			if (popA < popB && growthA < growthB) {
				maiorPop = "B";
				menorPop = "A";
			}
			System.out.println("O país " + menorPop + " sempre será menor em população que o país " + maiorPop + "!");
			return;
		}
		
		
		String maiorGrowPop = "A"; 
		String menorGrowPop = "B";
		String cmpPop = "maior";
		
		if (growthA < growthB) {
			maiorGrowPop = "B"; 
			menorGrowPop = "A";
		} else if (growthA == growthB) {
			if (popA == popB) {
				System.out.println("Com taxas de crescimento iguais, e populações iguais,"
						+ " os países A e B sempre terão suas proporções populacionais inalteradas.");
			} else {
				String menorPop = "A";
				String maiorPop = "B";
				
				if (popA > popB) {
					menorPop = "B";
					maiorPop = "A";
				}
				
				System.out.println("Com taxas de crescimento iguais, a população do país "
				+ menorPop + " nunca será maior que a população do país " + maiorPop + ".");
			}
			return;	
		}
		
		if (popB == popA) {
			cmpPop = "igual";	
		}
		
		System.out.println("Em " + tempoPopIguais + " anos a população do país "
		+ maiorGrowPop + " será " + cmpPop + " que a do país " + menorGrowPop + ".");
	}

}
