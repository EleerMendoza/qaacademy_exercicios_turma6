package ejercicios_medium;

//Faça um algoritmo para ler todos os meses do ano, armazene em um vetor.
import javax.swing.*;

public class Exec_Medium7 {
    public static void main(String[] args) {
//        Declarar variáveis do tipo Numérico: num0, num1, num2, num3, num4, num5, num6, num7. mu,8,
//        num9, num10, num11 exibir;

//        int num1, num2, num3,num4, num5, factorial;

String [] meses = new String[12];
 meses [0] = "Janeriro";
 meses[1] = "Fevererio";
 meses[2] = "Março";
 meses[3] = "Abril";
 meses[4] = "Maio";
 meses[5] = "Junio";
 meses[6] = "julho";
 meses[7] = "Agosto";
 meses[8] = "Setembro";
 meses[9] = "Otubro";
 meses[10] = "Novembro";
 meses[11] = "Dezembro";

 int i = 0, num1 =0;

while (i <= 0){
    num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do mes"));
System.out.println("O mes é:" + meses[num1 - 1]);
i++;

        }


        }
    }






