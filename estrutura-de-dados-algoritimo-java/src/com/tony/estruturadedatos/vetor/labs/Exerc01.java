package com.tony.estruturadedatos.vetor.labs;



import com.tony.estruturadedatos.vetor.ListaObjetos;

public class Exerc01 {
    
    public static void main(String[] args) {
        ListaObjetos<String> localArray = new ListaObjetos<String>(5);
        localArray.add("A");
        localArray.add("B");
        localArray.add("C");


       System.out.println(localArray.BuscaB("D"));
       System.out.println(localArray.BuscaI("C"));

    }

}
