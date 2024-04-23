package com.tony.estruturadedatos.vetor;

@SuppressWarnings("unchecked")
public class ExerciciosFeitos<T> {

    // public ArrayList<T> localArray = new ArrayList<T>();
    private T[] localArray;
    private int tamanho;

    public ExerciciosFeitos(int elemento) {
        this.localArray = (T[]) new Object[elemento];
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
     * 01 Exercicio é criar um metodo que mostra um conteudo no Array, sem usar a
     * classe Array list
     * 
     */

    /*********** Confirma e retorna um Boolean***** */
    public boolean containsBoolean(T elemento) {
        if (this.localArray.equals(elemento)) {
            System.out.println("Yes We have");
            return true;
        }

        System.out.println("Nope We dont have");
        return false;
    }

    /*********** Confirma e retorna um Int q é o Index do Elemento***** */
    public int containsInt(T elemento) {
        for (int index = 0; index < localArray.length; index++) {
            if (this.localArray[index].equals(elemento)) {
                System.out.println("Yes We have");
                return index;
            }
        }
        System.out.println("Nope We dont have");
        return -1;
    }

    /**
     * 02 Exercicio é criar um metodo q retorna o index do elemento, tipo
     * LastIndexOf do ArrayList, sem usar a
     * classe Array list
     * 
     */

    // 1,2,3,1
    public int lastIndexOfLocal(T elemento) {
        int lastIndex = -1;
        for (int i = 0; i < tamanho; i++) {
            if (localArray[i].equals(elemento)) {
                lastIndex = i;
                System.out.println("uma x: " + lastIndex);

            }

        }
        return lastIndex;
    }
    /**Esta é forma correta iterar do fim para inicio para evitar problema com desempenho
     * Obs: Temos q por tamanho -1, para n dar erro 
     */
    public int lastIndexOfLocalInverso(T elemento) {
        int lastIndex = -1;
        for (int i = tamanho -1  ; i >= 0; i--) {
            if (localArray[i].equals(elemento)) {
              return  i;

            }

        }
        return lastIndex;
    }

}
