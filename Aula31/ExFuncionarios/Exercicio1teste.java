/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula31.ExFuncionarios;

import Aula31.ExFuncionarios.Exercicio1classeFuncionarioMensalista;
import Aula31.ExFuncionarios.Exercicio1classeFuncionarioHorista;
import Aula31.ExFuncionarios.Exercicio1classeFuncionarioComissionario;

/**
 * @version 1
 * @author felipe
 */
public class Exercicio1teste {
    public static void main(String[] args){
        Exercicio1classeFuncionarioMensalista funM = new Exercicio1classeFuncionarioMensalista("Ana", 2300, 22);
        Exercicio1classeFuncionarioHorista funH = new Exercicio1classeFuncionarioHorista("Maria", 400, 40);
        Exercicio1classeFuncionarioComissionario funC = new Exercicio1classeFuncionarioComissionario("Igor", 1000, 300);
        
        funM.processarPagamento();
        funH.processarPagamento();
        funC.processarPagamento();
        
    }
}
