package com.tony.estruturadedatos.base;

@SuppressWarnings("unchecked")
public class EstruturaEstatica<T> {

   protected T[] elementos;
   protected int indexTamanho;

    /**
     * Esta é a Solução do Livre Effective Java, que esta no Diretorio
     * assets\eBook-Effective-java
     */

    
    public EstruturaEstatica(int elemento) {
        this.elementos = (T[]) new Object[elemento];
        this.indexTamanho = 0;
    }
    
    public EstruturaEstatica() {
       this(10);
    }


    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.indexTamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if (this.indexTamanho > 0) {
            s.append(this.elementos[this.indexTamanho - 1]);
        }
        s.append("]");
        return s.toString();
    }

   //protected void aumentaCapacidade() {
   private void aumentaCapacidade() {
        if (this.elementos.length == this.indexTamanho) {
            
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public int tamanho() {
        return this.indexTamanho;
    }

    protected Boolean adiciona(T elemento) {
        this.aumentaCapacidade();
        if (this.indexTamanho < this.elementos.length) {
            elementos[this.indexTamanho] = elemento;
            indexTamanho++;
            return true;
        } else {
            return false;
        }
    }

    protected Boolean adiciona(int posicao, T elemento) {
        if (!(posicao >= 0 && posicao < this.indexTamanho)) {
            throw new IllegalArgumentException("Posiçao invalida");
        }
        this.aumentaCapacidade();
        // mover todos os elementos para frente
        for (int i = this.indexTamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i]; // Vetor 4+1(5), irá receber a Posição 4
        }
        // salvar posicao
        this.elementos[posicao] = elemento;
        // Incrementar o tamanho
        this.indexTamanho++;

        return true;
    }


  

    protected T remove(int posicao) {
        T removed = this.elementos[posicao];
        if (!(posicao >= 0 && posicao < this.indexTamanho)) {
            throw new IllegalArgumentException("Posiçao invalida");
        }
        for (int index = posicao; index < this.indexTamanho - 1; index++) {
            this.elementos[index] = this.elementos[index + 1];
        }
        this.indexTamanho--;

        return removed;
    }

}
