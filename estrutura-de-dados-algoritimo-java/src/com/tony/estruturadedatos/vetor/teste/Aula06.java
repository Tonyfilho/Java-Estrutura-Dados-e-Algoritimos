package com.tony.estruturadedatos.vetor.teste;

import com.tony.estruturadedatos.vetor.Vetor;

public class Aula06 {
    public static void main(String[] args) {
          Vetor v = new Vetor(10);
        

        v.adicionaComBoolean("Carro");
        v.adicionaComBoolean("onibus");
        v.adicionaComBoolean("motor");

       // v.buscaElementoComError(15); /***Erro por busca posição q não existe */

        
        System.out.println(v.existeElementoBoolean("Carro"));
        System.out.println(v.existeElementoInt("carro"));
        /**Não existe */
        System.out.println(v.existeElementoBoolean("carro10"));
        System.out.println(v.existeElementoInt("carro10"));
    }
}
