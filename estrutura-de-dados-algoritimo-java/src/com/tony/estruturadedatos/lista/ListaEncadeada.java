package com.tony.estruturadedatos.lista;

/**Lembrando que cada Lista Encadiada tem 1 NÓ e cada NÓ tem 2 informações. */
/**
 * Colocamos a nos classe como Generica para ter qualquer tipo, Numero, string e
 * Objetos.
 * 1ª Criar no metodo adciona, mas o Nó é algo Interno da Classe.
 */
public class ListaEncadeada<T> {
    private No<T> inicioNO;

    private No<T> ultimoNO;

    private int tamanho;

    private final int NAO_ENCONTRADO = -1;

    /**
     * temos 2 casos aqui:
     * 1ª Se o tamanho é Iqual a Zero, crimos um NÓ, e inicio e ultimo passa a ser o
     * novoNó.
     * 2ª Senão setaremos usando ou Set ou o construtor q recebe alem do elemento a
     * posição
     * 
     * 
     */
    @SuppressWarnings({ "rawtypes", "unchecked"})
    public void adcionaNoInicio(T elemento) {
        if (this.tamanho == 0) {
            No<T> novoNo = new No(elemento);
            this.inicioNO = novoNo; // inicio recebe o novo
            this.ultimoNO = novoNo; // ultimo recebe o novo
        } else {
            No<T> novoNo = new No(elemento, this.inicioNO);
           this.inicioNO = novoNo;
        }
        this.tamanho++;
    }

    public void adiciona(T elemento) {
        No<T> celula = new No<T>(elemento);
        /** Criando o NO */
        /** Tamanho esta VAZIO ? Atualiza o InicioNO, senão o UltimoNO. */
        if (tamanho == 0) {
            this.inicioNO = celula; /**
                                     * Si Tamanho for ZERO ( 0 ) pegaremos o IncioNO e --> Apontaremos para Celula.
                                     */
        } else {
            /**
             * Se a Lista não tiver Vazia, ou seja tem Data,
             * Setaremos o UltimoNO, receberá a Celula.
             * Observe que a Variavel MUDOU de
             * COMPORTAMENTO
             */
            // this.ultimoNO = celula; /**error */
            // this.ultimoNO.setElemento(elemento); /***error */
            this.ultimoNO.setProximo(celula);

        }
        this.ultimoNO = celula; /** Pegaremos o Ponteiro do UltimoNO --> e Apontaremos para Celula */
        this.tamanho++;

    }

    /** Adciona em qualquer posição */
    /**
     * Neste Metodo precisamos explorá 4 cenarios.
     * 1ª Posição menor q 0 ou maior q tamanho, mandamos um erro
     * 2ª Se a Lista esta Vazia ou tamanho == 0; ou Inicio é Null;
     * 3º Se a posição é o mesmo q tamanho , ou seja Adciona na Ultima, este nos ja
     * temos pronto.
     * 4º Senão é o inicio ou no final é onde precisamos adcionar, e temos q buscar pela posição.
     * 
     * 
     * 
     */
    public void adiciona(int posicao, T elemento) {
        if (this.tamanho < posicao || posicao < 0) {
            throw new IllegalArgumentException("Posição Invalida");
        }

        if (posicao == 0) { /* esta Vazio */
            this.adcionaNoInicio(elemento);
        } else if (posicao == this.tamanho) { /** Adcionar no Ultimo */
            this.adiciona(elemento);
        }
        else { //busca  aposição anterior para faazermos a ligação
            No<T> noAnterior = this.buscaNo(posicao); /**Salvando a Referencia da posição atual */
            No<T> proximoNo = noAnterior.getProximo(); /**Salvando a Referencia Depois da posição */
            No<T> novoNo = new No<>(elemento, proximoNo.getProximo());
            noAnterior.setProximo(novoNo);
            this.tamanho++;

        }

    }

    public int getTamanho() {
        return this.tamanho;
    }

