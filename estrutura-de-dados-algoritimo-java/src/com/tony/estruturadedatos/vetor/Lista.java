package com.tony.estruturadedatos.vetor;

import java.lang.reflect.Array;

/**
 * Nesta Aula 11, veremos o Uso dos Generics para organizar os Arrays e impedir
 * que se tornem array de ANY ou T q aqui no Java não faz parte do
 * conceito, diferentemente do JS.
 * Copiamos a classe VetorObject e mudaremos o que denovo mudar, usando o
 * GENERICS que foi adcionado no Java 5.
 * Esta classe ficará muito parecido com a classe ArrayList do Java.
 * 1º Criação do Generics <T>
 * 2º Substituição do Object por T que é Type Generico
 * 3º Mudar o Construtor, por padrão não podemos ter instanciar um Vetor
 * Generico no JAVA, por padrão não podemos, teremos que fazer um workaround
 * ou usarmos uma API chamada REFLEXON. Reflexon é uma API que permite o acesso
 * DIMAMICAMENTE de Classes e Atributos e ter esta infomação manipulada.
 * Obs: Temos 2 ex: de contrutores, o 1ºe é a melhor opção
 * 4º No construtor  temos que passar o Tipo de Classe em forma de Generics Ex:  Class<T> tipoDeCLass;
 * 5º Ou No Construtor usar o Cast Generics junto com o tipo (T[]) new Object[elements];
 * 6ª Mudar onde temos Object por "T"
 *
 */

 @SuppressWarnings("unchecked")
public class Lista<T> {

    private T[] elementos;
    private int tamanho;

    public Lista(int elemento) {      
        this.elementos =  (T[]) new Object[elemento]; /**Esta é a Solução do Livre Effective Java, que esta no Diretorio assets\eBook-Effective-java */
        this.tamanho = 0;
    }

    public Lista(int elementos, Class<T> tipoDeCLass) {      
        this.elementos = (T[]) Array.newInstance(tipoDeCLass, elementos);
        this.tamanho = 0;
    }

    /**
     * esta Não gera Error, por retornar um bolean, é a melhor opção para
     * vetores/arrays
     */
    public Boolean adiciona(T elemento) {
        this.aumentaCapacidade();
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

    public T busca(int posicao) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posiçao invalida");
        }
        return this.elementos[posicao];
    }

    /**************************** Aula 06 verificar se o elemento existe */

    /** O mesmo metodo retornando a POSIÇÃO */
    public int busca(T elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            /**
             * Obs: Como String no Java é um Objeto não se pode usar == para fazer
             * comparações e sim o equalsIgnoreCase ou equals
             */
            if (this.elementos[i].equals(elemento)) {
                return i;
            }

        }
        return -1;
    }

    public Boolean adicionaSemRemoverOExistente(int posicao, T elemento) {
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

    /****************************
     * Aula 08 Aumentar a capacidade no Java no C e no C# e outros a UNICA forma de
     * fazer isto é Criar um NOVO ARRAY.
     */

    private void aumentaCapacidade() {
        if (this.elementos.length == this.tamanho) {
            
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    /****************************
     * Aula 09 Elemento do Array
     */

    public void remove(int posicao) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posiçao invalida");
        }
        for (int index = posicao; index < this.tamanho - 1; index++) {
            this.elementos[index] = this.elementos[index + 1];
        }
        this.tamanho--;
    }
}
