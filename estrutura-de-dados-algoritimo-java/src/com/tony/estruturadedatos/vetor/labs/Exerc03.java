package com.tony.estruturadedatos.vetor.labs;

import com.tony.estruturadedatos.vetor.Lista2;

public class Exerc03 {


    public static void main(String[] args) {
        Lista2<Integer> exerciciosFeitos = new Lista2<Integer>(5);
    
        exerciciosFeitos.add(1);
        exerciciosFeitos.add(2);
        exerciciosFeitos.add(3);
        exerciciosFeitos.add(1);
    
    
        System.out.println("Array antes da remoção: "+ exerciciosFeitos + " Elemento removido: " + exerciciosFeitos.removeLocal(1));
        System.out.println("Array depois da remoção: "+ exerciciosFeitos);
        System.out.println("Array antes da 2ª remoção: "+ exerciciosFeitos + " Elemento removido: " + exerciciosFeitos.removeLocal(1));
        System.out.println("Array depois da 2ª remoção: "+ exerciciosFeitos);
        
        System.out.println("Array antes da 3ª remoção que não existe error: "+ exerciciosFeitos + " Elemento removido: " + exerciciosFeitos.removeLocal(1));
    }
}
