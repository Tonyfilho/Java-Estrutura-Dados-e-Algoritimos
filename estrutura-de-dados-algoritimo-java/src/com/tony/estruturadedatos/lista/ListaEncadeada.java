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
            // this.ultimoNO = celula;  /**error */
            // this.ultimoNO.setElemento(elemento); /***error */
            this.ultimoNO.setProximo(celula);
            /**
             * Se a Lista não tiver Vazia, ou seja tem Data,
             * Setaremos o UltimoNO, receberá a Celula.
             * Observe que a Variavel MUDOU de
             * COMPORTAMENTO
             */

        }
        this.ultimoNO = celula; /** Pegaremos o Ponteiro do UltimoNO --> e Apontaremos para Celula */
        this.tamanho++;

    }

    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        return "ListaEncadiada.inicio = " + inicioNO + "\n ";
    }

}
