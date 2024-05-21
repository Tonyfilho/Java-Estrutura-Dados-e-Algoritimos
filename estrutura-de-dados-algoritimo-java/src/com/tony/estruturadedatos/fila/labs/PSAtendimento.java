package com.tony.estruturadedatos.fila.labs;

import com.tony.estruturadedatos.fila.FilaComPrioridade;

/**
 * 1º Aqui umplementaremos a interface Runnable para trabalharmos com THREADS
 * 2º Fazer a logica dos Xs segundos de atendimento dentro do Runable
 * 
 */
public class PSAtendimento implements Runnable {

    private FilaComPrioridade<Pessoa> fila;
    // private String paciente;

    public PSAtendimento(FilaComPrioridade<Pessoa> fila) {
        this.fila = fila;
        // this.paciente = paciente;
    }

    @Override
    public void run() {
        while (!fila.estaVazia()) {

            try {
                System.out.println(fila.desenfileirado() + " Pessoa foi atendida .");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Atendimento Concluido. ");
    }

    @Override
    public String toString() {
        return "PSAtendimento.fila = " + fila;
    }

}
