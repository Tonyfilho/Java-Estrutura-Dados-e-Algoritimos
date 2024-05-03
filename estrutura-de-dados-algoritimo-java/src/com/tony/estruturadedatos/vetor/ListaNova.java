package com.tony.estruturadedatos.vetor;

import com.tony.estruturadedatos.base.EstruturaEstatica;

/**Extendemos a SuperClass */
public class ListaNova <T> extends EstruturaEstatica<T>{
    
    /**Iremos Implementar os 2 Contrutores da SuperClasse usando Super() */
     /**1ª Construtor Vazio */

     public ListaNova () {
        super(); 
     }
     public ListaNova (int capacidade) {
        super(capacidade); 
     }

     /**Iremos Implementar os Metodos e po-los   como protect , somente quem extender conseguirá ter acesso*/
     /**Metodos sobre Escritos */
    @Override
    protected Boolean adiciona(T elemento) {
        
        return super.adiciona(elemento); /**Temos q fazer ref. a SuperClasse e passar o Paramentro elemento */
    }
    @Override
    protected Boolean adiciona(int posicao, T elemento) {
       
        return super.adiciona(posicao, elemento);  /**Temos q fazer ref. a SuperClasse e passar o Paramentro elemento */
    }
    @Override
    protected int vertorTamanho() {
       
        return super.vertorTamanho();
    }
    @Override
    protected T remove(int posicao) {
        
        return super.remove(posicao);
    }

    


     

}
