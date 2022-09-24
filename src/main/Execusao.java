package main;
import exercicios_easy.Exec2;
import exercicios_easy.Exec_3;
import exercicios_easy.Exec_4;
import exercicios_easy.Exec_5;

//import exemplos.MetodosSemMain;
//
//public class Execusao {
//    public static void main (String[] args){
////        MetodosSemMain metodo = new MetodosSemMain();
////
////        metodo.metodoComVoid();
////        System.out.println(metodo.metodoComReturn());
////        System.out.println(metodo.soma("ca",15,"ce",22));
//    }
//}



public class Execusao {
//    public static void main(String[] args) {
//
//        Exec2 exec2 = new Exec2();
//        System.out.println(exec2.exibirPalavra("A palavra é " + "Palavra"));
//    }
//    }

//    public static void main(String[] args) {
//
//        Exec_3 exec3 = new Exec_3();
//        System.out.println(exec3.exibirNome("Valeria ", "Vivas"));
//    }

//    public static void main(String[] args) {
//
//        Exec_4 exec_4 = new Exec_4();
//
//        System.out.println(exec_4.exibirValor(4));


    public static void main(String[] args) {

        Exec_5 exec_5 = new Exec_5();
        int num = 4, num1 = 2, num2 = 6;

        System.out.println(exec_5.soma(num,  num1, num2));
        System.out.println(exec_5.sub(num, num1, num2));
        System.out.println(exec_5.multi(num, num1, num2 ));
        System.out.println(exec_5.media(num, num1, num2));
    }
}




