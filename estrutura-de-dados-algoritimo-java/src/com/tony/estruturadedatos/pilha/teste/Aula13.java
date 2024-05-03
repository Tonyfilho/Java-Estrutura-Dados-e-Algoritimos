package com.tony.estruturadedatos.pilha.teste;

import com.tony.estruturadedatos.pilha.Pilha;

/**Esta éa  Aula 13 onde teremos acesso ao Metodos da SuperClasse Generica Estrutura Static */
public class Aula13 {
    public static void main(String[] args) {
        /**Dentro do Generics Temos que Passar CLasses, e não Primitivos 
         * Como Usaremos um Int, temos q passar seu WRAPPER neste caso Integer
        */

        Pilha<Integer> pilha = new Pilha<Integer>(); /**N vou passar capacidade, pois ja será Herdado o valor 10 */

        /**Ja teremos o ToString Herdado da Superclass, com isto conseguimos imprimir  */
        System.out.println("ToString Herdado: " + pilha);
        System.out.println("Tamanho Herdado: " + pilha.tamanho());

    }
}
