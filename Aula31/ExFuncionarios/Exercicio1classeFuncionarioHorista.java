/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula31.ExFuncionarios;

import Aula31.ExFuncionarios.Exercicio1classeFuncionario;
import java.util.Scanner;

/**
 * classe para os funcionários horistas
 * @version 1
 * @author felipe
 */
public class Exercicio1classeFuncionarioHorista extends Exercicio1classeFuncionario implements Exercicio1interface{
    Scanner ler = new Scanner(System.in);
    /**
     * número de horas trabalhadas por semana
     */
    private int horasTrabalho;
    /**
     * número de horas que o funcionário trabalhou na semana
     */
    private int horasTrabalhados;
    
    /**
     * construtor da classe dos funcionários horistas
     * @param nome nome do funcionário
     * @param salarioBase salário base do funcionário
     * @param horasTrabalho horas de trabalho por semana
     */
    public Exercicio1classeFuncionarioHorista(String nome, double salarioBase, int horasTrabalho){
        super(nome, salarioBase);
        this.horasTrabalho = horasTrabalho;
    }

    /**
     * método para obter o número de horas de trabalho por semana
     * @return número de horas de trabalho por semana
     */
    public int getHorasTrabalho() {
        return horasTrabalho;
    }
    /**
     * método para alterar o número de horas de trabalho por semana
     * @param horasTrabalho o novo número de horas de trabalho por semana
     */
    public void setHorasTrabalho(int horasTrabalho) {
        this.horasTrabalho = horasTrabalho;
    }
    /**
     * método para obter o número de horas que o funcionário trabalhou na semana
     * @return o número se horas que o funcionário trabalhou na semana
     */
    public int getHorasTrabalhados() {
        return horasTrabalhados;
    }
    /**
     * método para alterar o número de horas que o funcionário trabalhou na semana
     * @param horasTrabalhados o novo número de horas que o funcionário trabalhou por semana
     */
    public void setHorasTrabalhados(int horasTrabalhados) {
        this.horasTrabalhados = horasTrabalhados;
    }
    /**
     * método que calcula o salário da semana trabalhada
     * @return o salário da semana trabalhada
     */
    @Override
    public double calculaSalario (){
        System.out.print("Indique seu numero de horas trabalhadas: ");
        horasTrabalhados = ler.nextInt();
        return (getSalarioBase() / horasTrabalho) * horasTrabalhados;
    }
    /**
     * método para mostrar o salário atual e fazer o processamento do pagamento
     */
    @Override
    public void processarPagamento(){
        System.out.println("Seu salário: "+calculaSalario());
        System.out.println("Pagamento efetuado com sucesso!\n");
    }
}
