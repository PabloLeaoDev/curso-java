package com.loiane.cursojava.aula17.exercicios;

import java.util.Scanner;

public class TabuadaPersonalizada36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Montar a tabuada de: ");
		int table = sc.nextInt();
		System.out.println("Começar por:");
		int startTable = sc.nextInt();
		System.out.println("Terminar em:");
		int finalTable = sc.nextInt();
		
		if (startTable > finalTable) {
			System.out.println("O valor inicial não pode ser superior ao valor final!");
			return;
		}
		
		System.out.println("Tabuada de " + table + " de " + startTable + " a " + finalTable + ":");
		for (int i = startTable; i <= finalTable; i++) {
			System.out.println(table + " X " + i + " = " + (table * i));
		}
	}

}