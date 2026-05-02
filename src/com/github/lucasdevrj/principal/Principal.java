package com.github.lucasdevrj.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        String[] vendedores = {"Carlos", "Mariana", "João", "Fernanda"};
        double[] vendas = {4000.00, 8000.00, 12000.00, 5000.00};

        Scanner entrada = new Scanner(System.in);

        System.out.println("Testando com o For:");
        for (int i = 0; i < vendedores.length; i++) {
            String vendedor = vendedores[i];
            double totalDeVendas = calcularComissao(vendas[i]);
            System.out.printf("%s - comissão %.2f \n", vendedor, totalDeVendas);
        }

        System.out.println("Testando com o While:");
        int i = 0;
        boolean desejaExibirVendedor = true;
        while (desejaExibirVendedor && i < vendedores.length) {
            String vendedor = vendedores[i];
            double totalDeVendas = calcularComissao(vendas[i]);
            System.out.printf("%s - comissão %.2f \n", vendedor, totalDeVendas);
            i++;
            System.out.print("Deseja exibir outro vendedor?");
            desejaExibirVendedor = entrada.nextBoolean();
        }

        System.out.println("Testando com o Do While:");
        i = 0;
        do {
            String vendedor = vendedores[i];
            double totalDeVendas = calcularComissao(vendas[i]);
            System.out.printf("%s - comissão %.2f \n", vendedor, totalDeVendas);
            i++;
            System.out.print("Deseja exibir outro vendedor?");
            desejaExibirVendedor = entrada.nextBoolean();
        } while (desejaExibirVendedor && i < vendedores.length);

        System.out.println("Testando com o For mais condicionais:");
        System.out.println("Todos os funcionários antes da Mariana");
        for (int j = 0; j < vendedores.length; j++) {
            String vendedor = vendedores[j];
            double totalDeVendas = calcularComissao(vendas[j]);
            if (vendedor.equalsIgnoreCase("mariana")) {
                break;
            }
            System.out.printf("%s - comissão %.2f \n", vendedor, totalDeVendas);
        }

        System.out.println("Todos os funcionários menos a Mariana");
        for (int j = 0; j < vendedores.length; j++) {
            String vendedor = vendedores[j];
            double totalDeVendas = calcularComissao(vendas[j]);
            if (vendedor.equalsIgnoreCase("mariana")) {
                continue;
            }
            System.out.printf("%s - comissão %.2f \n", vendedor, totalDeVendas);
        }

        System.out.println("Usando o ForEach:");
        for (String vendedor : vendedores) {
            System.out.println("Vendedor = " + vendedor);
        }

        entrada.close();
    }

    public static double calcularComissao(double totalVendas) {
        if (totalVendas <= 5000) {
            return totalVendas * 0.03;
        } else if (totalVendas <= 10000) {
            return totalVendas * 0.05;
        } else {
            return totalVendas * 0.07;
        }
    }
}
