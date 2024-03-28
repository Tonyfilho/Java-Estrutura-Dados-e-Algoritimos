package com.tony.estruturadedatos.vetor;

import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int elementos) {
        this.elementos = new String[elementos];
        this.tamanho = 0;
    }

    /** esta gera uma erro por falta de controle de tamanho */
    public void adicionaSemControleDeTamanho(String elemento) {
        for (int i = 0; i < this.elementos.length; i++) {

            if (this.elementos[i] == null) {
                this.elementos[i] = elemento;
                break;
            }
            System.out.println("Itens sem controle de tamanho: " + elementos[i]);
        }

    }

    /** esta é protegido do erro por causa do Try and Catch */
    public void adicionaComControleDeTamanho(String elemento) throws Exception {
        if (this.tamanho < this.elementos.length) {
            elementos[this.tamanho] = elemento;
            tamanho++;

        } else {
            throw new Exception("Array is Full");
        }
        for (int i = 0; i < this.elementos.length; i++) {

            if (this.elementos[i] == null) {
                break;
            }
            System.out.println("Itens Com controle de tamanho: " + this.elementos[i]);

        }
    }

    /**
     * esta Não gera Error, por retornar um bolean, é a melhor opção para
     * vetores/arrays
     */
    public Boolean adicionaComBoolean(String elemento) {
        if (this.tamanho < this.elementos.length) {
            elementos[this.tamanho] = elemento;
            tamanho++;
            return true;
        } else {
            return false;
        }
    }

    /** metodo para retornar uma tamanho do Vetor */

    public int vertorTamanho() {
        return this.tamanho;
    }

    /******************************* Aula 04 Retornar um Elemento do Vetor */

    /** Classe Array do Java*********************Usaremos o ToString */
    @Override
    public String toString() {
        return "Vetor [elementos=" + Arrays.toString(elementos) + "]";
    }

    /** Retornando somente os Elementos que existem no Vetor sem os Nulos */

    public String toStringSemNUlls() {

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

    /**************************** Aula 05 Retornar um Elemento do Vetor */
    /**
     * Observação tem q ser do mesmo TIPO, neste caso o Vetor é de String o metodo
     * tem q retornar uma String
     */
    public String buscaElementoComError(int posicao) {

        return this.elementos[posicao];
    }

    public String buscaElementoComExeptions(int posicao) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posiçao invalida");
        }
        return this.elementos[posicao];
    }

}
