/**
 * Ana é professora de matemática e está sempre curiosa sobre as respostas de seus alunos.
 * Hoje, ela propôs um exercício no qual os alunos devem contar quantos números positivos
 * e negativos existem em uma sequência de números fornecida por ela.
 *
 * Ela quer que os alunos criem um programa que permita **inserir vários números, um por vez,
 * e que pare quando o número "fim" for digitado. **
 */

package com.github.lucasdevrj.exercicios;

import java.util.Scanner;

public class ContandoNumerosPositivosENegativos {
    public static void main(String[] args) {
        String valorDigitado = "0";
        int quantidadeDeNumerosPositivos = 0;
        int quantidadeDeNumerosNegativos = 0;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.print("Digite um número (ou 'fim' para encerrar): ");
            valorDigitado = entrada.nextLine();
            valorDigitado = valorDigitado.toLowerCase();
            boolean ehNumero = valorDigitado.matches("-?\\d+");
            if (ehNumero) {
                int numeroDigitado = Integer.parseInt(valorDigitado);
                if (numeroDigitado > 0) {
                    quantidadeDeNumerosPositivos++;
                } else if (numeroDigitado < 0) {
                    quantidadeDeNumerosNegativos++;
                }
            }
        } while (!valorDigitado.equals("fim"));

        System.out.println("Números positivos: " + quantidadeDeNumerosPositivos);
        System.out.println("Números negativos: " + quantidadeDeNumerosNegativos);

        entrada.close();
    }
}
