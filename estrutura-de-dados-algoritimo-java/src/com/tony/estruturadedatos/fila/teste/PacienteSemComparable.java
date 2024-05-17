package com.tony.estruturadedatos.fila.teste;

/**
 * Esta Classe foi criada como Ex de Objeto para Não usarmos o Comparable no
 * exercicio 25
 * mas usarmos a interface Queue que receberá uma instancia da classe
 * PriorityQueue, que em seu construtor pode
 * receber uma instancia de um O comparable.
 * Lembrando que uma Inteface Não pode ser instaciada. É VERDADE no java,
 * com excessão se for feita como uma classe ANOMIMA. Veremos isto ao criar a
 * instacia de PriorityQueue(), recebendo a
 * instacia ANONIMA da Interface Comparable().
 */

public class PacienteSemComparable<T> {
    private String nome;

    private int prioridade;

    public PacienteSemComparable(String nome, int prioridade) {
        super();
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public PacienteSemComparable() {

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
        return "PacienteSemComparable [nome=" + nome + ", prioridade=" + prioridade + "]";
    }

}
