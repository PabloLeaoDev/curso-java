package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Download18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o tamanho do arquivo (em MB):");
		double arquivoTamanho = sc.nextDouble();
		System.out.println("Informe a velocidade da Internet (em Mbps):");
		double netVelocidade = sc.nextDouble();
		// multiplica-se por 8 devido ao fato de que 1 Byte (MB) são 8 bits (Mb)
		final double tempoDownload = ((arquivoTamanho * 8) / netVelocidade) / 60;
		System.out.println("Tempo de download desse arquivo será de " + String.format("%.2f", tempoDownload) + " minutos.");
	}

}
