package com.tony.estruturadedatos.vetor.labs;

import com.tony.estruturadedatos.vetor.ListaObjetos;


public class Exerc02 {

    public static void main(String[] args) {
        ListaObjetos<Integer> exerciciosFeitos = new ListaObjetos<Integer>(5);

        exerciciosFeitos.add(1);
        exerciciosFeitos.add(2);
        exerciciosFeitos.add(3);
        exerciciosFeitos.add(1);


        System.out.println("Array: "+ exerciciosFeitos + " O Ultimo Index é: " + exerciciosFeitos.lastIndexOfLocalErrado(1));
        System.out.println("Array inverso: "+ exerciciosFeitos + " O Ultimo Index é : " + exerciciosFeitos.lastIndexOfLocal(1));


    }
}
