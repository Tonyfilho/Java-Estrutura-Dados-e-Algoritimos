package com.tony.estruturadedatos.fila.labs;

import com.tony.estruturadedatos.fila.Fila;

/**
 * 01 Exercicio , Usar a estrutura de dados. Crie uma fila de documentos que precisam ser 
 * impressos.
 * Cada documentos é composto de uma nome e quantidade de folhas a serem impressos.
 * O programa deve Enfileirar os documentos. E seguindo a ordem , o programa deve imprimir
 * cada documento e desenfileirar da fila. 
 */
public class Exerc01 {

    public static void main(String[] args) {
        Fila<Documentos> filaImpressora = new Fila<>();

        filaImpressora.enfileirar(new Documentos("A", 1));
        filaImpressora.enfileirar(new Documentos("B", 5));
        filaImpressora.enfileirar(new Documentos("C", 9));
        filaImpressora.enfileirar(new Documentos("D", 10));
        filaImpressora.enfileirar(new Documentos("E", 2));
        filaImpressora.enfileirar(new Documentos("F", 6));

        System.out.println("Fila " + filaImpressora);
        
        while (!filaImpressora.estaVazia()) {
            Documentos doc = filaImpressora.desenfileirado();
            System.out.println("Documento Impresso e desenfileirado: " + doc.getNome());
            /**Simulando uma impressão com Tread */
            try {
                Thread.sleep(200 * doc.getNumFolhas());
            } catch (InterruptedException e) {
                System.out.println("Erro da Impressão" + e);
                e.printStackTrace();
            }
        }
        System.out.println("Todos os Documentos foram impressos " + filaImpressora);
        
    }



    
}
