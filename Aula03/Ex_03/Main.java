package Aula03_Ex_03;

/**
 * 3. Figura Geométrica: Crie uma interface FiguraGeometrica com os métodos 
 *    calcularArea() e calcularPerimetro(). Implemente essa interface em classes 
 *    como Circulo e Retangulo.
 * 
 * @author PEDROBORGESPOSPICHIL
 */
public class Main {
   
    public static void main(String[] args) {
        
        Circulo c1 = new Circulo(10);
        Retangulo r1 = new Retangulo(10,5);
        
        System.out.println("Circulo: raio "+c1.getRaio());
        System.out.println("Area: "+c1.calcularArea());
        System.out.println("Perimetro: "+c1.calcularPerimetro());
        System.out.println("\nRetângulo: base "+r1.getBase()+" altura "+r1.getAltura());
        System.out.println("Area: "+r1.calcularArea());
        System.out.println("Perimetro: "+r1.calcularPerimetro());
    }
}
