package com.tony.estruturadedatos.vetor;

import java.util.ArrayList;
import java.util.stream.Collectors;

@SuppressWarnings("unchecked")
public class Lista2<T> {

    // public ArrayList<T> localArray = new ArrayList<T>();
    private T[] localArray;
    private int tamanho;

    public Lista2(int size) {
        this.localArray = (T[]) new Object[size];
        this.tamanho = 0;
    }

    /** Classe Array do Java*********************Usaremos o ToString */
    /** Retornando somente os Elementos que existem no Vetor sem os Nulos */
    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.localArray[i]);
            s.append(", ");
        }
        if (this.tamanho > 0) {
            s.append(this.localArray[this.tamanho - 1]);
        }
        s.append("]");
        return s.toString();
    }

    private void aumentaCapacidade() {
        if (this.localArray.length == this.tamanho) {
            T[] localArrayNovos = (T[]) new Object[this.localArray.length * 2];
            for (int i = 0; i < localArray.length; i++) {
                localArrayNovos[i] = this.localArray[i];
            }
            this.localArray = localArrayNovos;
        }
    }

    public boolean add(T elemento) {

        this.aumentaCapacidade();

        if (this.tamanho < this.localArray.length) {
            this.localArray[tamanho] = elemento;
            tamanho++;
            return true;
        } else {
            return false;
        }
    }

    /**
     * OverLoad o metodo para tremos a opção de adcionar em uma determinada Posição
     * do Array sem remover e relocar a informação
     */
    public Boolean add(int posicao, T elemento) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posiçao invalida");
        }
        this.aumentaCapacidade();
        // mover todos os elementos para frente
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.localArray[i + 1] = this.localArray[i]; // Vetor 4+1(5), irá receber a Posição 4
        }
        // salvar posicao
        this.localArray[posicao] = elemento;
        // Incrementar o tamanho
        this.tamanho++;

        return true;
    }

    /**
     * 01 Exercicio é criar um metodo que mostra um conteudo no Array, sem usar a
     * classe Array list
     * 
     */

    /*********** Confirma e retorna um Boolean***** */
    public boolean BuscaB(T elemento) {
        if (this.localArray.equals(elemento)) {
            System.out.println("Yes We Have Because the Return is : ");
            return true;
        }

        System.out.println("Nope We Dont Have: ");
        return false;
    }

    /*********** Confirma e retorna um Int q é o Index do Elemento***** */
    public int BuscaI(T elemento) {
        for (int index = 0; index < localArray.length; index++) {
            if (this.localArray[index].equals(elemento)) {
                System.out.println("Yes We Have The Index nº: " + index);
                return index;
            }
        }
        System.out.println("Nope We Dont Have: ");
        return -1;
    }

    /**
     * 02 Exercicio é criar um metodo q retorna o index do elemento, tipo
     * LastIndexOf do ArrayList, sem usar a
     * classe Array list
     * 
     */

    // 1,2,3,1
    public int indexOfLocal(T elemento) {
        int lastIndex = -1;
        for (int i = 0; i < tamanho; i++) {
            if (localArray[i].equals(elemento)) {
                lastIndex = i;

            }

        }
        return lastIndex;
    }

    // 1,2,3,1
    public int lastIndexOfLocalErrado(T elemento) {
        int lastIndex = -1;
        for (int i = 0; i < tamanho; i++) {
            if (localArray[i].equals(elemento)) {
                lastIndex = i;
                System.out.println("uma x: " + lastIndex);
            }

        }
        return lastIndex;
    }

    /**
     * Esta é forma correta iterar do fim para inicio para evitar problema com
     * desempenho
     * Obs: Temos q por tamanho -1, para n dar erro
     */
    public int lastIndexOfLocal(T elemento) {
        int lastIndex = -1;
        for (int i = tamanho - 1; i >= 0; i--) {
            if (localArray[i].equals(elemento)) {
                return i;
            }
        }
        return lastIndex;
    }

    /**
     * 03 Exercicio é criar um metodo receba um elemento e o remova da sua posição
     * sem deixar posições vazias no Array tipo o Remove() da classe Array list.
     */

    // 1,2,3,4,5
    /*
     * quero remover 3, tenho que salvar 4 e adcionar ele no index 2 e assim por
     * diante
     **/
    /** Retornando o elemento removido */
    public T removeLocal(T elemento) {
        int posicao = this.indexOfLocal(elemento);
        T removed = this.localArray[posicao];
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posiçao invalida");
        }
        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.localArray[i] = this.localArray[i + 1];

        }
        tamanho--;
        return removed;
    }

    /**
     * Metodo Remove Overload passando um index, mas o 1ª ja faz isto tb, pois alem
     * do Elemento, pode tb passar o Index
     */
    public T removeLocal(int index) {
        T removed = this.localArray[index];
        if (!(index >= 0 && index < this.tamanho)) {
            throw new IllegalArgumentException("Posiçao invalida");
        }
        for (int i = index; i < this.tamanho - 1; i++) {
            this.localArray[i] = this.localArray[i + 1];

        }
        tamanho--;
        return removed;
    }

    /**
     * 04 Exercicio é criar um metodo Get ou seja Obtem onde pessaremos uma posição
     * e retornaremos o elemento.
     */

    public T getLocal(int posicao) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posiçao invalida");
        }
        return this.localArray[posicao];
    }

    /**
     * Exercicio 5, criar um Metodo q remova todos os elementos do Array, tipo o
     * Clear do ArrayList()
     */

    public void clearLocal() {
        this.localArray = (T[]) new Object[this.localArray.length];
        tamanho = 0;
    }

    /** Outra opção é zera a variavel tamanho */

    public void clearLocal2() {
        this.tamanho = 0;
    }

    /** Outra opção é é itera o Array e por tudo null */

    public void clearLocal3() {
        for (int i = 0; i > this.localArray.length; i++) {
            this.localArray[i] = null;
        }
        tamanho = 0;
    }

    public int localLength() {
        return this.localArray.length;
    }

    /************** Exercicio 06_Busca por Objeto******************** */
    public boolean BuscaObjectosContatosBoolen(Contatos contato) {

        ArrayList<Contatos> localList = new ArrayList<Contatos>(localArray.length);
        /** Transformando a Matrix de contato em uma Lista de contato */
        for (int i = 0; i < localArray.length; i++) {
            localList.add((Contatos) localArray[i]);
        }
        /**
         * /º tem q filtrar para buscar o nome e depois mapear , n pode mapear 1º,
         * diferente do JS
         */
        boolean local = localList.stream().filter(d -> d.getNome().contains(contato.getNome()))
                .map(e -> e.getNome()).collect(Collectors.toList()).contains(contato.getNome());

        return local;

    }

    public int BuscaObjectosContatosInt(Contatos contato) {
        int index = -1;

        ArrayList<Contatos> localList = new ArrayList<Contatos>(localArray.length);
        /** Transformando a Matrix de contato em uma Lista de contato */
        for (int i = 0; i < localArray.length; i++) {
            localList.add((Contatos) localArray[i]);
            if (localList.get(i).getNome().contains(contato.getNome())) {
                return index = i;
            }

        }

        return index;
    }

    public String getListNome() {
        StringBuilder nome = new StringBuilder();

        try {
            for (Object itens : localArray) {
                nome.append(((Contatos) itens).getNome()).append(", ");
            }

        } catch (Exception e) {
            System.out.println("Itens Nulos: ");
        }
        return nome.toString();
    }

    public int BuscaObjectosContatoIndexOf(Contatos localContato) {
        int index = -1;
        for (int i = 0; i < localArray.length; i++) {
            // System.out.println("GETNOME()"+((Contatos)localArray[i]).getNome());
            if (((Contatos) localArray[i]).getNome().contains(localContato.getNome())) {
                return index = i;
            }
        }

        return index;
    }

    public int BuscaObjetosContatoLastIndexOf(Contatos localContato) {
        int index = -1;
        for (int i = localArray.length - 1; i >= 0; i--) {
            // System.out.println("GETNOME()"+((Contatos)localArray[i]).getNome());
            try {
                if (((Contatos) localArray[i]).getNome().contains(localContato.getNome())) {
                    return index = i;
                }

            } catch (Exception e) {
                System.out.println(
                        "item nulo no Array dentro BuscaObjetosLastIndexOf, por cause do Retorno na Ultima posição do Array");
            }
        }

        return index;
    }

    public String allItens() {
        StringBuilder allList = new StringBuilder();
        allList.append("Nossa Lista: ");
        for (Object item : localArray) {
            allList.append(item);
            allList.append("\n ");
        }
       allList.append("Fim");


        return allList.toString();

    }
}
