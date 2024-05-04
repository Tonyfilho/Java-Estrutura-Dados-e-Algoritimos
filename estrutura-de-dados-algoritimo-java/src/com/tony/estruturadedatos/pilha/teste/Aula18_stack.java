package com.tony.estruturadedatos.pilha.teste;

import java.util.Stack;

import com.tony.estruturadedatos.pilha.Pilha;

/**
 * Nesta Aula conheceremos a API de STACk do Java que faz praticamente o que
 * estudamos aqui
 */
public class Aula18_stack {
    public static void main(String[] args) {

        /** Temos a classe Pilha q fizemos */
        @SuppressWarnings("unused")
        Pilha<Integer> pilha = new Pilha<Integer>();

        /***Temos  a classe Stack da APi do Java.Utils */
        Stack<Integer> stack = new Stack<Integer>();

        /**è muito parecido, vamos ver se a pilha está vazia */
        System.out.println("1 A Pilha esta Vazia?: "+ stack.isEmpty());



        /**Adicionando na pilha */

        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);


        System.out.println("2 pilha depois do Add(): " + stack);
        
        System.out.println("3 A Pilha esta Vazia?: "+ stack.isEmpty());
        
        
        /**** Empilhando usando Push() */
        
        stack.push(5);
        stack.push(6);
        stack.push(7);

        int intlocal = stack.push(100);
        
        System.out.println("4 pilha depois do Push(): " + stack + " Retorno do Push(): " +intlocal);
        
        System.out.println("5 Pilha Atual: "+ stack);
        
        /******Pilha Tamanho***** Usando Size() */
        
        System.out.println("6 pilha size(): " + stack.size());
        System.out.println("7 Pilha Atual: "+ stack);
        
        
        /******Pilha Espiar***** Usando Peek() */        
        System.out.println("8 pilha peek(): " + stack.peek());



        /*****Pilha Desempilha********Usando Pop() */

        
        System.out.println("9 Apos a desempilha Pop()"+ stack.pop());
        
        System.out.println("10 Pilha Atual: "+ stack);




    }
}
