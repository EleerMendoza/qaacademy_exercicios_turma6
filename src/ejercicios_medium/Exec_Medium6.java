package ejercicios_medium;

//Exercício 6 - Faça um algoritmo para ler um número inteiro,
// calcular e exibir o Fatorial do número digitado.
// Ex.: Digitou 10. 10*(10-1)*(10-2)*(10-3).. *(10-1) = 3.628.800
// Factorial, i
//Factorial = Factoria * (i-1)
//usar i--
import javax.swing.*;

public class Exec_Medium6 {
    public static void main(String[] args) {
//        Declarar variáveis do tipo Numérico: num1, num2, num3, num4, num5, exibir;

//        int num1, num2, num3,num4, num5, factorial;


        int i = 0, factorial = 10;
        i = factorial;
        factorial = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro número"));

        while (i > 1) {
            factorial = factorial * (i - 1);

            i--;
        }
            System.out.println(factorial);

        }
    }






