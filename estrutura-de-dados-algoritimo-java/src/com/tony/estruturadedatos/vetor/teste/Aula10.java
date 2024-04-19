package com.tony.estruturadedatos.vetor.teste;

import com.tony.estruturadedatos.vetor.VetorObject;

/**Nesta Aula teremos o Uso da class Object que é a class PAI do Java onde todas oas outras classe herdarão dela
 * com isto podemos dar ex. de AutoBox , adcionando um dado Primitivo e dele se tornando uma Object
 */
public class Aula10 {

    public static void main(String[] args) {
        
        VetorObject vetorObject = new VetorObject(5);

        vetorObject.adiciona(3); /**Do tipo primitivo int */
        vetorObject.adiciona(4); /**Do tipo primitivo int */
        vetorObject.adiciona(5.20); /**Do tipo primitivo double */
        vetorObject.adiciona("3"); /**Do tipo String */
        
        System.out.println("Imprimindo o Tamanho: " + vetorObject.vertorTamanho());
        System.out.println("Imprimindo nosso Array Generico do Tipo Objeto: " + vetorObject);
        
        vetorObject.adiciona("name: Tony"); /**Do tipo String */
        
        System.out.println("Imprimindo o Tamanho: " + vetorObject.vertorTamanho());
        System.out.println("Imprimindo nosso Array Generico do Tipo Objeto: " + vetorObject);
    }
}
