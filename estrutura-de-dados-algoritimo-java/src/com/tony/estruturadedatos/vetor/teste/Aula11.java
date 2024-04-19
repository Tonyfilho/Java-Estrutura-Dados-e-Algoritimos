package com.tony.estruturadedatos.vetor.teste;

import com.tony.estruturadedatos.vetor.Lista;

/**
 * Aula do Generics e a forma correta de não ter arrays do tipo ANY, tem q ser
 * do mesmo tipo no JAVA, diferentemente do JS
 */
@SuppressWarnings("rawtypes")
public class Aula11 {

    public static void main(String[] args) {

        Lista<String> lista = new Lista<String>(5);

        lista.adiciona("1");

        // lista.adiciona(1); erro de compilação

        // lista.adiciona(new Aula10Contatos());

        Lista<Aula10Contatos> listaContatos = new Lista<>(5);

        Aula10Contatos c1 = new Aula10Contatos("Tony", 102345872, "teste@gmail.com");
        Aula10Contatos c2 = new Aula10Contatos("Zé", 102345872, "ze@gmail.com");
        Aula10Contatos c3 = new Aula10Contatos("Os", 102345872, "os@gmail.com");

        listaContatos.adiciona(c1);
        listaContatos.adiciona(c2);
        listaContatos.adiciona(c3);

        System.out.println();

    }
}
