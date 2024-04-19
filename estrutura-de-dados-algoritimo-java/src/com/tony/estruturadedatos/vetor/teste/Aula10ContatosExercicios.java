package com.tony.estruturadedatos.vetor.teste;

import com.tony.estruturadedatos.vetor.VetorObject;

public class Aula10ContatosExercicios {
    public static void main(String[] args) {
        VetorObject vetor = new VetorObject(3);
        Aula10Contatos c1 = new Aula10Contatos("Tony", 102345872, "teste@gmail.com");
        Aula10Contatos c2 = new Aula10Contatos("Zé", 102345872, "ze@gmail.com");
        Aula10Contatos c3 = new Aula10Contatos("Os", 102345872, "os@gmail.com");
        /** Não foi adcionado no vetor */
        Aula10Contatos c4 = new Aula10Contatos("Os", 102345872, "os@gmail.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);
        System.out.println("Vetor Tamanho: " + vetor.vertorTamanho());
        System.out.println("Vetor Data: " + vetor);

        /** Busca por elemento */
        System.out.println("*******Busca por Posição********");

        int pos = vetor.busca(c3);

        if (pos > -1) {
            System.out.println("Elemento existe na Posicao: " + pos);
        } else {
            System.out.println("Elemento NAO existe na Posicao: " + pos);

        }

        /**
         * Busca por elemento referencia de memoria diferente mas com os mesmo dados, o
         * Java usar o metodo da classe toEquals que criamos na class, q compara os dados e não a referencia
         * da memoria
         */
        System.out.println("*******Busca por Posição não existente********" + vetor.busca(c4));

        int pos2 = vetor.busca(c4);

        if (pos2 > -1) {
            System.out.println("Elemento existe na Posicao: " + pos2);
        } else {
            System.out.println("Elemento NAO existe na Posicao: " + pos2);

        }
    }
}
