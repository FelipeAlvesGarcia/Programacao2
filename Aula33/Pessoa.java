package Aula33;

/**
 *
 * @author felipe
 */
public class Pessoa {
    private String nome;
    private String sobrenome;
    private float altura;

    public Pessoa (String nome, String sobrenome, float altura){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.altura = altura;
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

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    @Override
    public String toString (){
        String frase = "Nome: "+nome+" "+sobrenome+" mede: "+altura+"m";
        return frase;
    }
}
