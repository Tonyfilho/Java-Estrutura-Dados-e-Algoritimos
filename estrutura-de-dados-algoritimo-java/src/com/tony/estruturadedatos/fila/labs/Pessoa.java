package com.tony.estruturadedatos.fila.labs;

/***
 * Lembrando que o metodo EnfileraComrioridade usa o a Interface Comparable,
 * Então esta inteface TEM q ser implementada aqui.
 */
public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int prioridade;

    public Pessoa() {

    }

    public Pessoa(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return "Pessoa.nome = " + nome + ", Pessoa.prioridade = " + prioridade + "; ";
    }

    @Override
    public int compareTo(Pessoa o) {
        if (this.prioridade > o.getPrioridade()) {
            return 1;
        } else if (this.prioridade < o.getPrioridade()) {
            return -1;
        }

        return 0;
    }

}
