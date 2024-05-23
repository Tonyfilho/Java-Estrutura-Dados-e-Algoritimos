package com.tony.estruturadedatos.fila.labs;

import java.util.Random;

import com.tony.estruturadedatos.fila.FilaComPrioridade;

/**
 * Aqui colocaremos a ultima logica de chegada de paciente de 8 Segundos
 * aleatoria.
 * Temos que aproveitar a mesma Fila, 
 * Criar uma prioridade Aleatória
 */
@SuppressWarnings("unused")
public class PSNovosAtendimentos implements Runnable {

    private FilaComPrioridade<Pessoa> fila;
    private int numeroDeSenha;
    private int count = 7; /**Pois ja foi adcionado 6 la no exerc03 */
    private Random prioridadeAleatoria = new Random(); /** prioridadeAleatoria.nextInt(3) vai de 0 a 2  */

    public PSNovosAtendimentos(FilaComPrioridade<Pessoa> fila, int numeroDeSenha) {
        this.fila = fila;
        this.numeroDeSenha = numeroDeSenha;
    }

    /**
     * Aqui dentro do Run vamos por um For para limitar a quantidade de pessoas e de
     * senhas.
     */

    @Override
    public void run() {
        Pessoa p = new Pessoa();
       
        for (int i = 0; i < numeroDeSenha; i++) {
            try {
                p = new Pessoa("Zé Orelha" +i, prioridadeAleatoria.nextInt(3));
               Thread.sleep(8000); 
               fila.enfileirar(p);
               count++;
               System.out.println(p.getNome() +" Pessoa Enfileirado" + " Com Prioridade: "+ p.getPrioridade());
            } catch (Exception e) {
              System.out.println(e.getCause()); 
            }
            
        }
        
    }

}
