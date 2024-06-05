package com.tony.estruturadedatos.lista.teste;

import com.tony.estruturadedatos.lista.ListaEncadeada;

public class Exercicio03 {
    public static void main(String[] args) {
        RemovePrimeiraPosicao();
    }

    public static void RemovePrimeiraPosicao() {

        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        /** Geraremos uma excessão para vermos caso a Lista esteja Vazia haja erro */

        
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3); // nossa saida 1, 2, 4
        System.out.println("Lista Antes: " + lista);
        lista.removeInicio();
        System.out.println("Lista Depois do Remove: " + lista);
        /**Outra Vez */
        lista.removeInicio();
        System.out.println("Lista Depois do Remove: " + lista);
        /**Ultima Vez */
        lista.removeInicio();
        System.out.println("Lista Depois do Remove: " + lista);

    }
}
