package com.tony.estruturadedatos.pilha.labs;

import java.util.Scanner;

import com.tony.estruturadedatos.pilha.Pilha;

/**
 * Este Exercicio é para testarmos se expressoes matematicas
 * Vamos aqui verificar somente simbolos
 * A + B +(D + C), queremos somente o Simbolos, não queremos as letras e o
 * sinais, somente {},[] e ().
 */
public class Exerc07 {
    public static void main(String[] args) {

        VerificaSimbolosBalanceados();

    }

    /**
     * 1º Metodo Ler informações da Tela
     */

    static String LerInformacaoDigitada() {
        Scanner localScanner = new Scanner(System.in);
        String infoDigitada = "";
        System.out.println("Digite A Expressao: ");

        /** Proteção caso Digite Letras */
        try {
            return infoDigitada = localScanner.nextLine();

        } catch (Exception e) {
            System.out.println("Invalid Entrace. Try Again \n\n");
        }

        return infoDigitada;
    }

    final static String ABRE = "([{";
    final static String FECHA = ")]}";

    /**
     * 1º temos que ver se esta balanceado ou seguenciado, criando uma Flag q recebe
     * TRUE.
     * 2º Temos que ter a Stack e analizar caracter a caracter usando a classe
     * Character.
     * 3º Fazer Iteracao com While ou For
     * 4º E vermos se tem a Iteracao e se esta Balanceado.
     * 5ª verificar se o Simbolo é uma abertura { [ (
     * 6º Empilhar toda a vez q for abertura de Parentese, Cochetes ou Chaves.
     * 7ª Quando encontramos Fechamento Parentese, Cochetes ou Chaves, temos que ver
     * se é do mesmo tipo que haviamos empilhado e sabermos se esta balanceado ou
     * não. Ex: A + B +(D + C) Balanceado ou A + B +(D + C] Desbalanceado.
     * 8º Criaremos uma Constates para fazer as comparações e usareremos o IndexOf()
     * 9º Dentro do Else IF, temos que ver se a Pilha esta vazia ou Despalanceada
     * Ex: A + B ).
     * 10º SI a Pilha esta Vazia?, ja retornaremos um FALSE. E O While Pára.
     * 11º SENAO, desempilharemos para a Var Topo. O Topo é uma Var que vai receber
     * O que foi Empilhado dentro do . Imagine a Expressão ((A + B)+ C + D) onde foi
     * Empilhado ( -> Index 0, ( -> Index 1 . Agora no Topo irá receber istes
     * SIMBOLOS
     * E com isto veremos se ele se encontra na mesma Posição ou Index.
     * Então, se o Simbolo do FECHA estiver na mesma posição do ABRE, quer dizer que
     * Existe Balanceamento ou seja Abre e Fecha de simbolos. Ou seja Estou fechando
     * o que foi aberto.
     * 12º SI Simbolo do ABRE for != Simbolo do FECHA que dizer q estou
     * Desbalanceadoe retorno FALSE ou seja eu Páro o WHILE.
     * 
     *
     */

    static boolean VerificaSimbolosBalanceados() {
        String expressao = LerInformacaoDigitada();
        /**Partiremos do principio de estamos Balanceado */
        /**
         * OBS: Dentro do Diamante so podemos usar Classes Java nunca Tipo Primitivos
         * Ex: Char, usaremos a classe Wrapper.
         */
        Pilha<Character> pilha = new Pilha<>();
        int index = 0;
        char simbolo, topo;
        while (index < expressao.length()) {
            simbolo = expressao.charAt(index);
            if (ABRE.indexOf(simbolo) > -1) {                
                pilha.empilha(simbolo);
            } else if (FECHA.indexOf(simbolo) > -1) {
                  if (pilha.estaVazia()) {                    
                    
                    ImprimeResultados(false);
                    return false;
                } else {                   
                    topo = pilha.desempilha();                    
                    if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) {                  
                        ImprimeResultados(false);
                       return false;
                    }

                }
            }

            index++;
        }

        ImprimeResultados(true);
        return true;

    }

    static void ImprimeResultados(boolean isBalanceado ) {
        System.out.println( " Esta Balanceado? " +  isBalanceado);

    }
}
