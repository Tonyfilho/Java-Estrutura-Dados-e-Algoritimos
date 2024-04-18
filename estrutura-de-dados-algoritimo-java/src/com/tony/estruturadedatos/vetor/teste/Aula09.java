package com.tony.estruturadedatos.vetor.teste;

import com.tony.estruturadedatos.vetor.Vetor;

public class Aula09 {
    public static void main(String[] args) {
        /**
         * Criaremos um Array de capacidade 3 e adcionaremos 5 itens
         */
        Vetor v = new Vetor(5);

        v.adicionaComBoolean("B");
        v.adicionaComBoolean("C");
        v.adicionaComBoolean("E");
        v.adicionaComBoolean("F");
        v.adicionaComBoolean("G");
        /**
         * Imprimiremos o Vetor Antes de invocação do metodo remove elemento
         */
        System.out.println("VETOR Antes Remoção: " + v);
        /** Removendo a posição */
        v.remove(1);
        System.out.println("VETOR Apos a Remoção do 'C' de Aumentar: " + v);

        v.adicionaComBoolean("H");
        System.out.println("VETOR Apos a Remoção do 'C' e Adição do H: " + v);

        /**
         * Podemos usar o existeElemento() que retorna uma posição e com a JUNÇÂO do
         * BuscaElemento() e do Remove(), podemos fazer um bem casado
         */
        int localPosicao = v.existeElementoInt("F");
        System.out.println("Posição do Existe: " + localPosicao + " Elemento: " + v.buscaElementoComError(localPosicao));
        v.remove(localPosicao);
        System.out.println("Posição Removida: " + v);
    }
}
