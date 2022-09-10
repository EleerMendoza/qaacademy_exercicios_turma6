package ejercicios_medium;

//Exercício 2 - Faça um algoritmo para ler um valor de investimento,
// com uma taxa de juros de 5% a.a. Ao final de 10 anos, exibir o valor investido,
// valor dos juros, e o total. Considerando que a remuneração será no regime de juros compostos.

import javax.swing.*;

public class Exec_Medium2 {
    public static void main(String[] args) {
        double valorInvestimento = 0, valorJuros = 0, taxaJuros = 0.05, valorTotal = 0;
        int i = 1;
        valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Digite"));
        while (i<=10) {


        }

        valorJuros = (((valorJuros + valorInvestimento) * taxaJuros) + valorJuros);
       valorTotal = valorInvestimento + valorJuros;

        System.out.println("valorInvestimento" + valorInvestimento);
        System.out.println("Valor Juros" + valorJuros);
        System.out.println("Valor Total" + valorTotal);
    }
}


//Inicio do algoritmo
//        Declarar variáveis do tipo Numérico: nota1, resultado;
//        nota1= Ler (2);
//        resultado = nota1 * 2;
//        exibir "o dobro é:" + resultado de nota1*2;
//        exibir "o dobro é:" + 4;
//        fim do algoritmo