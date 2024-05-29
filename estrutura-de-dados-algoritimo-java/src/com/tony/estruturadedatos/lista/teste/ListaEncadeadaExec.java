package com.tony.estruturadedatos.lista.teste;

import com.tony.estruturadedatos.lista.ListaEncadeada;

public class ListaEncadeadaExec {
        public static void main(String[] args) {

                ListaEncadeada<Integer> lista = new ListaEncadeada<>();

                lista.adiciona(1);

                System.out.println("\nNossa Lista \n" + lista +
                                "\nTamanho da Lista " + lista.getTamanho());

                lista.adiciona(2);
                System.out.println("\nNossa Lista \n" + lista +
                                "\nTamanho da Lista " + lista.getTamanho());

                lista.adiciona(3);
                System.out.println("\nNossa Lista \n" + lista +
                                "\nTamanho da Lista " + lista.getTamanho());

                lista.adiciona(4);
                System.out.println("\nNossa Lista \n" + lista +
                                "\nTamanho da Lista " + lista.getTamanho());

                System.out.println("ToString2 com for: " + lista.toStringComFor());
                System.out.println("**************\n\n");

                /*
                 * lista.limpaS();
                 * System.out.println("Após LimpaLista: " + lista);
                 */

                /******************** Buscas************************* */

                System.out.println("Nossa Lista " + lista + " Tamanho: " +
                                lista.getTamanho());
                System.out.println("******************Busca por Elementos Aula 06*************");
                System.out.println("******************Lembrando que foi Adcionado 4 Elementos*************");
                System.out.println();
                System.out.println(
                                "Existe Posiçao ? Nº Positivo é TRUE, Nº Negativo é False: " +
                                                lista.buscaElemento(1));
                System.out.println(
                                "Existe Posiçao ? Nº Positivo é TRUE, Nº Negativo é False: " +
                                                lista.buscaElemento(2));
                System.out.println(
                                "Existe Posiçao ? Nº Positivo é TRUE, Nº Negativo é False: " +
                                                lista.buscaElemento(3));
                System.out.println(
                                "Existe Posiçao ? Nº Positivo é TRUE, Nº Negativo é False: " +
                                                lista.buscaElemento(0));

                                                
                /******************** Buscas***************************** */
                System.out.println("Nossa Lista " + lista + " Tamanho: " +
                                lista.getTamanho());
                System.out.println("******************Busca por Posiçao Aula 06*************");
                System.out.println("******************Lembrando que foi Adicionado 4 Elementos*************");
                System.out.println("Busca Por Elemento " + lista.existeElementoNaPosicao(0));
                System.out.println("Busca Por Elemento " + lista.existeElementoNaPosicao(1));
                System.out.println("Busca Por Elemento " + lista.existeElementoNaPosicao(2));
                System.out.println("Busca Por Elemento " + lista.existeElementoNaPosicao(3));
                System.out.println("Busca Por Elemento " + lista.existeElementoNaPosicao(4));

        }

}
