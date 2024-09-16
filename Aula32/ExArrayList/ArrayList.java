/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula32.ExArrayList;

import java.util.ArrayList;

/**
 *
 * @author felipe
 */
public class ArrayList {
    public static void main(String[] args){
        
        ArrayList<String> l1 = new ArrayList<>(5);
        //add
        l1.add("A");
        l1.add("E");
        l1.add("I");
        l1.add("O");
        l1.add("U");
        l1.add("U");
        //add em um determinado espaço
        l1.add(3, "F");
        //imprime a lista
        System.out.println(l1);
        //busca um elemento
        System.out.println(l1.indexOf("F"));
        //retorn o elemento
        System.out.println(l1.remove(1));
        //retorna true ou false
        System.out.println(l1.remove("T"));
        //Obtém a ultima posição de um elemento na lista
        //Se não houver elementos duplicados, tem o mesmo resultado do indexOf
        System.out.println(l1.lastIndexOf("U"));
        //Verifica
        System.out.println(l1.contains("F"));
        //Obtem o tamanho
        System.out.println(l1.size());
        //Apaga todos os elementos da lista
        System.out.println(l1);
    }
}
