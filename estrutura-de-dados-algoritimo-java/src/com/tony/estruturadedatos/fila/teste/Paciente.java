package com.tony.estruturadedatos.fila.teste;

/**
 * Esta Classe foi criada como Ex de Objeto para usarmos o Comparable no exercicio 24
 */
@SuppressWarnings("rawtypes")
public class Paciente implements Comparable {
    private String nome;

    private Integer prioridade;

    public Paciente(String nome, Integer prioridade) {
        super();
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public Paciente() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Integer prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return "Paciente [nome=" + nome + ", prioridade=" + prioridade + "]";
    }

    /**
     * É esta maneira que usamos para comparar Objetos no java
     * Si Obj1 > Obj2  Si a Prioridade do Paciente1 for maior que a Prioridade do Paciente2 retorna 1 
     * Si Obj1 < Obj2   Si a Prioridade do Paciente1 for menor que a Prioridade do Paciente2  retorna -1
     * Si Obj1 == Obj2 Else se for Iqual retorna  0
     * Lembrando de fazer o Casting de Obejct to Paciente.
     * Lembrando que estamos usando o Atributo Prioridade, mas poderia ser qualquer outro.
     * Ex: Ordenar em ordem alfabetica usando Switch Case. 
     * É dentro deste metodo que usaremos as Chaves de comparações,sendo Ifs e else ou Switch case
     * 
     */
    @Override
    public int compareTo(Object o) {
          if (this.prioridade > (((Paciente)o).getPrioridade())) {
            return 1;
          } else if (this.prioridade < (((Paciente)o).getPrioridade())) {
            return -1;
          } 

       return 0;
    }


    

}
