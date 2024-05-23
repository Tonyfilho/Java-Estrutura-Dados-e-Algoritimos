package com.tony.estruturadedatos.lista;


/**Lembrando que cada Lista Encadiada tem 1 NÓ e cada NÓ tem 2 informações. */
/**
 * Colocamos a nos classe como Generica para ter qualquer tipo, Numero, string e Objetos.
 * 1ª Criar no metodo adciona, mas o Nó é algo Interno da Classe.
 */
public class ListaEncadeada <T>{
    private No<T> inicio;

    public void adiciona(T elemento) {
        No<T> celula = new No<T>(elemento);
        this.inicio = celula;

    }






    
    @Override
    public String toString() {
        return "ListaEncadiada.inicio=" + inicio + "]";
    }




    
  

}
