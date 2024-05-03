package com.tony.estruturadedatos.pilha.teste;

import com.tony.estruturadedatos.pilha.Pilha;

/**Esta Aula 16 é de teste de Pilha Vazia */
public class Aula16 {
    
    public static void main(String[] args) {
        
        Pilha<Integer> pilha = new Pilha<Integer>();

        System.out.println("Nossa Pilha esta Vazia? Se for Null é Sim: " + pilha.topo());

         pilha.empilha(1);
         pilha.empilha(2);
         pilha.empilha(3);
         pilha.empilha(4);
        System.out.println("Apos a Adição de Elmentos na Pilha: " + pilha.topo());
    }
}
