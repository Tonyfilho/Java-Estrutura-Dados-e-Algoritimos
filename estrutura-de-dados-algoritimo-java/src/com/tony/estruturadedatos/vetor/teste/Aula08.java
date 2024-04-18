package com.tony.estruturadedatos.vetor.teste;

import com.tony.estruturadedatos.vetor.Vetor;

public class Aula08 {
     public static void main(String[] args) {
        /**
         * Criaremos um Array de capacidade 3 e adcionaremos 5 itens
         */
          Vetor v = new Vetor(3);
        

        v.adicionaComBoolean("B");
        v.adicionaComBoolean("C");
        v.adicionaComBoolean("E");
        /**
         * Imprimiremos o Vetor Antes de invocação do metodo aumentaTamanho()
         */        
         System.out.println("VETOR Antes de Aumentar .lenght(): " + v.vertorTamanho());    
        System.out.println("VETOR Antes de Aumentar: " + v);    
        v.adicionaComBoolean("F");
        v.adicionaComBoolean("G");
        
        
        /**
         * Imprimiremos o Vetor Imprimiremos o Vetor Depois de invocação do metodo aumentaTamanho()
         */        
        System.out.println("VETOR Depois de  Aumentar .lenght(): " + v.vertorTamanho());    
        System.out.println("VETOR Antes de Aumentar: " + v);    
        

     
      
     
    }
}
