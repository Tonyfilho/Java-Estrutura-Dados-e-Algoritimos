package com.tony.estruturadedatos.fila.teste;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Nesta Aula usaremos q Interface QueUe Tipara uma variavel que receberá uma
 * Instancia
 * da classe PriorityQueue, que no seu Construtor receberá uma Instacia de uma
 * Interface via Classe Anonima.
 * Lembrando que a unica forma de uma Interface ser Instaciada é transformando
 * esta Instancia e em classe Anonima
 * e sobre escrevendo seus metodos.
 */
public class Aula25 {

    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {

        Queue<PacienteSemComparable> filaComPrioridade = new PriorityQueue<>(

                new Comparator<PacienteSemComparable>() {
                    @Override
                    public int compare(PacienteSemComparable p1, PacienteSemComparable p2) {
                        if (p1.getPrioridade() > p2.getPrioridade()) {
                            return 1;
                        } else if (p1.getPrioridade() < p2.getPrioridade()) {
                            return -1;
                        }

                        return 0;
                    }
                }

        );

        filaComPrioridade.add(new PacienteSemComparable<>("Tony", 5));
        filaComPrioridade.add(new PacienteSemComparable<>("Juan", 1));
        filaComPrioridade.add(new PacienteSemComparable<>("Deb", 15));

        System.out.println("Fila Com Prioridade: \n" + filaComPrioridade);

    }
}
