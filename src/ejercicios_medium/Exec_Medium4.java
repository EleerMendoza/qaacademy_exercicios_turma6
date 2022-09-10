package ejercicios_medium;

//Exercício 5 - Faça um algoritmo para ler 5 números, verificar e exibir,
// quais dos 5 números digitados, é o menor.

import javax.swing.*;

public class Exec_Medium4 {
    public static void main(String[] args) {
//        Declarar variáveis do tipo Numérico: num1, num2, num3, num4, num5, exibir;

//        int num1, num2, num3,num4, num5, menor;
//
//        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro número");
//        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo número");
//        num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Terceiro número");
//        num4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o  Quarto número"));
//        num5 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Quinto número"));

        int i = 1, num = 0, menor = 0;
        while (i < 5){
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um mumero"));
            if(num < menor || i == 1){
                menor = num;

        }
        i++;
            System.out.println("O numero menor é : " + menor);


        }
    }
}



//Inicio do algoritmo
//        Declarar variáveis do tipo Numérico: nota1, resultado;
//        nota1= Ler (2);
//        resultado = nota1 * 2;
//        exibir "o dobro é:" + resultado de nota1*2;
//        exibir "o dobro é:" + 4;
//        fim do algoritmo