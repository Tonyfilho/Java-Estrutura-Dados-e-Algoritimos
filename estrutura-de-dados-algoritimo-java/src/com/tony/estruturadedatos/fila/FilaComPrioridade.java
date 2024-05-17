package com.tony.estruturadedatos.fila;

/**
 * Extendemos a Classe Fila , para aproveitar o POO
 * Aqui só temos que mudar o Metodo Enfileirar, pois agora temos que fazer com
 * prioridades.
 * Já temos que Adcionar um Elemento ORDENADO aqui na fila.
 * Vamos para Aula 24 no package Testes.
 * 
 */
public class FilaComPrioridade<T> extends Fila<T> {

    /**
     * Vamos sobre escrever o metodo Enfileirar, pois o mesmo está vindo sem
     * prioridades
     */
    /**
     * Observaremos um problema quando formos Enfileirar Objetos, pois não temos
     * como compara-los
     * diferentemente de um Interge ou Double, ou uma String, mas Comparar uma
     * Classe não tem como.
     * Lembrando que o Objeto do tipo <T> para Java é do Tipo Indefinido então com
     * Compilador não sabe o que vem dentro.
     * Mesmo assim temos que remover os itens repedido não removidos ainda
     * Ou seja não é eficaz esta solução abaixo,
     * 
     * 
     */

    @SuppressWarnings("unchecked")
    public void enfileiraSemObjetos(Integer elemento) {
        this.adiciona((T) elemento);
        for (int i = 0; i < elementos.length; i++) {
            try {
                if (elemento < (Integer) this.elementos[i]) {
                    this.adiciona(i, (T) elemento);
                    break;
                }

            } catch (Exception e) {
                System.out.println("Elemento Nulo");
            }

        }
    }

    /********************
     * Usaremos o Comperable Criamos uma Classe como Ex: de Objetos
     * 1ª cria uma variavel tipada do Comparable.
     * 2º Fazer o Casting para do <T> para Comparable.
     * 3º Fazer a iteração da Fila e a comparação
     * 4ª Si a Chave (que o elemento que vamos adcionar ) for menor que 0, ous eja
     * uma Prioridade menor
     * 5º Por o escopo da var I fora do For para poder ser Usada,
     * 6ª Se achamos a posição daremos um Break;
     * 7º E fora do For adcionaremos na posição salva na ver I.
     */
    @SuppressWarnings("unchecked")   
    public void enfileirar(T elemento) {

        Comparable<T> chave = (Comparable<T>) elemento;
        int i;
        for (i = 0; i < this.tamanho; i++) {
            if (chave.compareTo(this.elementos[i]) < 0) {
                break;
            }
       
        }

      //  System.out.println("Posicao: " + i);
        this.adiciona(i, ((T)chave)); // elemento é a mesma coisa se fazer o Casting

    }

}
