package exercicios_easy;

//Exercício 10 - Faça um algoritmo para ler um valor de investimento, com uma
//taxa de juros de 5% a.a. Ao final de 10 anos, exibir o valor investido, valor dos
//juros e o total com juros. Considerando que a remuneração será no regime de
//juros simples.(vão ser sempre encima de 1000).

import javax.swing.*;

public class Exec_10 {
    public static void main(String[] args) {
        double investimento, valorJuros, taxa = 0.05, juros = 0, valorTotal = 0;
        int i = 1;
        investimento = Double.parseDouble(JOptionPane.showInputDialog("Digite"));

        valorJuros = (10 * taxa) * investimento;
        valorTotal = valorJuros + investimento;

        System.out.println("Valor Investido: R$" + investimento);
        System.out.println("Valor Juros: R$" + valorJuros);
        System.out.println("Valor Total com Juros: R$" + valorTotal);

    }
}


//  Início Algoritimo
//
// Declarar variáveis do tipo numérico: valorInvestimento, taxajuros = 0,05, valorJuuros, valorTotal;
// valorInvestimento = Ler ("1000");
// taxajuros = 0,05 * 10;
// valorJuros = valorInvestimento * taxajuros;
//  valorTotal = valorJuros+valorInvestimento
//
//  Exibir: "Você investiu:" + valorInvestimento;
//  Exibir: "Rendeu:" + valorJuros + "de Juros";
//  Exibir: "O Valor total são:" + valorTotal;
//
//
//
//  Fim Algoritimo