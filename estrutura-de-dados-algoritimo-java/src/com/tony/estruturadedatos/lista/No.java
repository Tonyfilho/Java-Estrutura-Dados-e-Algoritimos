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




    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((elemento == null) ? 0 : elemento.hashCode());
        result = prime * result + ((proximo == null) ? 0 : proximo.hashCode());
        return result;
    }




    @Override
    @SuppressWarnings("unchecked")
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        No<T> other = (No<T>) obj;
        if (elemento == null) {
            if (other.elemento != null)
                return false;
        } else if (!elemento.equals(other.elemento))
            return false;
        if (proximo == null) {
            if (other.proximo != null)
                return false;
        } else if (!proximo.equals(other.proximo))
            return false;
        return true;
    } 



    
    



    
    
}
