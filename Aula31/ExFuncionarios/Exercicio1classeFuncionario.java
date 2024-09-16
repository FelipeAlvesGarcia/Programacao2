/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula31.ExFuncionarios;

/**
 * classe para os funcionários (de maneira geral)
 * @version 1
 * @author felipe
 */
public abstract class Exercicio1classeFuncionario{
    /**
     * nome do funcionário
     */
    private String nome;
    /**
     * salário base do funcionário
     */
    private double salarioBase;
    
    /**
     * construtor da classe super dos funcionários
     * @param nome nome do funcionário
     * @param salarioBase salário base do funcionário
     */
    public Exercicio1classeFuncionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    /**
     * método para obter o nome
     * @return 
     */
    public String getNome() {
        return nome;
    }
    /**
     * método para alterar o valor do nome
     * @param nome é o novo valor do nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * método para obter o salário base
     * @return 
     */
    public double getSalarioBase() {
        return salarioBase;
    }
    /**
     * método para alterar o valor do salário base
     * @param salarioBase é o novo valor do salário base
     */
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    /**
     * método para calcular o salário, sendo a base para as subclasses
     * @return 
     */ 
    public abstract double calculaSalario();    
}
