/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula31.ExFuncionarios;

import Aula31.ExFuncionarios.Exercicio1classeFuncionario;
import java.util.Scanner;

/**
 * classe para os funcionários comissionários
 * @version 1
 * @author felipe
 */
public class Exercicio1classeFuncionarioComissionario extends Exercicio1classeFuncionario implements Exercicio1interface{
    Scanner ler = new Scanner(System.in);
    /**
     * número de comissões ganhas
     */
    private int comissoes;
    /**
     * valor das comissões
     */
    private double valorComissao;
    
    /**
     * construtor da classe dos funcionários comissionários
     * @param nome nome do funcionário
     * @param salarioBase salário base do funcionário
     * @param comissao valor das comissões
     */
    public Exercicio1classeFuncionarioComissionario(String nome, double salarioBase, double comissao){
        super(nome, salarioBase);
        this.valorComissao = comissao;
    }
    
    /**
     * método para calcular o salário do mês atual
     * @return salário base mais as comissões
     */
    @Override
    public double calculaSalario (){
        System.out.print("Indique seu numero de comissões: ");
        comissoes = ler.nextInt();
        return getSalarioBase() + (valorComissao * comissoes);
    }
    /**
     * método para saber o salário atual e para processar o pagamento
     */
    @Override
    public void processarPagamento(){
        System.out.println("Seu salário: "+calculaSalario());
        System.out.println("Pagamento efetuado com sucesso!\n");
    }
}
