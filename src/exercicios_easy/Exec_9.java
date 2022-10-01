package exercicios_easy;

import javax.swing.*;
//Exercício 9 - Faça um algoritmo para ler um número inteiro entre: 1 a 10,
//calcular e exibir a tabuada deste número digitado. Ex.: 10 x 1 = 10, .., 10 x 10 =
//100.

public class Exec_9 {

    public int calcularTabuada(int num1) {

        int i = 1;
        while (i <= 10) {
            System.out.println(num1 + " x " + i + " = " + num1 * i);
            i++;
        }
        return i;
    }
}
//    public static void main(String[] args) {
//
//int num1=0, i = 1;
//        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
//while (i <= 10){
//    System.out.println(num1+ " x " + i + " = " + num1 * i);
//    i++;
//}
//
//    }
//}