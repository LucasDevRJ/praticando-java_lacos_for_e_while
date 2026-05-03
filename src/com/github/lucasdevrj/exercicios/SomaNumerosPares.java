/**
 * Maria quer calcular a soma de todos os números pares de 1 a 100. Ela decidiu usar um loop para
 * iterar pelos números e somar apenas aqueles divisíveis por 2. Crie um programa que realize essa tarefa.
 */

package com.github.lucasdevrj.exercicios;

public class SomaNumerosPares {
    public static void main(String[] args) {
        int valorInicial = 1;
        int valorFinal = 100;
        int somaNumerosPares = 0;

        for (int i = valorInicial; i <= valorFinal; i++) {
            int restoDaDivisao = i % 2;
            somaNumerosPares = restoDaDivisao == 0 ? somaNumerosPares + i : somaNumerosPares;
        }

        System.out.println("A soma dos números pares de 1 a 100 é: " + somaNumerosPares);
    }
}
