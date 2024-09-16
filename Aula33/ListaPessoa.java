package Aula33;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author felipe
 */
public class ListaPessoa {
    public static void main (String[] args){
        List<Pessoa> listaPessoa = new ArrayList<>();
        
        listaPessoa.add(new Pessoa("Felipe", "Garcia", (float) 1.84));
        listaPessoa.add(new Pessoa("Maria", "Silva", (float) 1.71));
        listaPessoa.add(new Pessoa("Rafael", "Castro", (float) 1.92));

        System.out.println(listaPessoa);
    }
}
