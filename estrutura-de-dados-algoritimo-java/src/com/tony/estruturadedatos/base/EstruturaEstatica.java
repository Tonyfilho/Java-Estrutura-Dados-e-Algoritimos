package com.tony.estruturadedatos.base;

public class EstruturaEstatica<T> {

    private T[] elementos;
    private int tamanho;

    /**
     * Esta é a Solução do Livre Effective Java, que esta no Diretorio
     * assets\eBook-Effective-java
     */

    
    public EstruturaEstatica(int elemento) {
        this.elementos = (T[]) new Object[elemento];
        this.tamanho = 0;
    }
    
    public EstruturaEstatica() {
       this(10);
    }


    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }
        s.append("]");
        return s.toString();
    }

    private void aumentaCapacidade() {
        if (this.elementos.length == this.tamanho) {
            
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    protected int vertorTamanho() {
        return this.tamanho;
    }

    protected Boolean adiciona(T elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            elementos[this.tamanho] = elemento;
            tamanho++;
            return true;
        } else {
            return false;
        }
    }

    protected Boolean adiciona(int posicao, T elemento) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posiçao invalida");
        }
        this.aumentaCapacidade();
        // mover todos os elementos para frente
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i]; // Vetor 4+1(5), irá receber a Posição 4
        }
        // salvar posicao
        this.elementos[posicao] = elemento;
        // Incrementar o tamanho
        this.tamanho++;

        return true;
    }




}
