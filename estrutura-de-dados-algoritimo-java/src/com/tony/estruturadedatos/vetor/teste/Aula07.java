package com.tony.estruturadedatos.vetor.teste;

import com.tony.estruturadedatos.vetor.Vetor;

public class Aula07 {
     public static void main(String[] args) {
          Vetor v = new Vetor(10);
        

        v.adicionaComBoolean("B");
        v.adicionaComBoolean("C");
        
        v.adicionaComBoolean("E");
        v.adicionaComBoolean("F");
        v.adicionaComBoolean("G");

       // v.buscaElementoComError(15); /***Erro por busca posição q não existe */

        
        System.out.println("VETOR: " + v);        
        v.adicionaSemRemoverOExistente(0, "A");        
        System.out.println("VETOR Adcionado (A na posiçao 0): " + v);
        

        System.out.println("VETOR: " + v);
        v.adicionaSemRemoverOExistente(3, "D");        
        System.out.println("VETOR Adcionado (D na posiçao 0): " + v);
     
    }
}
