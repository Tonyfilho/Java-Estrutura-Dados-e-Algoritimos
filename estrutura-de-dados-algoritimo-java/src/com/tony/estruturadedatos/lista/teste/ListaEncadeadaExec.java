package com.tony.estruturadedatos.lista.teste;

import com.tony.estruturadedatos.lista.ListaEncadeada;

public class ListaEncadeadaExec {
    public static void main(String[] args) {


        ListaEncadeada <Integer> lista = new ListaEncadeada<>();

        lista.adiciona(1);
        
        System.out.println("\nNossa Lista \n" + lista + "\nTamanho da Lista " +  lista.getTamanho());
        
        lista.adiciona(2);
        System.out.println("\nNossa Lista \n" + lista + "\nTamanho da Lista " +  lista.getTamanho());

        lista.adiciona(3);
        System.out.println("\nNossa Lista \n" + lista + "\nTamanho da Lista " +  lista.getTamanho());

        lista.adiciona(4);
        System.out.println("\nNossa Lista \n" + lista + "\nTamanho da Lista " +  lista.getTamanho());
    }
}
