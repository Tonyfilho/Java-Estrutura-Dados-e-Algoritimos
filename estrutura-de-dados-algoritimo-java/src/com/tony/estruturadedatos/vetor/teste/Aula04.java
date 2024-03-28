package com.tony.estruturadedatos.vetor.teste;

import com.tony.estruturadedatos.vetor.Vetor;

public class Aula04 {
    public static void main(String[] args) {
        Vetor v = new Vetor(10);
        

        v.adicionaComBoolean("Carro");
        v.adicionaComBoolean("onibus");
        v.adicionaComBoolean("motor");


        System.out.println("Tamanho do vetor :" + v.vertorTamanho());

        /**Usando ToString */
        System.out.println("ToString :" + v);


        /**Usando StringBuilder com Tostring Eliminando os Nullos */
        System.out.println("Sem Nullos :" + v.toStringSemNUlls());
    }
}
