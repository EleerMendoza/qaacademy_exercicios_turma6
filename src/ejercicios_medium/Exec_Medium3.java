package ejercicios_medium;

//Exercício 3 - Faça um algoritmo para calcular
// e exibir a soma de todos os números de 0 a 1000.
// E parar se caso a soma atingir 1500(ou mais).

import javax.swing.*;

public class Exec_Medium3 {
    public static void main(String[] args) {
//        Declarar variáveis do tipo Numérico: num1, exibir;
        int soma = 0, i = 1;
        soma = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        while (i <= 1000) {

            soma = soma + 1;
            if (soma >= 1500) {
                break;

            }

            System.out.println(soma);
            i++;


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