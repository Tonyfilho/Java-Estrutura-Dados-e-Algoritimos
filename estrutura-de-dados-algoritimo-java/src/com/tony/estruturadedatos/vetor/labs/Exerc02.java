package com.tony.estruturadedatos.vetor.labs;

import com.tony.estruturadedatos.vetor.Lista2;


public class Exerc02 {

    public static void main(String[] args) {
        Lista2<Integer> exerciciosFeitos = new Lista2<Integer>(5);

        exerciciosFeitos.add(1);
        exerciciosFeitos.add(2);
        exerciciosFeitos.add(3);
        exerciciosFeitos.add(1);


        System.out.println("Array: "+ exerciciosFeitos + " O Ultimo Index é: " + exerciciosFeitos.lastIndexOfLocalErrado(1));
        System.out.println("Array inverso: "+ exerciciosFeitos + " O Ultimo Index é : " + exerciciosFeitos.lastIndexOfLocal(1));


    }
}
