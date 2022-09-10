package exercicios_easy;

//Exercício 7 - Faça um algoritmo para ler um valor de salário, calcular e exibir o
//valor do INSS a ser pago. Respeitando a tabela abaixo:

import javax.swing.*;

public class Exec_77 {
    public static void main(String[] args) {

        double salario;
        double valorInss;
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));
        if (salario <= 1045){
            valorInss = salario * 0.075;
            System.out.println(valorInss);
        }
        if(salario >= 1045.01 && salario <= 2089.60){
            valorInss = salario * 0.9;
            System.out.println(valorInss);
        }
        if(salario >= 2089.61 && salario <= 3134.40) {
            valorInss = salario * 0.12;
            System.out.println(valorInss);
        }

        if(salario >= 3134.41 && salario <= 6101.06) {
            valorInss = salario * 0.14;
            System.out.println(valorInss);
        }



    }


}









//




//    Declarar variaveis do tipo numérico: salario,inss;
//        Inicio do algoritimo
//        salario = Ler(2100);
//        SE (salario <= 1045,000)
//        inss = salario*0,075;
//        Exibir = "O valor que você deve será:" + inss;
//        Fim Se
//
//        SE (salario = > 1045,01 && <= 2089,60)
//        inss = salario* 0,09
//        Exibir = ("O valor que você deve será:" + inss);
//        Fim Se
//
//        SE (salario = > 2089,51 && <= 33134,40);
//        inss = salario* 0,12
//        Exibir = ("O valor que você deve será:" + inss);
//        Fim Se
//
//        SE (salario = > 3134,41 && <= 6101,06);
//        inss = valor1* 0,14
//        Exibir = ("O valor que você deve será:" + inss);
//        Fim Se