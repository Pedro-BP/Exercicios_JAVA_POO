package Aula02_Ex_06;

/**
 * 6. Classe Retângulo: Crie uma classe Retangulo com os atributos largura e 
 *    altura. Crie um construtor, métodos getters e setters, e os métodos 
 *    calcularArea() e calcularPerimetro() que retornam a área e o perímetro do 
 *    retângulo, respectivamente.
 * 
 * @author PEDROBORGESPOSPICHIL
 */
public class Main {
    
    public static void main(String[] args) {
    
        Retangulo r = new Retangulo(10,5);
        
        System.out.println("A área desse retângulo é: "+r.calcularArea());
        System.out.println("O perímetro desse retângulo é: "+r.calcularPerimetro());
    }
}
