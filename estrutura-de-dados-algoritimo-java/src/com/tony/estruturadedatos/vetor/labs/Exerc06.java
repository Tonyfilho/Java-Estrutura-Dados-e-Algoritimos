package com.tony.estruturadedatos.vetor.labs;

import java.util.ArrayList;
import java.util.Scanner;

import com.tony.estruturadedatos.vetor.Contatos;
import com.tony.estruturadedatos.vetor.ExerciciosFeitos;

public class Exerc06 {

    /**
     * Neste Exercicio vamos fazer um Menu para testarmos todos os methodos feitos
     * neste Modulo de Lista
     */

    public static void main(String[] args) {

        /** Criação de variaveis com entrada usando a Classe Scanner */
        Scanner scan = new Scanner(System.in);

        /** Criar Vetor com 20 Capacidade */
        ExerciciosFeitos<Contatos> lista = new ExerciciosFeitos<Contatos>(4);

        /** Criar e adcionar dinamicamente */
        CriarContatosDinamicamente(5, lista);

        /** Obter o Numero do Menu */
        int opcao = 1;

        while (opcao != 0) {
            opcao = Menu(scan);
            CallProgram(opcao, lista);

        }
        System.out.println("******Quit********");
        System.out.println("You Hit:  0 The Program finish!");

        /** Criar um Menu para o Usuario escolher as opções */

    }

    /** Metodo Statico para criar contatos */
    private static void CriarContatosDinamicamente(int quant, ExerciciosFeitos<Contatos> lista) {
        Contatos contato;

        for (int i = 1; i < quant; i++) {
            contato = new Contatos();
            contato.setNome(i + "Tony");
            contato.setEmail(i + "tony@email.com");
            contato.setTelefone(i + 123456789);

            lista.add(contato);
        }

    }

    /** Metodo do Menu usando a classe Scaner */
    private static int Menu(Scanner scan) {

        /** Flag do While */
        boolean getIn = false;
        int option = 0;
        String entrace;
        while (!getIn) { /** So entra quando for TRUE */
            System.out.println("Digite a Opçao Desejada: \n\n");
            System.out.println("0:  Quit().");
            System.out.println("1: Add() Contact at the End.");
            System.out.println("2: Add() Contact With Especific Position.");
            System.out.println("3: Get() Contact pass the  Position Return Element.");
            System.out.println("4: Contains() pass Especific Element Return Int.");
            System.out.println("5: Contains(2) pass Especific Element Return Boolean.");
            System.out.println("6: IndexOf() pass Especific Element Return Primeiro Index(int) do Elemento Buscado.");
            System.out.println("7: LastIndexOf() pass Especific Element Return Ultimo Index do Elemento Buscado.");
            System.out.println("8: Remove() pass Especific Position Return Removed Item.");
            System.out.println("9: CleanAll() Excluir all the Contacts From the Array.");
            System.out.println("10: ToString() Print all the Contacts From the Array without Null Index.");

            /**
             * Iniciar a classe Scanner usanod NextLine() pois consegue pegar qualquer tipo
             * de dado
             */
            /**
             * Temos q tratar as exeções caso o usuario digite algo que não for um numero
             */
            try {
                entrace = scan.nextLine();
                option = Integer.parseInt(entrace);
                /** Temos q validar se esta sendo digitado de 0 a 10 */
                if (option >= 0 && option < 11) {
                    /************* Ficando no Menu********** */
                    getIn = true;

                } else {
                    /**
                     * Obs: Não preciso passar paramentro no Exeption(), pois será automaticamente
                     * capturada pelo Catch quando eu dou o Throw
                     */
                    throw new Exception();
                }

            } catch (Exception e) {
                System.out.println("Invalid Entrace. Must be Number 0 Until 10. Try Again \n\n");
            }
        }
        return option;
    }

    public static int CallProgram(int option, ExerciciosFeitos<Contatos> lista) {

        System.out.println("Options: " + option);
        switch (option) {
            case 1:
                lista.add(AdcionaContato());

                break;
            case 2:
                ArrayList<Object> localList = AdcionaContatoPorPosicao();
                lista.add(((int) localList.get(0)), ((Contatos) localList.get(1)));

                break;
            case 3:
                BuscaElemento(lista);
                break;
            case 4:
                ContainsInt(lista);
                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
            case 8:

                break;
            case 9:

                break;
            case 10:

                break;

        }
        return option;
    }

