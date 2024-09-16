/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula32.ExLista;

/**
 *
 * @author felipe
 */
public class Exemplo1Lista<T> {
    private T[] elementos;
    private int tamanho;
    
    /**
     * Inicializa uma lista com capacidade elementos
     * @param capacidade capacidade inicial
     */
    public Exemplo1Lista(int capacidade){
        elementos = (T[])new Object[capacidade];
        tamanho = 0;
    }
    
    /**
     * Inicializa uma lista com uma capacidade de 10 elemetos
     */
    public Exemplo1Lista(){
        elementos = (T[])new Object[10];//Object pai de todos
        tamanho = 0;
    }
    
    private void aumentaCapacidade(){
        if(tamanho == elementos.length){
            T[] aux = (T[])new Object[tamanho*2];
            for(int i=0; i<tamanho; i++){
                aux[i] = elementos[i];
            }
            elementos = aux;
        }
    }
    
    /**
     * Adiciona um elemento no final da lista
     * @param elemento elemento que srá adicionado
     */
    public void add(T elemento){
        aumentaCapacidade();
        elementos[tamanho++] = elemento;
    }
    
    /**
     * Permite adicionar um elemento em qualquer lugar da lista
     * @param elemento elemento a ser adicionado
     * @param posicao posição que o elemento vai ser adicionado
     */
    public void add(T elemento, int posicao) throws IllegalArgumentException{
        if(posicao < 0 || posicao >= tamanho){
            throw new IllegalArgumentException("Posição Inválida");
        }
        aumentaCapacidade();
        for(int i=tamanho-1; i>=posicao; i--){
            elementos[i+1] = elementos[i];
        }
        elementos[posicao] = elemento;
        tamanho++;
    }
    
    /**
     * Remove elementos determinados
     * @param posicao Posição do elemento a ser deletado
     * @return O elemento deletado
     * @throws IllegalArgumentException Se a posição for inválida
     */
    public T remove(int posicao) throws IllegalArgumentException{
        if(posicao < 0 || posicao >= tamanho){
            throw new IllegalArgumentException("Posição Inválida");
        }
        T retorno = elementos[posicao];
        for(int i=posicao; i<tamanho-1; i++){
            elementos[i] = elementos[i+1];
        }
        tamanho--;
        return retorno;
    }
    /**
     * Remove elementos determinados
     * @param elemento Elemento a ser deletado
     * @return true se o elemento foi deletado e false se não foi deletado
     */
    public boolean remove(T elemento) throws IllegalArgumentException{
        for(int i=0; i<tamanho; i++){
            if(elementos[i].equals(elemento)){
                for(int n=i; n<tamanho-1; n++){
                    elementos[n] = elementos[n+1];
                }
                tamanho--;
                return true;
            }
        }
        return false;
    }
    
    /**
     * Limpa a lista (todos os elementos)
     */
    public void limpar(){
        tamanho = 0;
    }
    
    /**
     * Obtém o número de elementos
     * @return o número de elementos da lista
     */
    public int tamanho(){
        return tamanho;
    }
    
    /**
     * Verifica se está vazia
     * @return true se a lista está vazia e false se a lista não está vazia
     */
    public boolean estaVazia(){
        if(tamanho == 0){
            return true;
        }
        return false;
    }
    
    /**
     * Verifica se a lista contém o elemento
     * @param elemento Elemento a ser verificado
     * @return true se a lista contém e false se a listaa não possuir
     */
    public boolean contem(T elemento){
        for(int i=0; i<tamanho; i++){
            if(elementos[i].equals(elemento)){
                return true;
            }
        }
        return false;
    }
    
    /**
     * Obtém o elemento da posição determinada
     * @param posicao posição a ser obtida
     * @throws IllegalArgumentException exceção se a posição for inválida
     * @return Retorna o elemento da posição determinada
     */
    public T obterElemento(int posicao)throws IllegalArgumentException{
        if(posicao < 0 || posicao >= tamanho){
            throw new IllegalArgumentException("Posição Inválida");
        }
        return elementos[posicao];
    }
    
    /**
     * Obtŕm a posição de um elemento da lista
     * @param elemento elemesto a ser buscado
     * @return a posição do elemento na lista ou -1 caso não encontre
     */
    public int busca(T elemento){
        for(int i=0; i<tamanho; i++){
            if(elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }
    
    /**
     * Verifica a ultima posição de um elemento
     * @param elemento Elemento a ser verificado
     * @return retorna a última posição
     */
    public int ultimaPosicaoElemento(T elemento){
        int last = -1;
        for(int i=0; i<tamanho; i++){
            if(elementos[i].equals(elemento)){
                last = i;
            }
        }
        return last;
    }
    
    /**
     * Monta uma string com o conteudo da lista
     * @return um conjunto vazio se o tamanho for igual a 0, se o tamanho for maior ele retorna a lista
     */
    @Override
    public String toString(){
        String resultado = "[";
        if(tamanho > 0){
            for(int i=0; i<tamanho-1;i++){
                resultado+=elementos[i]+", ";
            }
            resultado+=elementos[tamanho-1];
        }
        resultado+="]";
        return resultado;
    }
}
