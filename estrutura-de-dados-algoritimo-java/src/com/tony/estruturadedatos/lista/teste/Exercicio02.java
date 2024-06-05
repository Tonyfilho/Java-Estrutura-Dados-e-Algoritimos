package com.tony.estruturadedatos.lista.teste;

import com.tony.estruturadedatos.lista.ListaEncadeada;

public class Exercicio02 {
    public static void main(String[] args) {

        // AdicionaInicio();

        AdicionaPorPosicao();

    }

    public static void AdicionaInicio() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adcionaNoInicio(3);
        lista.adcionaNoInicio(2);
        lista.adcionaNoInicio(1); /** Nossa saida tem q ter 1,2,3 */

        System.out.println("******************Adciona no Inicio************");

        System.out.println(lista);
    }

    public static void AdicionaPorPosicao() {

        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        /*
         * lista.adiciona(3);
         * lista.adiciona(2);
         * lista.adiciona(1); // Nossa saida tem q ter 3,2,1
         * System.out.println("******************Adciona************");
         * System.out.println(lista);
         */

        /*
         * lista.adiciona(0, 10);
         * System.out.
         * println("******************Adciona Em Qualquer Posição************");
         * System.out.println(lista + " tamanho " + lista.getTamanho());
         */

        /*
         * lista.adiciona(-1, 9);
         * System.out.
         * println("******************Adciona Em Qualquer Posição error************");
         * System.out.println(lista);
         */

        /* Criando a excessão, posição q não existe */
        // lista.adiciona(5, 0);

        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(4); // nossa saida 1, 2, 4
        System.out.println("Lista: " + lista);

        /**Adciona no Inicio */
        lista.adiciona(0, 0); // nossa saida 0, 1, 2, 4
        System.out.println("Lista: " + lista);
        
        /**Adciona no final */
        lista.adiciona(4, 5); // nossa saida 0, 1, 2, 4, 5
        System.out.println("Lista: " + lista);

        /**Adciona no meio*/
        lista.adiciona(2, 3); // nossa saida 0, 1, 2, 3, 4, 5
        System.out.println("Lista: " + lista);

    }
}
