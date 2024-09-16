package Aula33.ExList;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author felipe
 */
public class ListaPessoa {
    public static void main (String[] args){
        List<Pessoa> listaPessoa = new ArrayList<>(); //ArrayList deriva de List
        
        listaPessoa.add(new Pessoa("Felipe", "Garcia", (float) 1.84));
        listaPessoa.add(new Pessoa("Maria", "Silva", (float) 1.71));
        listaPessoa.add(new Pessoa("Rafael", "Castro", (float) 1.92));

        System.out.println(listaPessoa);
        Pessoa aux = new Pessoa("João", "Pereira", (float) 1.78);
        listaPessoa.indexOf(aux);
    }
}
