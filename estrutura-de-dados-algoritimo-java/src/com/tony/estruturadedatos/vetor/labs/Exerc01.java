package com.tony.estruturadedatos.vetor.labs;



import com.tony.estruturadedatos.vetor.ExerciciosFeitos;

public class Exerc01 {
    
    public static void main(String[] args) {
        ExerciciosFeitos<String> localArray = new ExerciciosFeitos<String>(5);
        localArray.add("A");
        localArray.add("B");
        localArray.add("C");


       System.out.println(localArray.containsBoolean("D"));
       System.out.println(localArray.containsInt("C"));

    }

}
