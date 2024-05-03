package com.tony.estruturadedatos.pilha.teste;

import com.tony.estruturadedatos.pilha.Pilha;

/**Aula 14 é teste do Metodo Pilha(), que é herdado do Metodo Adiciona da SuperClasse EstruturaEstatica */
public class Aula14 {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<Integer>(); /**N vou passar capacidade pois é atribuido automaticamente 10 */


        /** Adcionando mais de 10 itens na pilha */
        for (int i = 0; i <= 14; i++) {
            pilha.empilha(i);
        }

        System.out.println("Tamanho da  Pilha: " + pilha.tamanho());
        System.out.println("Nossa Pilha Aumentada Automaticamente: " + pilha);
        
    }
}
