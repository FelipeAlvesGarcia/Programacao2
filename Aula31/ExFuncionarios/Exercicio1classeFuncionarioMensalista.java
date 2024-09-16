/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula31.ExFuncionarios;

import Aula31.ExFuncionarios.Exercicio1classeFuncionario;
import java.util.Scanner;

/**
 * classe dos para os funcionários mensalistas
 * @version 1
 * @author felipe
 */
public class Exercicio1classeFuncionarioMensalista extends Exercicio1classeFuncionario implements Exercicio1interface{
    Scanner ler = new Scanner(System.in);
    /**
     * número de dias de trabalho por mês
     */
    private int diasTrabalho;
    /**
     * número de dias que o funcionário trabalhou no mês
     */
    private int diasTrabalhados;
    
    /**
     * construtor da classe dos funcionários mensalistas
     * @param nome nome do funcionário
     * @param salarioBase salário base do funcionário
     * @param diasTrabalho número de dias de trabalho por mês
     */
    public Exercicio1classeFuncionarioMensalista(String nome, double salarioBase, int diasTrabalho){
        super(nome, salarioBase);
        this.diasTrabalho = diasTrabalho;
    }

    /**
     * método para obter os número de dias de trabalho por mês
     * @return número de dias de trabalho por mês
     */
    public int getDiasTrabalho() {
        return diasTrabalho;
    }
    /**
     * método para alterar o número de dias de trabalho por mês
     * @param diasTrabalho novo valor de número de dias de trabalho por mês
     */
    public void setDiasTrabalho(int diasTrabalho) {
        this.diasTrabalho = diasTrabalho;
    }
    /**
     * mẃtodo para obbter o número de dias trabalhados pelo funcionário
     * @return número de dias trabalhados pelo funcionário
     */
    public int getDiasTrabalhados() {
        return diasTrabalhados;
    }
    /**
     * método para alterar o número de dias trabalhados pelo funcionário
     * @param diasTrabalhados novo número de dias trabalhados pelo funcionário
     */
    public void setDiasTrabalhados(int diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }
    
    /**
     * método que calcula o sário do mês
     * @return salário atual do mês
     */
    @Override
    public double calculaSalario (){
        System.out.print("Indique seu numero de dias trabalhados: ");
        diasTrabalhados = ler.nextInt();
        return (getSalarioBase() / diasTrabalho) * diasTrabalhados;
    }
    /**
     * método para mostrar o salário atual e processar o pagamento
     */
    @Override
    public void processarPagamento(){
        System.out.println("Seu salário: "+calculaSalario());
        System.out.println("Pagamento efetuado com sucesso!\n");
    }
}