    /***
     * Estaremos fazendo uma modificação no ToString() para percorrer nossa lista
     * como se fosse um Array
     * [1,2,3,4....] e termos esta saida.
     */
    /**
     * 1ª coisa é saber se a Lista esta Vazia, retornaremos um Array vazio [];
     * 2º coisa é criar uma Variavel Atual que receba o Inicio,
     * 3ª Se fosse Interá como se fosse um Array começariamos com o Zero;
     * 4ª Adcionar o Atual no Builder antes de entrar no While e adcionar uma
     * Virgula.
     * 5ª dentro do While vamos mover o Atual p para o Proximo Elemento.
     * 6º Movendo para proximo elemento, repetimos o Builder
     * 7ª retornar a String.
     * 
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (tamanho == 0) {
            return builder.append("[]").toString();
        }
        No<T> atual = this.inicioNO;
        builder.append("[");
        builder.append(atual.getElemento()).append(" ,");
        while (atual.getProximo() != null) {
            atual = atual.getProximo();
            builder.append(atual.getElemento()).append(" ,");
        }
        builder.deleteCharAt(builder.lastIndexOf(",")); /** removendo a ultima virgula */
        builder.append("]");
        return builder.toString();
    }

    /** Sobre escrevemos pois para mostrar como fazer com o FOR */

    public String toStringComFor() {
        StringBuilder builder = new StringBuilder();
        if (tamanho == 0) {
            return builder.append("[]").toString();
        }
        No<T> atual = this.inicioNO;
        builder.append("[");
        for (int i = 0; i < tamanho; i++) {
            builder.append(atual.getElemento()).append(" ,");
            atual = atual.getProximo();
        }
        builder.deleteCharAt(builder.lastIndexOf(",")); /** removendo a ultima virgula */
        builder.append("]");
        return builder.toString();
    }

    /** Limpa Lista, Há duas formas */
    /**
     * Aqui na neste Ex> o Garbath Collection irá limpar a memoria, isto n é o mais
     * indicado, é funcional.
     */
    public void limpaSimples() {
        this.inicioNO = null;
        this.tamanho = 0;
        this.ultimoNO = null;

    }

    /*** Iremos misturar um FOR com While algo assim */
    /**
     * 1º Não teremos a interação, do I mas teremos atual !=null
     * 2º Criamos uma Instancia de proximo, onde passaremos o Ponteiro de Atual --->
     * proximo.
     * 3º setar as variaveis que temos na Intancia " Nó ".
     * 
     */
    public void limpaS() {

        for (No<T> atual = this.inicioNO; atual != null;) {
            No<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;

        }

        this.tamanho = 0;
        this.inicioNO = null;
        this.ultimoNO = null;

    }

    /**
     * Vamos criar 3 Metodos 1 que retorne o Elemento e outro a posição, e um
     * Privado para q o Nó n seja exposto para fora da classe.
     */
    /************************** 1º É retornar o Elemento */
    /**
     * 1º Temos q ver se a posição existe e tem q ser menor a igual ao tamanho e
     * negar, pois queremos saber SENÃO EXISTE.
     * 2º Buscar a posição e retorna- la interando a Lista, desta vez usaremos o
     * FOR.
     * 3º Dentro do For temos q mover o Ponteiro iqualmente temos feito.
     * 4º Quando terminarmos a Interação o Nó Atual receberá o Ponteiro q queremos
     * por causa da Posição do FOR.
     */
    private No<T> buscaNo(int posicao) {
        No<T> noAtual = this.inicioNO;
        if (!(posicao >= 0 && posicao <= this.tamanho)) {
            throw new IllegalArgumentException("Posição não existe.");

        }

        for (int i = 0; i < posicao; i++) {
            noAtual = noAtual.getProximo();

        }

        return noAtual;
    }

    /************************** 2º É retornar o Elemento */
    /**
     * 1º Usando o metodo Privado
     */
    public T existeElementoNaPosicao(int posicao) {
        return this.buscaNo(posicao).getElemento();
    }

    /************************ 3º É retornar a posição */
    /** Para isto temos q pesquisar se um determinado Elemento existe na lista */
    /**
     * 1º Temos que criar um NO local e percorrer
     * 2º Este Nó vai receber o Inicio.
     * 3º Interar ate o No Atual for dirente de Nulo, e é assim q saberemos quando
     * sair do Loop.
     * 4º Dentro do Loop temos que saber se o NóAtual é Iqual so Elemento que
     * estemos recebendo no Paramentro e incrementa a Posição.
     * 5º Dentro do Loop e do IF retornaremos a Posição.
     * 6º E fora do If pegaremos o Proximo Ponteiro e passaremos para o Atual, o
     * usando getProximo.
     * 7º Por convensão , caso não ache retorne -1
     */
    public int buscaElemento(T elem) {
        int posicao = 0;
        No<T> noAtual = this.inicioNO;
        /**
         * No Java o == compara a Referencia, se o Endereço da memoria são Iquais e como
         * não são nunca vai ser TRUE. Lembrando q podemos ter objetos q podem ter os
         * mesmo valores mas são duplicados e ficam em Referencias Diferentes.
         */
        while (noAtual != null) {
            try {
                if (noAtual.getElemento().equals(elem)) {
                    return posicao;

                }

            } catch (Exception e) {
                System.out.println("Catch: ");
            }
            posicao++;
            noAtual = noAtual.getProximo(); /** Pega o Proximo Ponteiro */
        }
        /** Esta Constante devolve -1 */
        return this.NAO_ENCONTRADO;

    }

}
