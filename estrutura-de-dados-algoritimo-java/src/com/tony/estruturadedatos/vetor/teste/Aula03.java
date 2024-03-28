package com.tony.estruturadedatos.vetor.teste;

import com.tony.estruturadedatos.vetor.Vetor;

public class Aula03 {
    

    public static void main(String[] args) {
       Vetor v = new Vetor(5);
        v.adicionaSemControleDeTamanho("Carro");
        v.adicionaSemControleDeTamanho("onibus");


        Vetor v2 = new Vetor(2);
        try {
            v2.adicionaComControleDeTamanho("Carro");
            v2.adicionaComControleDeTamanho("onibus");
            v2.adicionaComControleDeTamanho("motor");
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        

         /**Com o Bollean não precisa de try and catch */
        Vetor v3 = new Vetor(2);
        v3.adicionaComBoolean("Carro");
        v3.adicionaComBoolean("onibus");
        v3.adicionaComBoolean("motor");
        
    }
}
