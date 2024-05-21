package com.tony.estruturadedatos.fila.labs;

import com.tony.estruturadedatos.fila.FilaComPrioridade;

/**
 * Exercicio 03
 * Utilize a classe Fila p simular um sistema de senhas de pronto Socorro.
 * Cada pessoa pode ser classificada com 3 codigo:
 * Vermelho(Prioridade maior);
 * Amarelo(Prioridade Media);
 * Verde(Sem Prioridade);
 * Enfilere 6 Pessoas inicial.
 * Pessoas com prioridade vermelha devem ser atendidas primeiro;
 * Cada connsulta dura cerca de 5 segundos, e depois o proximo da fila é
 * chamado.
 * A cada 8 segundos um pessoa chega no pronto socorro com prioridade aleatoria.
 * (crie um cod para pessoas aleatorias).
 * Usaremos as Queues e as Threads para gerar tempo
 */
public class Exerc03 {
    public static final int VERDE = 2;
    public static final int AMARELO = 1;
    public static final int VERMELHO = 0;

    public static void main(String[] args) {
        FilaComPrioridade<Pessoa> filaComPrioridade = new FilaComPrioridade<>();

        filaComPrioridade.enfileirar(new Pessoa("vaca", AMARELO));
        filaComPrioridade.enfileirar(new Pessoa("debora", VERDE));
        filaComPrioridade.enfileirar(new Pessoa("Juan", VERMELHO));
        filaComPrioridade.enfileirar(new Pessoa("Tony", VERDE));
        filaComPrioridade.enfileirar(new Pessoa("Penha", AMARELO));
        filaComPrioridade.enfileirar(new Pessoa("Germanny", VERDE));

        /** Atendimento */
        PSAtendimento atendimento = new PSAtendimento(filaComPrioridade);
        /**Novos Pacientes */
        PSNovosAtendimentos pacientes = new PSNovosAtendimentos(filaComPrioridade, 8);

        /**A Thread vai receber uma instacia da classe Runnable que implementamos no PSAtendimento */
    
            Thread t1 = new Thread(atendimento);
            Thread t2 = new Thread(pacientes);
            t1.start();
            t2.start();
       
     //   System.out.println("Atendimento: " + atendimento);

    }
}
