package com.tony.estruturadedatos.pilha.teste;

import com.tony.estruturadedatos.pilha.Pilha;

/**Aula 15 teste do metodo que checa se esta Vazio e retorna TRUE */
public class Aula15 {


    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();


        System.out.println("Pilha esta Vazia: " + pilha.estaVazia());
        
        pilha.empilha(1);
        
        System.out.println("Pilha esta Vazia Apos o Metodo Empilha?: " + pilha.estaVazia());
    }
}
