/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula33.Exercicio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author felipe
 */
public class Atendimento {
    private LocalDate data;
    private String descricao;

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    @Override
    public String toString() {
        DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String data = formatoBr.format(this.data);
        String retorno = "Data: " + data;
        retorno += "\nInformaçoes: " + descricao;
        return retorno;
    }

}