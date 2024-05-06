package com.tony.estruturadedatos.fila.teste;

import com.tony.estruturadedatos.fila.Fila;
/**Aula 19 é para testat o Metodo Enfilerar, que precisa adcionar no final da fila */
public class Aula19 {
    
    public static void main(String[] args) {
        
        Fila<Integer> fila = new Fila<Integer>();

        System.out.println("Fila: " +fila);
        System.out.println("Metodo Herdado  hashCode: " +fila.hashCode());
        System.out.println("Metodo Herdado Esta Vazia: " +fila.estaVazia());
        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);
        fila.enfileirar(4);
        fila.enfileirar(5);
        System.out.println("Elemento Enfilerados: " +fila);
    }
}
