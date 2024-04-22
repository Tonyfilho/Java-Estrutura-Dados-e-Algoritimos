package com.tony.estruturadedatos.vetor.teste;

import java.util.ArrayList;

/**Aula  12 */
/**
 * Nesta Aula começaremos a usar a class nativa do Java chamada de ArrayList;
 * Esta class ARRAYList pertece a classe UTILS do Java, quase todas as
 * collection pertence a esta classe
 * E Ja tem as extrutura do Java para Collections
 */
public class Aula12 {
    public static void main(String[] args) {

        /**
         * O Construtor do ArrayList() nos dá algumas Opções, de por:
         * Vazio;
         * O Tamanho
         * Ou Uma Colleção de Dados.
         */
        ArrayList<String> arrayList = new ArrayList<String>();

        /**************** Adcionando Elementos */
        arrayList.add("A");
        arrayList.add("B");

        boolean foiAdcionado = arrayList.add("C:"); /** O Metodo Add Retorna um Bollean */

        System.out.println("ArrayList: " + arrayList + "Foi Adcionado: " + foiAdcionado);
        arrayList.add(1, "Adcionado_Sobre_uma_Posição_escolhida:");
        System.out.println("ArrayList: " + arrayList);

        /************** Metodo de Busca Contains() */

        boolean constains = arrayList.contains("B");

        if (constains) {
            System.out.println("Metodo Contains Elemento existe no Array: " + constains);

        } else {
            System.out.println("Metodo Contains Elemento Não existe no Array: " + constains);

        }
        boolean constainsNaoExiste = arrayList.contains("I");

        if (constainsNaoExiste) {
            System.out.println("Metodo Contains Elemento existe no Array: " + constainsNaoExiste);

        } else {
            System.out.println("Metodo Contains Elemento Não existe no Array: " + constainsNaoExiste);

        }

        /************** Metodo de Busca IndexOf() que retorna o Index do Array */

        int indexOf = arrayList.indexOf("B");

        if (indexOf > -1) {
            System.out.println("Metodo IndexOf(): " + indexOf);

        } else {
            System.out.println("Metodo IndexOf() Não existe no Array: " + indexOf);

        }
        int indexOfNaoContain = arrayList.indexOf("H");

        if (indexOfNaoContain > -1) {
            System.out.println("Metodo IndexOf(): " + indexOfNaoContain);

        } else {
            System.out.println("Metodo IndexOf() Não existe no Array: " + indexOfNaoContain);

        }
        /**************
         * Metodo Get() é Busca por Posição que retorna uma String
         * pois nosso array foi Tipado para String
         */

        String get = arrayList.get(1);
        System.out.println("Nosso Array: " + arrayList);

        if (get.equals("B")) {
            System.out.println("Metodo get trouxe o elemento: " + get);

        } else {
            System.out.println("Metodo get Nao achou o elemento: " + get);

        }

        System.out.println("Nosso Array Antes do Remove: " + arrayList);
        arrayList.remove(0);
        System.out.println("Nosso Array depois do remove: " + arrayList);
        arrayList.remove(0);
        System.out.println("Nosso Array depois do remove: " + arrayList);

        boolean remove = arrayList.remove("B");
        System.out.println("Foi Removido: " + remove);
        System.out.println("Nosso Array depois do remove: " + arrayList);

        /**************
         * Metodo Size(); Que mostra o tamanho.
         */
        int size = arrayList.size();
        System.out.println("Array Size(): " + size);
        
        /**************
         * Metodo Set(), Setta o valor daquela posição.
         */
        String sete = arrayList.set(0, "H");
        System.out.println("Array Set(): " + sete + " Array: " + arrayList);

        
    }
}
