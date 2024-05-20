package com.tony.estruturadedatos.fila.labs;

import com.tony.estruturadedatos.fila.Fila;

/**
 * Exercicio 02
 * Escreve um programa q simule a distribuição de senha de atendimento a um
 * grupo de pessoas.
 * Cada pessoa pode receber uma senha prioritária ou uma senha normal. O
 * programa deve obedecer os
 * seguintes critérios:
 * Existir apenas 1 atendente;
 * 1 Pessoa com senha normal deve ser atendida a cada 3 pessoas com senha
 * prioritária;
 * Não havendo prioridades, as pessoas com senha normal podem ser atendidas .
 */
public class Exerc02 {

    public static void main(String[] args) {
        Fila<String> filaNormal = new Fila<>();
        Fila<String> filaPrioridade = new Fila<>();
        final int PRIORIDADE = 3;
        //String pessoaAtendida;

        filaNormal.enfileirar("Pessoa 01");
        filaPrioridade.enfileirar("Pessoa 03P");
        filaNormal.enfileirar("Pessoa 02");
        filaPrioridade.enfileirar("Pessoa 01P");
        filaNormal.enfileirar("Pessoa 03");
        filaNormal.enfileirar("Pessoa 04");
        filaNormal.enfileirar("Pessoa 05");
        filaPrioridade.enfileirar("Pessoa 02P");
        filaNormal.enfileirar("Pessoa 06");
        filaNormal.enfileirar("Pessoa 07");
        filaPrioridade.enfileirar("Pessoa 04P");

        /** While enquato tivermos pessoas ou em fila comum ou prioridade */

        while (!filaNormal.estaVazia() || !filaPrioridade.estaVazia()) {
            int count = 0;
            /**Verificar de Prioridade tem pessoas e se o contador esta com menos de 3 */
            while (!filaPrioridade.estaVazia() && count < PRIORIDADE) {
                // pessoaAtendida = filaPrioridade.desenfileirado();
                // System.out.println("Pessoa com Prioridade: " + pessoaAtendida);
                atendePessoa(filaPrioridade, "Pessoa Com Prioridade");
                count++;
            }
            /**Verificar de fila normal tem pessoas */
            if (!filaNormal.estaVazia()) {
                atendePessoa(filaNormal, "Pessoa Regular");
            }
            /**Ver se Prioridade esta vazia novamente, senão tiver volta, caso esteja continua */
            if (filaPrioridade.estaVazia()) {
                while (!filaNormal.estaVazia()) {
                    atendePessoa(filaNormal, "Pessoa Regular");
                }
                
            }
        }

    }
    /**Metodo de desenfileirar e imprimir */
    public static void atendePessoa(Fila<String> pessoa, String tipo) {
      String pessoaAtendida = pessoa.desenfileirado();
      System.out.println("Pessoa do : " +tipo+ "  " + pessoaAtendida);


    }
}
