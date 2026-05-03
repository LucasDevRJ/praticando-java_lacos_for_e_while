/**
 * Pedro quer calcular o fatorial de um número. O fatorial de um número é o produto de todos os
 * números inteiros positivos de 1 até o próprio número. Por exemplo, o fatorial
 * de 5 é 5 × 4 × 3 × 2 × 1 = 120. Crie um programa que receba um número e calcule seu fatorial.
 */

package com.github.lucasdevrj.exercicios;

import java.util.Scanner;

public class CalculadoraDeFatorial {
    public static void main(String[] args) {
        int numero = 0;
        int fatorial = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        numero = entrada.nextInt();

        entrada.close();
        fatorial = numero;
        for (int i = numero-1; i >= 1; i--) {
            fatorial *= i;
        }

        System.out.printf("O fatorial de %d é %d", numero, fatorial);
    }
}
