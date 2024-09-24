/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula33.Exercicio;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author felipe
 */
public class Paciente {
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private ArrayList<Atendimento> atendimentos;
    
    public Paciente(String nome, String sobrenome, LocalDate dataNascimento){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        atendimentos = new ArrayList<Atendimento>();
    }
    public Paciente(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    public Paciente(){
        atendimentos = new ArrayList<Atendimento>();
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public ArrayList<Atendimento> getAtendimentos() {
        return atendimentos;
    }
    
    public void adicionarConsulta (Atendimento atendimento){
        atendimentos.add(atendimento);
    }    
    public int getIdade (){
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataNascimento, dataAtual);
        return periodo.getYears();
    }
    
    @Override
    public boolean equals (Object o){
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Paciente pessoa = (Paciente) o;
        return nome.equals(pessoa.nome) && sobrenome.equals(pessoa.sobrenome);
    }
    @Override
    public String toString() {
        String retorno = "Nome: " + nome + " " + sobrenome;
        DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String data = formatoBr.format(this.dataNascimento);
        retorno += " - Data de nascimento: " + data;
        retorno += " - Idade: " + getIdade();
        return retorno;
    }
}
