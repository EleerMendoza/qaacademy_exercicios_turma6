package exercicios_easy;

import javax.swing.*;
//Exercício 8 - Faça um algoritmo para ler um valor de salário, calcular e exibir o
//        valor do salário bruto, valor do salário líquido e o valor do imposto de renda.
//        Respeitando a tabela abaixo:

public class Exec_8 {
    public static void main(String[] args) {

        double salario;
        double ir = 0;

        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salario"));


        if (salario > 0 && salario < 1903.98) {
            ir = salario;
            System.out.println(salario);
            System.out.println("isento de imposto de renda");
        }


        if (salario >= 1903.99 && salario <= 2826.65) {
            ir = (salario * 0.075) - 142.8;

        }
        if (salario >= 2826.66 && salario <= 3751.05) {
            ir = (salario * 0.15) - 354.8;

        }

        if (salario >= 3751.06 && salario <= 4664.68) {
            ir = (salario * 0.25) - 636.13;

        }

        if (salario > 4664.68) {
            ir = (salario * 0.275) - 869.36;

        }

        System.out.println("salariobruto" + salario);
        System.out.println("salarioliquido" + (salario - ir) );
        System.out.println("imposto da renda" + ir);
    }
}



