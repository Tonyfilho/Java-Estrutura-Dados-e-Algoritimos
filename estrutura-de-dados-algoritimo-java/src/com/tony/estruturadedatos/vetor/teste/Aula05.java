package com.tony.estruturadedatos.vetor.teste;

import com.tony.estruturadedatos.vetor.Vetor;

public class Aula05 {
    public static void main(String[] args) {
          Vetor v = new Vetor(10);
        

        v.adicionaComBoolean("Carro");
        v.adicionaComBoolean("onibus");
        v.adicionaComBoolean("motor");

       // v.buscaElementoComError(15); /***Erro por busca posição q não existe */

        
        System.out.println(v.buscaElementoComExeptions(1));
    }
}
