package com.tony.estruturadedatos.fila.teste;

import com.tony.estruturadedatos.fila.Fila;

/**
 * Aula 20 é para testar o Metodo Espiar, que precisa retornar o ultimo da fila
 */

public class Aula20 {

    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<Integer>();

        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);
        fila.enfileirar(4);
        fila.enfileirar(100);
        System.out.println("Metodo Tamanho Herdado da SuperClasse: " + fila.tamanho());
        System.out.println("teste com metodo Espiar ou Peek: " + fila.espiar());

    }
}
