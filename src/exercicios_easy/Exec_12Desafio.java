package exercicios_easy;

import javax.swing.*;

//Exercício 4 - Desafio: Jogo da forca.
//O jogo da forca é um jogo em que o jogador tem que acertar qual é a palavra
//proposta, tendo como dica o número de letras e o tema ligado à palavra.
//Faça um algoritmo para implementar o jogo da forca.
//Exibindo no inicio o tema da palavra secreta e a quantidade de letras que a
//palavra possui.
//Serão permitidas até 5 tentativas, e a cada tentativa correta sera exibida a posição
//da letra.
//Ex: Palavra secreta: Testes;
//Tentativa: letra E;
//Se a tentativa estiver correta:
//Exibir: _ e _ _ e _
//Se não estiver correta exibir:
public class Exec_12Desafio {
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