package Aula03.Ex_11;

/**
 * 11. Formas: Crie uma interface Forma com os métodos calcularArea() e 
 *     calcularPerimetro(). Implemente essa interface em classes como 
 *     Quadrado, Triangulo e Circulo.
 * 
 * @author PEDROBORGESPOSPICHIL
 */
public class Main {
    
      public static void main(String[] args) {

        Forma quadrado = new Quadrado(5, 5);
        Forma triangulo = new Triangulo(3, 4, 5, 6);
        Forma circulo = new Circulo(2.5);

        System.out.println("=== Quadrado ===");
        System.out.println("Área: " + quadrado.calcularArea());
        System.out.println("Perímetro: " + quadrado.calcularPerimetro());

        System.out.println("\n=== Triângulo ===");
        System.out.println("Área: " + triangulo.calcularArea());
        System.out.println("Perímetro: " + triangulo.calcularPerimetro());

        System.out.println("\n=== Círculo ===");
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());
    }
}
