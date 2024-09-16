/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula33.ExHashMap;

import java.util.HashMap;

/**
 *
 * @author felipe
 */
public class Main {
    public static void main (String[] args){
        HashMap<String, String> capitais = new HashMap<>();
        
        capitais.put("RS", "Porto Alegre");
        capitais.put("PR", "Curitiba");
        capitais.put("SP", "São Paulo");
        capitais.put("RS", "Taquara"); //Sobre escreve RS
        
        System.out.println(capitais);
        for(String uf:capitais.keySet()){
            System.out.print("UF - "+uf+"\n");
        }
        for(String cidade:capitais.values()){
            System.out.println("Capital - "+cidade);
        }
    }
}
