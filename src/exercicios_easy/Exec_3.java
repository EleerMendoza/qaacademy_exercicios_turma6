package exercicios_easy;

import javax.swing.*;

//    Exercício 3 - Faça um algoritmo para ler dois valores, armazenar em variáveis, e
//exibir os valores das variáveis, trocados.
public class Exec_3 {
    public static void main(String[] args) {
//    Declarar variaveis do texto: nome, sobrenome;
        String nome, sobrenome;
//        nome = Ler("Eleer");

        nome = JOptionPane.showInputDialog("Digite seu nome aqui");

//        sobrenome = Ler("Mendoza");

        sobrenome = JOptionPane.showInputDialog("Digite seu sobrenome aqui");
        System.out.println("nome é:" + sobrenome + " " + nome);


//        Exibir: "O nome é:" + sobrenome + nome;

    }

    public static class Exec_10 {
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
}




//    Inicio Algoritmo
//    Declarar variaveis do texto: nome, sobrenome;
//        nome = Ler("Eleer");
//        sobrenome = Ler("Mendoza");
//        Exibir: "O nome é:" + sobrenome + nome;
//        Fim do algoritmo