    /**
     * Para cada Opção craaremos um metodo, alem é claro de cria uma metodo de
     * entrada
     */

    /** Metodo de Entrada de dados */
    @SuppressWarnings("resource")
    private static String LerInformacaoDigitadaString(String info) {
        Scanner localScanner = new Scanner(System.in);
        String infoDigitada;
        System.out.println("Digite a Informaçao Solicitada: " + info);
        infoDigitada = localScanner.nextLine();

        return infoDigitada;
    }

    /** Metodo que protege para */
    @SuppressWarnings("resource")
    private static int LerInformacaoDigitadaInt(String info) {
        Scanner localScanner = new Scanner(System.in);
        int infoDigitada = 0;
        System.out.println("Digite a Informaçao Solicitada: " + info);

        /** Proteção caso Digite Letras */
        try {
            infoDigitada = Integer.parseInt(localScanner.nextLine());

        } catch (Exception e) {
            System.out.println("Invalid Entrace. Must be Number. Try Again \n\n");
        }

        return infoDigitada;
    }

    /***************************************************
     * 01*********************************** Metodo do Menu 1 Add() no final
     */

    private static Contatos AdcionaContato() {
        int nunTelefone = 0;
        String nome;
        String email;
        System.out.println("************Digite o Nome do contato**************");
        nome = LerInformacaoDigitadaString("Nome: ");

        System.out.println("************Digite o Telefone em Numeros do contato**************");
        /** Proteção caso Digite Letras */
        try {
            nunTelefone = Integer.parseInt(LerInformacaoDigitadaString("Telefone: "));

        } catch (Exception e) {
            System.out.println("Invalid Entrace. Must be Number 0 Until 10. Try Again \n\n");
        }

        System.out.println("************Digite o Email do contato**************");
        email = LerInformacaoDigitadaString("email: ");

        return new Contatos(nome, nunTelefone, email);
    }

    /*************************************
     * 02***************** Metodo Adciona por posição, onde retornamos um Arralist
     * de Objetos
     */
    private static ArrayList<Object> AdcionaContatoPorPosicao() {
        ArrayList<Object> locaList = new ArrayList<Object>();
        Contatos localContatos = new Contatos();
        int lPosicao = 0;

        System.out.println("************Digite o Nome do contato**************");
        localContatos.setNome(LerInformacaoDigitadaString("Nome: "));

        System.out.println("************Digite o Telefone em Numeros do contato**************");
        localContatos.setTelefone(LerInformacaoDigitadaInt("Telefone: "));

        System.out.println("************Digite o Email do contato**************");
        // email = LerInformacaoDigitadaString("email: ");
        // locaList.add(email);
        localContatos.setEmail(LerInformacaoDigitadaString("email: "));

        System.out.println("************Digite a Posição do Array  em Numero**************");

        lPosicao = LerInformacaoDigitadaInt("Posicao Do Array: ");
        locaList.add(lPosicao);
        locaList.add(localContatos);

        return locaList;
    }

    /***********************************************
     * 03**********Metodo Get pata buscar uma determinado Elemento do
     * Array****************************
     */
    private static void BuscaElemento(ExerciciosFeitos<Contatos> lista) {
        int index = 0;
        // Contatos localContatos = new Contatos();
        System.out.println("************Digite o Index do Elemento a  Ser Retornado**************");
        System.out.println("************Escolha do Elemento pelo seu Index: \n\n" + lista);
        index = LerInformacaoDigitadaInt("Digite a Posicao de Busca do Array de 0 até: " + (lista.localLength() - 1));
        System.out.println("O Elemento do Array é : " + lista.getLocal(index));

    }

    /****************************************
     * 04*********pass Especific Element Return Int, se for -1 quer dizer q não
     * existe, ser for outro numero é ao Index do
     * Array********************************************************
     */

    private static void ContainsInt(ExerciciosFeitos<Contatos> lista) {
        System.out.println("************Digite o Elemento a  Ser Pesquisado**************");
        System.out.println("************Escolha do Elemento pelo seu Nome: \n\n" + lista);
        String itemDigitado = LerInformacaoDigitadaString("Digite o Contato");
        System.out.println("Nosso Item contendo no Array: " + itemDigitado);

    }
}
