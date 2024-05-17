package com.tony.estruturadedatos.fila.teste;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *Usaremos agora o Comparable a proveitando que Prioridade é um INT, temos seu Wrapper e com isto podemos
  fazer a comparação de forma diferente de um Objeto. Trasformaremos um tipo Primitivo INT em uma Classe, ou seja um Objeto
  E com isto podemos usar os metodos deste Objeto. Usando ValueOf().compareTo()
 */
public class Aula25A {

    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {

        Queue<PacienteSemComparable> filaComPrioridade = new PriorityQueue<>(

                new Comparator<PacienteSemComparable>() {
                    @Override
                    public int compare(PacienteSemComparable p1, PacienteSemComparable p2) {
                       return Integer.valueOf(p1.getPrioridade()).compareTo(p2.getPrioridade());
                    }
                }

        );

        filaComPrioridade.add(new PacienteSemComparable<>("Tony", 5));
        filaComPrioridade.add(new PacienteSemComparable<>("Juan", 1));
        filaComPrioridade.add(new PacienteSemComparable<>("Deb", 15));

        System.out.println("Fila Com Prioridade: \n" + filaComPrioridade);

    }
}
