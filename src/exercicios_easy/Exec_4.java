package exercicios_easy;

import javax.swing.*;

//Exercício 4 - Faça um algoritmo para ler um número inteiro, armazenar em uma
//        variável, calcular o dobro, e exibir.
public class Exec_4 {
    public static void main(String[] args) {
//        Declarar variáveis do tipo Numérico: nota1, resultado;
        int num1, result;
//        num1 = Ler(6);
        //usamos interger.parseInt para convertir a tipo numerico.

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
//        Exibir é o result = num1 * 2;
        //para exibir colocamos sout (System.out.println)
        result = num1*2;
        System.out.println("O dobro é:" + result);



    }
}


//Inicio do algoritmo
//        Declarar variáveis do tipo Numérico: nota1, resultado;
//        nota1= Ler (2);
//        resultado = nota1 * 2;
//        exibir "o dobro é:" + resultado de nota1*2;
//        exibir "o dobro é:" + 4;
//        fim do algoritmo