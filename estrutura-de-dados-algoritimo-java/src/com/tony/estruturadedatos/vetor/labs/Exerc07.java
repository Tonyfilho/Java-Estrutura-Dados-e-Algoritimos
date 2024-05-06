package com.tony.estruturadedatos.vetor.labs;

import java.util.Scanner;
import java.util.Stack;

import com.tony.estruturadedatos.pilha.Pilha;

/**
 * Neste desafio iremos ver se uma palavra é uma Palíndromo usando a extrutura
 * de PILHA
 */
@SuppressWarnings("resource")
public class Exerc07 {

    public static void main(String[] args) {
        IsPalindromo2();
    }

    /**
     * 1º Metodo Ler informações da Tela
     */

    static String LerInformacaoDigitada() {
        Scanner localScanner = new Scanner(System.in);
        String infoDigitada = "";
        System.out.println("Digite o Palindromo: ");

        /** Proteção caso Digite Letras */
        try {
            return infoDigitada = localScanner.nextLine();

        } catch (Exception e) {
            System.out.println("Invalid Entrace. Must be Number. Try Again \n\n");
        }

        return infoDigitada;
    }

    /**
     * Metodo que receba a Entrada do Scanner e retorne
     * um True ou False
     */
    /**
     * Ex: a palavra ADA ficaria assim:
     * [a]
     * [d]
     * [a]
     * Empilharemos como 1º passo
     * Ao Desempilharmos poderemos comparar os Inversos, visto que a Pilha ou Stack
     * Usa o padrão LIFO
     * Last In, First Out
     * No final poderemos comparar se uma String digitada é a mesma inversa, por
     * cousa do metodo Desempilha
     * que começa pelo final da Pilha
     */

    public static boolean IsPalindromo() {
        String localPalavra = LerInformacaoDigitada();
        String localPalavraInversa = "";
        Pilha<Character> pilha = new Pilha<>();
        /** 1ª passo será empilhar, Pois toda String no Java é um Array de Char */
        for (int i = 0; i < localPalavra.length(); i++) {
            pilha.empilha(localPalavra.charAt(i));
        }
        /** Enquanto a Pilha Não estive vazia, vamos desempilhar */
        /** E Adicionar ou concatenar o caracter */
        while (!pilha.estaVazia()) {
            localPalavraInversa += pilha.desempilha();
        }

        /** compararemos as palavras, se for verdade retorna TRUE */
        if (localPalavraInversa.contains(localPalavra)) {
            System.out.println("A palavra Digitada " + localPalavra + " é um Palindromo");
            return true;
        }

        System.out.println(" A palavra Digitada " + localPalavra + " Nao é um Palindromo");
        return false;
    }

    /**
     * Metodo que receba a Entrada do Scanner e retorne
     * um True ou False
     */
    /**
     * Ex: a palavra ADA ficaria assim:
     * [a]
     * [d]
     * [a]
     * Empilharemos como 1º passo
     * Ao Desempilharmos poderemos comparar os Inversos, visto que o Stack
     * Usa o padrão LIFO
     * Last In, First Out
     * No final poderemos comparar se uma String digitada é a mesma inversa, por
     * cousa do metodo Desempilha
     * que começa pelo final da Stack
     */

    public static boolean IsPalindromo2() {
        String localPalavra = LerInformacaoDigitada();
        String localPalavraInversa = "";
        Stack<Character> stack = new Stack<>();
        /** 1ª passo será empilhar, Pois toda String no Java é um Array de Char */
        for (int i = 0; i < localPalavra.length(); i++) {
            stack.push(localPalavra.charAt(i));
        }
        /** Enquanto a Pilha Não estive vazia, vamos desempilhar */
        /** E Adicionar ou concatenar o caracter */
        while (!stack.empty()) {
            localPalavraInversa += stack.pop();
        }

        /** compararemos as palavras, se for verdade retorna TRUE */
        if (localPalavraInversa.contains(localPalavra)) {
            System.out.println("A palavra Digitada " + localPalavra + " é um Palindromo");
            return true;
        }

        System.out.println(" A palavra Digitada " + localPalavra + " Nao é um Palindromo");
        return false;
    }

}
