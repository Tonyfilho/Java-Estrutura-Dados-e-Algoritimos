package com.tony.estruturadedatos.lista.teste;

import com.tony.estruturadedatos.lista.ListaEncadeada;

public class ListaEncadeadaExec {
    public static void main(String[] args) {


        ListaEncadeada <Integer> lista = new ListaEncadeada<>();

        lista.adiciona(1);

        System.out.println("Nossa Lista " + lista);
        
    }
}
