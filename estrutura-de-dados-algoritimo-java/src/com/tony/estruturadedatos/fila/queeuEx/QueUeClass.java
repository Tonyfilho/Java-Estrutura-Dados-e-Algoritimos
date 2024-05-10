package com.tony.estruturadedatos.fila.queeuEx;

/**Esta é uma Classe para vermos o Exemplo o comportamento de uma Tipagem de Uma variavel por uma Interface  */
public class QueUeClass implements QueUeInter{

    public void fazAlgo() {

        System.out.println("**Fez Algo**");
    }
    
    
    public void desFazAlgo() {

        System.out.println("**De Fez Algo**");
    }


    @Override
    public void testes() {
        System.out.println("Sou uma Metodo Implementado: ");
    }
}
