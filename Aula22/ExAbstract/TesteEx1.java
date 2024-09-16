package Aula22.ExAbstract;

public class TesteEx1 {
    public static void main (String[] args){
        RetanguloEx1 calcRetangulo = new RetanguloEx1("retângulo", 4.5, 8);
        System.out.println("Área = "+calcRetangulo.calcArea()+" m²");
        System.out.println("Perímetro = "+calcRetangulo.calcPerimetro()+" m");
    }
}
