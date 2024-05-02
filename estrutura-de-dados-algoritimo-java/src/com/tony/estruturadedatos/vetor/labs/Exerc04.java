package com.tony.estruturadedatos.vetor.labs;

import com.tony.estruturadedatos.vetor.Lista2;

public class Exerc04 {
    
    public static void main(String[] args) {
        Lista2<String> exerciciosFeitos = new Lista2<String>(5);
    
        exerciciosFeitos.add("A");
        exerciciosFeitos.add("B");
        exerciciosFeitos.add("C");
        exerciciosFeitos.add("D");
    
    
        
        System.out.println("Array : "+ exerciciosFeitos + " Elemento Obtido: " );
        System.out.println( exerciciosFeitos.getLocal(2));
        /**Posição invalida */
        System.out.println("Array : "+ exerciciosFeitos + " Elemento Obtido: " );
        System.out.println( exerciciosFeitos.getLocal(10));
        
    }
}
