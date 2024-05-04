package com.tony.estruturadedatos.pilha.teste;

import com.tony.estruturadedatos.pilha.Pilha;

public class Aula17 {
    public static void main(String[] args) {
        
        Pilha<Integer> pilha = new Pilha<Integer>();


        /**Adcionando na pilha */
        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);
        pilha.empilha(4);

        System.out.println("Nossa Pilha com Tamanho " + pilha.tamanho());
        System.out.println("Nossa Pilha " + pilha +"\n" );

        System.out.println("*************** Desempilha************\n");
        System.out.println("Desempilha(): " + pilha.desempilha());

        System.out.println("*************Pilha*************");
        System.out.println("*********" + pilha + "**************");



    }
}
