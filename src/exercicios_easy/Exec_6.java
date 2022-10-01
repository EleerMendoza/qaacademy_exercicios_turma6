package exercicios_easy;
//package exercicios_easy;
//Exercício 6 - Faça um algoritmo para ler duas notas, calcular a média. E
//SE - a média > 5 Exibir aprovado, SE a média < 5 exibir reprovado, se media = 5
//exibir exame.

import javax.swing.*;

public class Exec_6 {

//    public static void main(String[] args) {
//        int num1, num2, media;
//        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
//        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
//        media = (num1 + num2)/2;
//        if (media > 5){
//            System.out.println("Aprovado");
//        }
//        if (media < 5){
//            System.out.println("Reprovado");
//        }
//        if (media == 5){
//            System.out.println("Exame");
//        }
//
//
//
//    }
//
//}


        public String calcularMedia(int num1, int num2) {
            int media;
            String retorno="";

            media = (num1 + num2) / 2;

            if (media > 5) {//inicio
                return "Você está Aprovado! Parabéns!!!";
            }//fim se

            if (media < 5) {//inicio
                return "Você está Reprovado!!!";
            }//fim se

            if (media == 5) {//inicio
                return "Você está de Exame!!!";
            }//fim se
            return retorno;
        }



    }
