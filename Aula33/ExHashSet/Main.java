/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula33.ExHashSet;

import java.util.HashSet;

/**
 *
 * @author felipe
 */
public class Main {
    public static void main(String[] args){
        HashSet<String> listaCompras = new HashSet<>();
        
        System.out.println(listaCompras.add("Feijão"));
        System.out.println(listaCompras.add("Arroz"));
        System.out.println(listaCompras.add("Maçã"));
        System.out.println(listaCompras.add("Pera"));
        System.out.println(listaCompras.add("Feijão"));
        System.out.println(listaCompras);
        
    }
}
