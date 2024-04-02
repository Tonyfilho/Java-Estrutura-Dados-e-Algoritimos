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

    /**************************** Aula 06 verificar se o elemento existe */
    /**
     * Observacao podemos usar um metodo Boolean ou Int
     * Caso ache ele retorna true
     */

    public Boolean existeElementoBoolean(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            /**
             * Obs: Como String no Java é um Objeto não se pode usar == para fazer
             * comparações e sim o equalsIgnoreCase ou equals
             */
            if (this.elementos[i].equals(elemento)) {
                return true;
            }

        }
        return false;
    }

    /** O mesmo metodo retornando a POSIÇÃO */
    public int existeElementoInt(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            /**
             * Obs: Como String no Java é um Objeto não se pode usar == para fazer
             * comparações e sim o equalsIgnoreCase ou equals
             */
            if (this.elementos[i].equalsIgnoreCase(elemento)) {
                return i;
            }

        }
        return -1;
    }

    /****************************
     * Aula 07 Adicionar novo elemento em uma posição sem remover o existente
     */
    /**
     * 1º Passo é ver se a posição existe
     * 2º Criar um FOR que irá inicialiar com o tamanho -1 >= posicao
     * 3º Obs: o i = tamanho -1, para sempre salvar a posição anterior, ou seja
     * quando tamanho for 5 (-1), virará Index 4 e salvará o index 5 anterior
     * 4º Decrementar, pois iremos Iterar de traz para Frente
     * 5º Mover os elemento para uma posição para frente
     * 6º Salvar o novo elemento
     * 7º Incrementar o tamanho
     */
    public Boolean adicionaSemRemoverOExistente(int posicao, String elemento) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posiçao invalida");
        }
        //mover todos os elementos para frente
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i]; // Vetor 4+1(5), irá receber a Posição 4
        }
        //salvar posicao
        this.elementos[posicao] = elemento;
        //Incrementar o tamanho
        this.tamanho++;
    

        return true;
    }

}
