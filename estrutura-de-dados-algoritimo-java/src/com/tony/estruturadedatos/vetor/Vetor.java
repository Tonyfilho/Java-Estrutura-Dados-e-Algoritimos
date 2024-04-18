package com.tony.estruturadedatos.vetor;

import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int elementos) {
        this.elementos = new String[elementos];
        this.tamanho = 0;
    }

    /** esta gera uma erro por falta de controle de tamanho */
    public void adicionaSemControleDeTamanho(String elemento) {
        // this.aumentaCapacidade(); se por não gera error, fui comentado por isto
        for (int i = 0; i < this.elementos.length; i++) {

            if (this.elementos[i] == null) {
                this.elementos[i] = elemento;
                break;
            }
            System.out.println("Itens sem controle de tamanho: " + elementos[i]);
        }

    }

    /** esta é protegido do erro por causa do Try and Catch */
    public void adicionaComControleDeTamanho(String elemento) throws Exception {
        // this.aumentaCapacidade(); se por não gera error, fui comentado por isto
        if (this.tamanho < this.elementos.length) {
            elementos[this.tamanho] = elemento;
            tamanho++;

        } else {
            throw new Exception("Array is Full");
        }
        for (int i = 0; i < this.elementos.length; i++) {

            if (this.elementos[i] == null) {
                break;
            }
            System.out.println("Itens Com controle de tamanho: " + this.elementos[i]);

        }
    }

    /**
     * esta Não gera Error, por retornar um bolean, é a melhor opção para
     * vetores/arrays
     */
    public Boolean adicionaComBoolean(String elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            elementos[this.tamanho] = elemento;
            tamanho++;
            return true;
        } else {
            return false;
        }
    }

    /** metodo para retornar uma tamanho do Vetor */

    public int vertorTamanho() {
        return this.tamanho;
    }

    /******************************* Aula 04 Retornar um Elemento do Vetor */

    /** Classe Array do Java*********************Usaremos o ToString */
    @Override
    public String toString() {
        return "Vetor [elementos=" + Arrays.toString(elementos) + "]";
    }

    /** Retornando somente os Elementos que existem no Vetor sem os Nulos */

    public String toStringSemNUlls() {

        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }
        s.append("]");
        return s.toString();
    }

    /**************************** Aula 05 Retornar um Elemento do Vetor */
    /**
     * Observação tem q ser do mesmo TIPO, neste caso o Vetor é de String o metodo
     * tem q retornar uma String
     */
    public String buscaElementoComError(int posicao) {

        return this.elementos[posicao];
    }

    public String buscaElementoComExeptions(int posicao) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posiçao invalida");
        }
        return this.elementos[posicao];
    }

    /**************************** Aula 06 verificar se o elemento existe */
    /**
     * Observacao podemos usar um metodo Boolean ou Int
     * Caso ache ele retorna true
     */

    public Boolean existeElementoBoolean(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            /**
             * Obs: Como String no Java é um Objeto não se pode usar == para fazer
             * comparações e sim o equalsIgnoreCase ou equals
             */
            if (this.elementos[i].equals(elemento)) {
                return true;
            }

        }
        return false;
    }

    /** O mesmo metodo retornando a POSIÇÃO */
    public int existeElementoInt(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            /**
             * Obs: Como String no Java é um Objeto não se pode usar == para fazer
             * comparações e sim o equalsIgnoreCase ou equals
             */
            if (this.elementos[i].equalsIgnoreCase(elemento)) {
                return i;
            }

        }
        return -1;
    }

    /****************************
     * Aula 07 Adicionar novo elemento em uma posição sem remover o existente
     */
    /**
     * 1º Passo é ver se a posição existe
     * 2º Criar um FOR que irá inicialiar com o tamanho -1 >= posicao
     * 3º Obs: o i = tamanho -1, para sempre salvar a posição anterior, ou seja
     * quando tamanho for 5 (-1), virará Index 4 e salvará o index 5 anterior
     * 4º Decrementar, pois iremos Iterar de traz para Frente
     * 5º Mover os elemento para uma posição para frente
     * 6º Salvar o novo elemento
     * 7º Incrementar o tamanho
     */
    public Boolean adicionaSemRemoverOExistente(int posicao, String elemento) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posiçao invalida");
        }
        this.aumentaCapacidade();
        // mover todos os elementos para frente
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i]; // Vetor 4+1(5), irá receber a Posição 4
        }
        // salvar posicao
        this.elementos[posicao] = elemento;
        // Incrementar o tamanho
        this.tamanho++;

        return true;
    }

    /****************************
     * Aula 08 Aumentar a capacidade no Java no C e no C# e outros a UNICA forma de
     * fazer isto é Criar um NOVO ARRAY.
     */

    /**
     * 1º Cria um novo Array Filho q receberá os valores com o tamanho 2 * o tamanho
     * do array Pai,
     * 2ª Iterar o array existente
     * 3º Atribuir os valor na sua posições, começando pelo 0 para o novo array
     * 4º Atribuir novamente os valores para o Array
     * 5º Por a invocação do Metodo nos locais onde se precisa fazer o Update do
     * Array Pai. nos Metodos de Adcionar Elementos
     */
    private void aumentaCapacidade() {
        if (this.elementos.length == this.tamanho) {
            String[] elementosNovos = new String[this.elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    /****************************
     * Aula 09 Elemento do Array
     */
    /**
     * B G D E F -> Posição para ser Removida neste ex. é a 1, elemento " G ";
     * 0 1 2 3 4 -> Tamanho é 5;
     * O Elemento da posicão [1] irá receber o Elemento da posicão [2], use ex:
     * simples tipo este de apenas 5 elementos, pois se funciona com 5, funciona com
     * 1000;
     * Ex: vetor[1] = vetor[2];
     * Ex: vetor[2] = vetor[3];
     * Ex: vetor[3] = vetor[4];
     * Cria o FOR e Começaremos:
     * 1º com a Var da Posição q representa quem vai ser removido
     * 2º Interaremos até o Tamanho do Array -1;
     * 3ª fazer as atribuições, Ex: vetor[1] = vetor[2]; vetor[2] = vetor[3];
     * vetor[3] = vetor[4];
     * 4º dimminuir o tamanho depois do for
     * 
     * @param posicao
     */
    public void remove(int posicao) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posiçao invalida");
        }
        for (int index = posicao; index < this.tamanho - 1; index++) {
            this.elementos[index] = this.elementos[index + 1];
        }
        this.tamanho--;
    }

}
