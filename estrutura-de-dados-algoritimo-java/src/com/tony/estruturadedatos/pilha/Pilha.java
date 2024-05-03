package com.tony.estruturadedatos.pilha;

import com.tony.estruturadedatos.base.EstruturaEstatica;

/**Temos que parametrizar com Generics <T> */
public class Pilha<T> extends EstruturaEstatica<T> {
    /** Teremos 2 construtores, 1 sem nada e outro passando a capacidade */
    public Pilha() {
        super(); /** Ref. O construtor da SuperClass */
    }

    public Pilha(int capacidade) {
        super(capacidade); /** Ref. O construtor da SuperClass e passando Parametros */
    }

}
