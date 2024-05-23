

package com.tony.estruturadedatos.fila.labs;

import java.util.Random;

import com.tony.estruturadedatos.fila.Fila;

/**
 * Escrever um programa usando Filas q simule a bricadeira da "Batata Quente". A bricadeira cosiste de um grupo dde
 * pessoas em um circulo. Uma fica fora e de costa com os olhos vendado dizeno "Batata quente, quente
 * quente..... e queimou". Enquanto isso, os demais vão passando a bola de mão em mão ate ouvirem
 * a palavra "Queimou".  * 
 * Quem estiver com a bola nesse momento sai do jogo, quem ficar por ultimo ganha.
 * 1º Criaremos uma Fila.
 * 2º For para Enfileirar
 * 3º Criaremos um programa aleatorio para simular o sorteio;
 * 4º A Ideia é fazer uma fila circular, mas aqui na programação usaremos ENFILEIRAR e 
 * DESENFILEIRAR. Usando While e dentro um For.
 * 5ª Qual a Logica, precisa sobrar somente 1 pessoa na Fila.
 * 6º Dentro do For, representa a pessoa que passou a bola para proxima pessoa. Ou seja será
 * desemfileirado, e reenfileirar para dar ideia de fila Circular.Ou Seja Vai sair do Inicio
 * e Voltar para final.
 * 7º Desenfila pois aqui é Queimou
 * 8º fora do while o ultimo desenfileiramento que é o ganhandor
 * 
 */
public class Exerc04 {


 public static void main(String[] args) {
     Fila<Integer> fila = new Fila<>();
    
    for (int i = 0; i < 10; i++) {        
        fila.enfileirar(i);
    }
    
    Random aleatorio = new Random();
    int num = 0;
    while (num == 0) {
        num = aleatorio.nextInt(10);        
    }
    System.out.println("Numero = " + num);

    while (fila.tamanho() > 1) {
        for (int i = 0; i < num; i++) {
            fila.enfileirar(fila.desenfileirado()); /**Sai do inicio e passa para fim */
            
        }
        /**Aqui fora é o queimado */
        System.out.println("*****Queimou*****");
        System.out.println("Eliminado = " + fila.desenfileirado());
        
    }
    System.out.println("******Ganhou a Pessoa nº " + fila.desenfileirado() + "********");

    
    }
    
}