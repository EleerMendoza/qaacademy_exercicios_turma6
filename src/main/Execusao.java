package main;

import exemplos.MetodosSemMain;

public class Execusao {
    public static void main (String[] args){
        MetodosSemMain metodo = new MetodosSemMain();

        metodo.metodoComVoid();
        System.out.println(metodo.metodoComReturn());
        System.out.println(metodo.soma("ca",15,"ce",22));
    }
}
