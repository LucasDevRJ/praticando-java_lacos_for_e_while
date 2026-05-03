/**
 * Um sistema de cadastro exige que os usuários informem um nome válido. No entanto,
 * alguns usuários tentam deixar o campo em branco ou inserir nomes muito curtos.
 * O sistema precisa garantir que o nome tenha pelo menos 3 caracteres antes de
 * prosseguir com o cadastro.
 *
 * Com base nesse cenário, crie um programa que continue pedindo um nome até que o
 * usuário insira um valor válido com pelo menos 3 caracteres.
 */

package com.github.lucasdevrj.exercicios;

import java.util.Scanner;

public class PedindoNomeValido {
    public static void main(String[] args) {
        int quantidadeDeCaracteresParaNomeValido = 3;
        String nomeDigitado = "";

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nomeDigitado = entrada.nextLine();

        boolean nomeValido = nomeDigitado.length() < quantidadeDeCaracteresParaNomeValido;
        while (nomeValido) {
            System.out.println("Nome inválido. Digite novamente.");
            System.out.print("Digite seu nome: ");
            nomeDigitado = entrada.nextLine();
            nomeValido = nomeDigitado.length() < quantidadeDeCaracteresParaNomeValido;
        }
        entrada.close();

        System.out.printf("Nome \"%s\" cadastrado com sucesso!", nomeDigitado);
    }
}
