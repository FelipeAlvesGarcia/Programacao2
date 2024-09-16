/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula32.ExLista;

/**
 *
 * @author felipe
 */
public class Lista {
    public static void main(String[] args){
        Exemplo1Lista<String> lista = new Exemplo1Lista<>();
        lista.add("A");
        lista.add("A");
        lista.add("E");
        System.out.println(lista.estaVazia());
        lista.add("I");
        lista.add("O");
        lista.add("U");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        lista.add("G");
        System.out.println(lista.ultimaPosicaoElemento("A"));
        lista.add("H");
        lista.add("J");
        lista.add("K");
        lista.add("L");
        lista.add("M");
        lista.add("N");
        lista.add("F", 3);
        System.out.println(lista);
        System.out.println(lista.tamanho());
        //System.out.println(lista.obterElemento(6));
        System.out.println(lista.obterElemento(5));
        System.out.println(lista.busca("I"));
        lista.remove(6);
        System.out.println(lista);
        lista.add("B");
        System.out.println(lista);
        System.out.println(lista.contem("Z"));
        System.out.println(lista.contem("F"));
        System.out.println(lista.remove("M"));
        System.out.println(lista);
        lista.limpar();
        System.out.println(lista);
        System.out.println(lista.tamanho());
        System.out.println(lista.estaVazia());
    }
}
