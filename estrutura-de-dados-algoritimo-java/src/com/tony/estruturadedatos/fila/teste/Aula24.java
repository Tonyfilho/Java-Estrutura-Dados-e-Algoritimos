package com.tony.estruturadedatos.fila.teste;

import com.tony.estruturadedatos.fila.FilaComPrioridade;

/**
 * 1º Coisa aqui é criar a instacia de Fila com prioridade,
 * 2º é mostrar que para Java é Impossivel fazer comparações de Classe que usam
 * Objetos.
 * 3ª É mostra a solução de fazer comparações Usando a Inteface Comparable do
 * Java
 */
public class Aula24 {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {

        FilaComPrioridade<Integer> filaInt = new FilaComPrioridade<Integer>();

        FilaComPrioridade<Paciente> fila = new FilaComPrioridade<Paciente>();

        filaInt.enfileirar(5);
        filaInt.enfileirar(2);
        filaInt.enfileirar(1);

        System.out.println("Fila: " + filaInt);

        fila.enfileirar(new Paciente("tony", 3));
        fila.enfileirar(new Paciente("Juan", 1));
        fila.enfileirar(new Paciente("Debora", 2));
        System.out.println("Fila: " + fila);

    }
}
