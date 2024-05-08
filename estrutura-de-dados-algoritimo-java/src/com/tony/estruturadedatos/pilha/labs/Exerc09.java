package com.tony.estruturadedatos.pilha.labs;

import java.util.Scanner;
import java.util.Stack;

/**
 * Este é Exercicio desafio Torre de Hanoi e a STACK é a melhor forma de se
 * resolver se empilharmos sempre o Menor para Maior. E Depois desempilharmos pela ordem.
 * Observem q este disco estão em forma de pilhas.
 * A formula é (2 Expoente N) -1 , onde N é numero de Circulos ou a quantidade de Circulos da Torre
 * Terems que fazer  um Metodo RECURSIVO, ou seja ele volta a chama-lo 
 */
public class Exerc09 {
    public static void main(String[] args) {
        Stack<Integer> original = new Stack<>(); 
        Stack<Integer> destino = new Stack<>(); 
        Stack<Integer> auxiliar = new Stack<>(); 
        /**Adcionando itens a Pilha Original */
        AdicionaDisco( original);
        /** */

        TorreDeHanoi(NumeroDigitado, original, destino, auxiliar);
        

    }

    /**
     * 1º Metodo Ler informações da Tela somente de Numeros
     */

    public static int LerInformacaoDigitadaInt() {
        try (Scanner localScanner = new Scanner(System.in)) {
            int infoDigitada = 0;
            System.out.println("Digite o Numero: ");

            /** Proteção caso Digite Letras */
            try {
                return infoDigitada = Integer.parseInt(localScanner.nextLine());

            } catch (Exception e) {
                System.out.println("Invalid Entrace. Try Again \n\n");
            }

            return infoDigitada;
        }
    }

    final static int NumeroDigitado = LerInformacaoDigitadaInt();

    /**
     * 1ª Criar um Metodo Recursivo reecebendo as Pilha na ordem Original, Destino e Auxiliar
     * 2º Vermos se o nDisco é maior que 0.
     * 3º Na Recursiva, O disco fica com -1, e Auxiliar toma o Lugar do Destino
     * 4ª O Destino recebe o Desempilha
     * 5º Outra vez a Recursividade

    /** */
    public static void TorreDeHanoi( int nDisco, Stack<Integer> original,   Stack<Integer> destino, Stack<Integer> auxiliar ) {
                   
                   if (nDisco > 0) {
                       TorreDeHanoi( nDisco -1, original, auxiliar, destino);
                       destino.push(original.pop());
                       System.out.println("------------- \n");
                       System.out.println("Original " +  original);
                       System.out.println("Destino " +  destino);
                       System.out.println("Auxiliar " +  auxiliar);
                       TorreDeHanoi( nDisco -1,  auxiliar, destino, original);
                    
                   }

    }

    public static Stack<Integer> AdicionaDisco ( Stack<Integer> localOriginal) {
        for (int i = 0; i < NumeroDigitado; i++) {
            localOriginal.push(i);
        }
        System.out.println("Original: " + localOriginal);
        return localOriginal;
    }
}
