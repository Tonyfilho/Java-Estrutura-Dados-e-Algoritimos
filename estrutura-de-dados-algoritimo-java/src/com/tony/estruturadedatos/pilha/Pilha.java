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


    /**Aula 14 */
    /**Metodo Empilha, o mesmo do Adiciona, mas é para Pilha, sempre no Final
     * 1ª será Garantir uma Aumento de capacidade, automatico, para n termos erro.
     */
    public void empilha(T elemento) {
     super.adiciona(elemento);

    }


    @Override
    public T remove(int posicao) {        
        return super.remove(posicao);
    }

    @Override
    public int tamanho() {
        
        return super.tamanho();
    }



    

}
