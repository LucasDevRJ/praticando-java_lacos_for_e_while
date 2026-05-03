/*
    Carlos tem uma lista de números e quer descobrir qual é o maior valor. Para isso,
    ele decidiu percorrer a lista comparando cada número com o maior encontrado até o momento.
    Crie um programa que receba uma lista de números e encontre o maior número.
 */

package com.github.lucasdevrj.exercicios;

import java.util.Scanner;

public class EncontrandoMaiorValor {
    public static void main(String[] args) {
        Integer[] numeros = new Integer[50];
        int numeroDigitado = 0;
        int maiorNumero = 0;
        int indice = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite os números separados por espaço: ");

        do {
            numeroDigitado = entrada.nextInt();
            if (indice == 0) {
                maiorNumero = numeroDigitado;
            }
            maiorNumero = Math.max(numeroDigitado, maiorNumero);
            numeros[indice] = numeroDigitado;
            indice++;
        } while (entrada.hasNextInt());

        System.out.println("O maior número é: " + maiorNumero);

        entrada.close();

    }
}
