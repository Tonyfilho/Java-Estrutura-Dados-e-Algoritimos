package com.tony.estruturadedatos.fila.teste;

import com.tony.estruturadedatos.fila.Fila;

/**
 * Nesta Aula testaremos o Metodo Desenfileirar ou Remove que tem de remover o 1º Elementos ou
 * seja Index 0 e reloca os seguintes.
 */
public class Aula21 {

    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<Integer>();

        fila.enfileirar(100);
        fila.enfileirar(200);
        fila.enfileirar(300);
        fila.enfileirar(400);
        fila.enfileirar(500);
        System.out.println("Nossa Fila Antes do Desenfileirar: " + fila);
        System.out.println("Este é o tamanho da nossa Fila: " + fila.tamanho());
        System.out.println("Elemento Desenfileirado pela 1ª X: " + fila.desenfileirado());
        System.out.println("Este é o tamanho da nossa Fila depois do Desenfileirar pela 1ª X: " + fila.tamanho());
        System.out.println("Nossa Fila depois do Desenfileirar: " + fila);
        System.out.println("Elemento Desenfileirado pela 2º X: " + fila.desenfileirado());
        System.out.println("Este é o tamanho da nossa Fila depois do Desenfileirar pela 2ª X: " + fila.tamanho());
        System.out.println("Nossa Fila depois do Desenfileirar pela 2º X: " + fila);

    }
}
