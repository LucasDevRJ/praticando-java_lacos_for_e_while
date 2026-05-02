/**
 * João recebeu uma lista de valores representando as receitas de sua loja de roupas. Ele quer calcular
 * a soma total dessas receitas para entender o desempenho financeiro semanal.
 *
 * Crie um programa que ajude João a calcular o valor total.
 */

package com.github.lucasdevrj.exercicios;

import java.util.Scanner;

public class SomaDeNumeros {
    public static void main(String[] args) {
        int totalDeValores = 0;
        double receita = 0.0;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de valores da receita: ");
        totalDeValores = entrada.nextInt();

        while (totalDeValores <= 0) {
            System.out.println("Digite uma quantidade maior que 0.");
            System.out.print("Digite a quantidade de valores da receita: ");
            totalDeValores = entrada.nextInt();
        }

        double[] valores = new double[totalDeValores];

        for (int i = 0; i < totalDeValores; i++) {
            System.out.printf("Digite o %d° valor: ", i+1);
            valores[i] = entrada.nextDouble();
            while (valores[i] <= 0.0) {
                System.out.println("Digite um valor maior que 0.");
                System.out.printf("Digite o %d° valor: ", i+1);
                valores[i] = entrada.nextDouble();
            }
            receita += valores[i];
        }

        entrada.close();
        System.out.printf("A soma total da receita é R$%.2f", receita);
    }
}
