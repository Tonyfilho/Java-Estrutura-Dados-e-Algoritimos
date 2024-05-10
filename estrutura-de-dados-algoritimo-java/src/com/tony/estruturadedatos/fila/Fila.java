package com.tony.estruturadedatos.fila;

import com.tony.estruturadedatos.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

    public Fila() {
        super();
    }

    public Fila(int tamanho) {
        super(tamanho);
    }

    public void enfileirar(T elemento) {
        super.adiciona(elemento);
    }

    /** Lembrando que no comportamento de Fila, temos q saber que será o proximo */
    public T espiar() {

        if (super.estaVazia()) {
            return null;
        }
        return super.elementos[0];
    }

    public T desenfileirado() {
        if (super.estaVazia()) {
            return null;
        }
        return this.remove(0);
    }

}
