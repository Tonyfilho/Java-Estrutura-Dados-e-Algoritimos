package com.tony.estruturadedatos.vetor;



public class ExerciciosFeitos<T> {

    // public ArrayList<T> localArray = new ArrayList<T>();
    private T[] localArray;
    private int tamanho;


    public ExerciciosFeitos(int elemento) {
        this.localArray = (T[]) new Object[elemento];
        this.tamanho = 0;
    }
    

    
    public boolean add(T elemento) {    
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



}
