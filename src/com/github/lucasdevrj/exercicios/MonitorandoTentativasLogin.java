/**
 * Leonardo trabalha no setor de segurança de um sistema bancário e precisa garantir que os
 * usuários tenham um número limitado de tentativas para inserir a senha corretamente.
 * Se o usuário errar a senha 3 vezes seguidas, sua conta deve ser bloqueada temporariamente.
 *
 * Com base nesse cenário, crie um programa que peça uma senha ao usuário e permita até 3 tentativas
 * de erro antes de bloquear o acesso. Se o usuário digitar corretamente antes disso, o sistema
 * deve conceder o acesso imediatamente.
 */

package com.github.lucasdevrj.exercicios;

import java.util.Scanner;

public class MonitorandoTentativasLogin {
    public static void main(String[] args) {
        int numeroTentativasSenha = 3;
        String senha = "445";
        String senhaDigitada = "";
        boolean acessoConcedido = false;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.print("Digite sua senha: ");
            senhaDigitada = entrada.nextLine();
            numeroTentativasSenha--;

            if (senhaDigitada.equals(senha)) {
                System.out.println("Senha Correta! Acesso concedido!");
                acessoConcedido = true;
                break;
            } else if (numeroTentativasSenha > 0) {
                System.out.printf("Senha incorreta. Você tem %d tentativas restantes.\n", numeroTentativasSenha);
            }
        } while (numeroTentativasSenha > 0);

        if (!acessoConcedido) {
            System.out.println("Conta bloqueada temporariamente.");
        }

        entrada.close();
    }
}
