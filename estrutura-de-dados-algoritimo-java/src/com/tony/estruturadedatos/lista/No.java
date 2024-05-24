package com.tony.estruturadedatos.lista;

/**
 * O Nosso NÓ vai ser do tipo Objeto, pois sendo Objeto pode ser qualquer coisa.
 * 2ª Atributo é o Proximo Elemento que ser
 * a do Tipo NÓ e Generics <T>
 * 3º Por o Proximo no construtor como Nulo;
 * 4º  Temos o construtor Normal atribuindo todos os valores
 */
public class No <T> {

    private T elemento;

    private No<T> proximo;

  


    public No(T elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }




    public No(T elemento, No<T> proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }






    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }



    public No<T> getProximo() {
        return proximo;
    }
    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }
    @Override
    public String toString() {
        return " No.elemento=" + elemento + ", No.proximo=" + proximo + " ";
    } 



    



    
    
}
