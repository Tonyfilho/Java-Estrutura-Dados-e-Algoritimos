package com.tony.estruturadedatos.vetor.labs;

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
        ExerciciosFeitos<Contatos> lista = new ExerciciosFeitos<Contatos>(20);

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
                    /*************Ficando no Menu********** */            
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
        Contatos contatos = new Contatos();
        int localOpcao = 0;
        
        System.out.println("Options: " + option);
        switch (option) {
            case 1:
            contatos.setNome("jose Orelha");
            contatos.setEmail("jose Orelha@gmail.com");
            contatos.setTelefone(12345678);
                    lista.add(contatos);
                    System.out.println("Contata Adicionado com Sucesso: " + lista);
             localOpcao = 1;
             break;
             case 2:
            
           lista.add(option, contatos);
            
            break;
            case 3:
            
            break;
            case 4:
            
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
        return localOpcao;
    }

    /**Para cada Opção craaremos um metodo, alem é claro de cria uma metodo de entrada */

    /**Metodo de Entrada de dados */
    private  String lerInformacaoDigitada(String info, Scanner scan) {
      String infoDigitada;
         System.out.println("Digite a Informçao Solicitada: "+ info);
         infoDigitada =  scan.nextLine();


      return infoDigitada;
    }

    /**Metodo do Menu 1 Add() no final */
    

}
