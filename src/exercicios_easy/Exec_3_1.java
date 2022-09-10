package exercicios_easy;

import javax.swing.*;

public class Exec_3_1 {
    public static void main(String[] args) {
        //    Declarar variaveis do texto: nome, sobrenome, auxiliar;
        String nome, sobrenome, auxiliar;
        nome = JOptionPane.showInputDialog("Digite seu nome");
        sobrenome = JOptionPane.showInputDialog("Digite seu sobrenome");
        auxiliar = nome;
        nome = sobrenome;
        sobrenome = auxiliar;
        System.out.println("O nome é:" + nome + " " + sobrenome);


    }


}






//    Inicio Algoritmo
//    Declarar variaveis do texto: nome, sobrenome, auxiliar;
//        nome = Ler("Edlayne");
//        sobrenome = Ler("Morais");
//        auxiliar = nome;
//        nome = sobrenome;
//        sobrenome = auxiliar;
//        Exibir: "O nome é:" + nome + sobrenome;
//        Fim do algoritmo