package com.tony.estruturadedatos.pilha.labs;

import java.util.Scanner;
import java.util.Stack;

/** Conversor de Numero Decimal para Binario, usando a pilha */
public class Exerc08 {
    public static void main(String[] args) {
        ImprimeResultados(NumeroDigitado, ConversorBinario());

        ImprimeResultadosBase(NumeroDigitado, ConversorBase(10), 10);
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

    public static String ConversorBinario() {
        String numBinario = "";
        int localNumeroDigitado = NumeroDigitado;
        int resto;
        Stack<Integer> stack = new Stack<>();
        while (localNumeroDigitado > 0) {
            resto = localNumeroDigitado % 2;
            stack.push(resto);
            localNumeroDigitado /= 2; /** numeroDigitado = numeroDigitado / 2 */
        }

        while (!stack.isEmpty()) {
            numBinario += stack.pop();
            System.out.println(numBinario + " \n");
        }
        return numBinario;
    }

    /*************** Converter Numeros para Base 4 , 8 ou 16 etc***************** */
    public static String ConversorBase(int base) {
        String localBase = "";
        int localNumeroDigitado = NumeroDigitado;
        int resto;
        String base8 = "01234567";
        String base16 = "0123456789ABCDF";
        Stack<Integer> stack = new Stack<>();
        while (localNumeroDigitado > 0) {
            resto = localNumeroDigitado % base;
            stack.push(resto);
            localNumeroDigitado /= base; /** numeroDigitado = numeroDigitado / 2 */
        }

        while (!stack.isEmpty()) {
            switch (base) {
                case 16:
                    localBase += base16.charAt(stack.pop());
                    // System.out.println(localBase + " \n");
                    break;
                case 8:
                    localBase += base8.charAt(stack.pop());
                    // System.out.println(localBase + " \n");

                    break;
                default:
                    throw new IllegalArgumentException("Somente Bases 8 ou 16");

            }
        }

        return localBase;
    }

    static void ImprimeResultados(int numeroDigitado, String numConversao) {
        System.out.println("Numero Digitado foi: " + numeroDigitado + " Numero Convertido Binario é: " + numConversao);

    }

    static void ImprimeResultadosBase(int numeroDigitado, String numConversao, int base) {
        System.out.println("Numero Digitado foi: " + numeroDigitado + " Numero Convertido na " + base + " Base é:  "
                + numConversao);

    }
}
