package com.tony.estruturadedatos.vetor.labs;

import com.tony.estruturadedatos.vetor.ExerciciosFeitos;

public class Exerc05 {
    
    public static void main(String[] args) {
        ExerciciosFeitos<Integer> exerciciosFeitos = new ExerciciosFeitos<Integer>(5);
    
        System.out.println("1ª Adiçao Array antes da remoçao total:");
        exerciciosFeitos.add(1);
        exerciciosFeitos.add(2);
        exerciciosFeitos.add(3);
        exerciciosFeitos.add(1);
    
    
        System.out.println("Array antes da remoção total: "+ exerciciosFeitos + " Elemento removido: ");
        exerciciosFeitos.clearLocal();
        System.out.println("Array depois da remoção: "+ exerciciosFeitos);

        
        /********************Metodo 03 */
        System.out.println("2 ª Adiçao Array antes da remoçao total:");
        exerciciosFeitos.add(1);
        exerciciosFeitos.add(2);
        exerciciosFeitos.add(3);
        exerciciosFeitos.add(1);
        
        
        System.out.println("Array antes da remoção total: "+ exerciciosFeitos + " Elemento removido: ");
        exerciciosFeitos.clearLocal3();
        System.out.println("Array depois da remoção: "+ exerciciosFeitos);

        
        /********************Metodo 03 teste adcionar */
        System.out.println("3ª Adiçao Array antes da remoçao total:");
        exerciciosFeitos.add(1);
        exerciciosFeitos.add(2);
        exerciciosFeitos.add(3);
        exerciciosFeitos.add(1);
        System.out.println("Array depois da  3ª Adção: "+ exerciciosFeitos);
    }
}
