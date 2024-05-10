package com.tony.estruturadedatos.fila.teste;

import com.tony.estruturadedatos.fila.queeuEx.QueUeClass;
import com.tony.estruturadedatos.fila.queeuEx.QueUeInter;

/**Esta Aula é para mostrar o comportamento de Uma Tipagem de Interface Vs Implementação. */
public class Aula23 {

    public static void main(String[] args) {
        QueUeInter localInter = new QueUeClass();

        QueUeClass locaClass = new QueUeClass();
        
        localInter.testes();

        locaClass.fazAlgo();
        locaClass.desFazAlgo();
        locaClass.testes();
       
    }
    


    
}
