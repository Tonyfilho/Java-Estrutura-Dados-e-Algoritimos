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

    public T espiar () {

        return super.elementos[super.tamanho() -1];
    }

    public T desenfileirado() {
      return this.remove(0);
    }

}
