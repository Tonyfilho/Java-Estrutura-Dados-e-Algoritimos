package com.tony.estruturadedatos.vetor;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int elementos) {
        this.elementos = new String[elementos];
        this.tamanho = 0;
    }

    public void adicionaSemControleDeTamanho(String elemento) {
        for (int i = 0; i < this.elementos.length; i++) {

            if (this.elementos[i] == null) {
                this.elementos[i] = elemento;
                break;
            }
            System.out.println("Itens sem controle de tamanho: " + elementos[i]);
        }

    }

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

    public Boolean adicionaComBoolean(String elemento) {
        if (this.tamanho < this.elementos.length) {
            elementos[this.tamanho] = elemento;
            tamanho++;
            return true;
        } else {
           return false;
        }
    }

}
