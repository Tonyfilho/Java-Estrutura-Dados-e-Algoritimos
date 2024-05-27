package com.tony.estruturadedatos.lista;

/**Lembrando que cada Lista Encadiada tem 1 NÓ e cada NÓ tem 2 informações. */
/**
 * Colocamos a nos classe como Generica para ter qualquer tipo, Numero, string e
 * Objetos.
 * 1ª Criar no metodo adciona, mas o Nó é algo Interno da Classe.
 */
public class ListaEncadeada<T> {
    private No<T> inicioNO;

    private No<T> ultimoNO;

    private int tamanho;

    public void adiciona(T elemento) {
        No<T> celula = new No<T>(elemento);
        /** Criando o NO */
        /** Tamanho esta VAZIO ? Atualiza o InicioNO, senão o UltimoNO. */
        if (tamanho == 0) {
            this.inicioNO = celula; /**
                                     * Si Tamanho for ZERO ( 0 ) pegaremos o IncioNO e --> Apontaremos para Celula.
                                     */
        } else {
            /**
             * Se a Lista não tiver Vazia, ou seja tem Data,
             * Setaremos o UltimoNO, receberá a Celula.
             * Observe que a Variavel MUDOU de
             * COMPORTAMENTO
             */
            // this.ultimoNO = celula; /**error */
            // this.ultimoNO.setElemento(elemento); /***error */
            this.ultimoNO.setProximo(celula);

        }
        this.ultimoNO = celula; /** Pegaremos o Ponteiro do UltimoNO --> e Apontaremos para Celula */
        this.tamanho++;

    }

    public int getTamanho() {
        return this.tamanho;
    }

    /***
     * Estaremos fazendo uma modificação no ToString() para percorrer nossa lista
     * como se fosse um Array
     * [1,2,3,4....] e termos esta saida.
     */
    /**
     * 1ª coisa é saber se a Lista esta Vazia, retornaremos um Array vazio [];
     * 2º coisa é criar uma Variavel Atual que receba o Inicio,
     * 3ª Se fosse Interá como se fosse um Array começariamos com o Zero;
     * 4ª Adcionar o Atual no Builder antes de entrar no While e adcionar uma Virgula.
     * 5ª dentro do While vamos mover o Atual p para o Proximo Elemento.
     * 6º Movendo para proximo elemento, repetimos o Builder
     * 7ª retornar a String.
     * 
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (tamanho == 0) {
            return builder.append("[]").toString();
        }
        No<T> atual = this.inicioNO;
        builder.append("[");
        builder.append(atual.getElemento()).append(" ,");
        while (atual.getProximo() != null) {
            atual = atual.getProximo();
            builder.append(atual.getElemento()).append(" ,");
        }
        builder.deleteCharAt(builder.lastIndexOf(","));
        builder.append("]");
        return builder.toString();
    }
    /**Sobre escrevemos pois para mostrar como fazer com o FOR */
    
    public String toStringComFor() {
        StringBuilder builder = new StringBuilder();
        if (tamanho == 0) {
            return builder.append("[]").toString();
        }
        No<T> atual = this.inicioNO;
        builder.append("[");     
        for (int i = 0; i < tamanho; i++) {
            builder.append(atual.getElemento()).append(" ,");
            atual = atual.getProximo();
        }
        builder.deleteCharAt(builder.lastIndexOf(","));
        builder.append("]");
        return builder.toString();
    }

}
