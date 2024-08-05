package com.loiane.cursojava.aula17.exercicios;

import java.util.Scanner;

public class MediaIdades25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idades = 0, count = 0;
		boolean flag = true;

		while (flag) {
			System.out.println("Informe a idade do aluno:");
			int idade = sc.nextInt();
			while (true) {
				if (idade < 1 || idade > 120) {
					System.out.println("Informe uma idade válida:");
					idade = sc.nextInt();
				} else {
					idades += idade;
					break;
				}
			}
			count++;
			System.out.println("Deseja cadastrar mais um aluno? [s/n]");
			String cadastro = sc.next();
			if (cadastro.equalsIgnoreCase("s")) {
				continue;
			} else if (cadastro.equalsIgnoreCase("n")) {
				break;
			} else {
				while (true) {
					System.out.println(cadastro + " não é um valor válido.\nDigite S - Sim ou N - Não:");
					cadastro = sc.next();
					if (cadastro.equalsIgnoreCase("s")) {
						break;
					} else if (cadastro.equalsIgnoreCase("n")) {
						flag = false;
						break;
					} else {
						continue;
					}
				}
			}
		}
		
		double media = idades / count;
		String turma = "jovem";
		
		if (media >= 26 && media <= 60) {
			turma = "adulta";
		} else if (media > 60) {
			turma = "idosa";
		}
		
		System.out.println("Essa turma é considerada " + turma + " com a idade média de " + media);
	}

}
