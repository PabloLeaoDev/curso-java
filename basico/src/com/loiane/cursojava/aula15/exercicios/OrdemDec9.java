package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class OrdemDec9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        final int num1 = sc.nextInt();
        System.out.println("Digite outro número inteiro:");
        final int num2 = sc.nextInt();
        System.out.println("Digite novamente outro número inteiro:");
        final int num3 = sc.nextInt();
        int maior, entre, menor;
        
        if (num1 == num2 && num1 == num3) {
            System.out.println("Os números digitados são iguais.");
            return;
        }
        
        if (num1 >= num2 && num1 >= num3) {
            maior = num1;
            if (num2 >= num3) {
                entre = num2;
                menor = num3;
            } else {
                entre = num3;
                menor = num2;
            }
        } else if (num2 >= num1 && num2 >= num3) {
            maior = num2;
            if (num1 >= num3) {
                entre = num1;
                menor = num3;
            } else {
                entre = num3;
                menor = num1;
            }
        } else {
            maior = num3;
            if (num1 >= num2) {
                entre = num1;
                menor = num2;
            } else {
                entre = num2;
                menor = num1;
            }
        }
        
        System.out.println("Ordem decrescente dos números digitados é " + maior + ", " + entre + ", " + menor + ".");
    }
}
