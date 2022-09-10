package exercicios_easy;

//Exercício 11 - Faça um algoritmo para ler um número inteiro, somar 2 ao número
//digitado, até completar 100 iterações. Por ex.: Digitou 10. 10+2, 12+2, 14+2, Até
//completar 100 iterações.

import javax.swing.*;

public class Exec_11 {
    public static void main(String[] args) {
        int soma = 0, i = 1;
        soma = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        while (i <= 100){
            soma = soma +2;
            System.out.println(soma);
            i++;
        }

    }
}


//  Início Algoritimo
//
// declarar variaveis do tipo numerico num, i = 1;
//num = ler(6)
//Enquanto(i<100)
//num = num + 2
//Exibir("A suma é;" + num);
// i=i+1
//  Fim Algoritimo