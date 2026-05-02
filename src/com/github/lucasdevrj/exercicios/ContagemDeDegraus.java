/**
 * Carla começou a praticar trilha e deseja saber quantos degraus precisará subir para chegar ao topo
 * de uma escadaria. Ela sobe um degrau por vez e quer um programa que mostre sua subida até o topo.
 * Sua tarefa é criar um programa que receba um número e simule a subida da escadaria.
 */

package com.github.lucasdevrj.exercicios;

import java.util.Scanner;

public class ContagemDeDegraus {
    public static void main(String[] args) {
        int numeroDeDegraus = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de degraus: ");
        numeroDeDegraus = entrada.nextInt();
        entrada.close();

        boolean degrauValido = numeroDeDegraus > 0;

        if (degrauValido) {
            for (int degrau = 1; degrau <= numeroDeDegraus; degrau++) {
                System.out.printf("Subindo o %d° degrau\n", degrau);
            }
            System.out.println("Você chegou ao topo!");
        } else {
            System.out.println("Digite uma quantidade de degraus maiores que 0.");
        }
    }
}
