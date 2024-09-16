/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula31.ExPublicacao;

/**
 * classe base com informações gerais de revistas, jornais e livros.
 * @version 1
 * @author felipe
 */
public abstract class Exercicio2classePublicacao {
    /**
     * título da obra
     */
    private String titulo;
    /**
     * autor da obra
     */
    private String autor;
    /**
     * ano de publicação da obra
     */
    private int anoPublicacao;
    
    /**
     * construtor geral das obras
     * @param titulo titulo da obra
     * @param autor autor da obra
     * @param anoPublicacao ano de publicação da obra
     */
    public Exercicio2classePublicacao(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    
    
    
    /**
     * método para emprestar obras da biblioteca
     */
    public abstract void emprestar();
    /**
     * método para devolver a obra à biblioteca
     */
    public abstract void devolver();
}
