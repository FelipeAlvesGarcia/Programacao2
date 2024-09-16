/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula33.Exercicio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author felipe
 */
public class Main {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        List<Paciente> listaPacientes = new ArrayList<>();
        char opcao = 'z';
        do{
            System.out.println("\n\nIncluir Paciente (I)");
            System.out.println("Alterar Paciente (A)");
            System.out.println("Listar Paciente (L)");
            System.out.println("Sair (S)");
            
            System.out.print("\nDigite sua Opção: ");
            opcao = ler.next().toLowerCase().charAt(0);
            
            switch(opcao){
                case 'i' ->{
                    System.out.print("Digite seu nome: ");
                    String nome = ler.next();
                    System.out.print("Digite seu sobrenome: ");
                    String sobrenome = ler.next();
                    
                    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    boolean valida = true;
                    LocalDate data = LocalDate.now();
                    do {
                        System.out.print("Digite uma data no formato (dd/MM/aaaa): ");
                        String dataStr = ler.next();
                        try{
                            data = LocalDate.parse(dataStr,formato);
                            valida = true;
                        }
                        catch (DateTimeParseException e){
                            System.out.println("Formato inválido!"+e);
                            valida = false;
                        }
                    }
                    while (!valida);
                    listaPacientes.add(new Paciente(nome, sobrenome, data));
                }
                case 'a' ->{
                    System.out.print("Digite o nome do paciente a alterar: ");
                    String nome = ler.next();
                    System.out.println(listaPacientes.indexOf(nome));
                }
                case 'l' ->{
                    System.out.println(listaPacientes);
                }
                case 's' ->{
                    
                }
                default ->{
                    System.out.println("Opção Inexistente!");
                }
            }
        }while(opcao != 's');
    }
}
