package com.tony.estruturadedatos.lista.teste;

import com.tony.estruturadedatos.lista.ListaEncadeada;

public class Exercicio04
 {
    public static void main(String[] args) {
        RemoveUltimaPosicao();
    }

    public static void RemoveUltimaPosicao() {

        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        /** Geraremos uma excessão para vermos caso a Lista esteja Vazia haja erro */
     //   lista.removeFinal();



        
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3); // nossa saida 1, 2, 4
        System.out.println("Lista Antes: " + lista);
        lista.removeFinal();
        System.out.println("Lista Depois do RemoveUltima : " + lista); //1, 2
        /**Outra Vez */
         lista.removeFinal();
         System.out.println("Lista Depois do Remove: " + lista); // 1
        /**Ultima Vez */
         lista.removeFinal();
         System.out.println("Lista Depois do Remove: " + lista); // [ ]

    }
}
