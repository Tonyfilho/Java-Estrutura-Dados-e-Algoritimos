package com.tony.estruturadedatos.fila;

import java.util.LinkedList;
import java.util.Queue;

/**Aqui no Queue é uma Interface , que precisa de TIPADA e não Implementada*/
public class LocalQueue {
    public static void main(String[] args) {

        Queue<Integer> fila = new LinkedList<Integer>() ;

        /**Temos o Add() q emoutras liguagens se chama Enqueue */

        fila.add(1);  //**Adciona no fim da fila */
        fila.add(2);  //**Adciona no fim da fila */
        fila.add(3);  //**Adciona no fim da fila */
        


        System.out.println("Foi adicionado 3 elementos: " + fila.toString());
        
        
        /**Remove(), que rem,ove somente a 1º posição por causa da Tipagem */
        fila.remove(2);
        System.out.println("Foi adicionado 3 elementos: " + fila.toString());
        
        /**Peek() , ou seja o espia que retorna a proixma posição a ser removida */
        int elemento =  fila.peek();
        System.out.println("Foi adicionado 3 elementos: " + elemento);

    }
}
