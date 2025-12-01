package Aula02_Ex_07;

/**
 * 7. Classe Círculo: Crie uma classe Circulo com o atributo raio. Crie um 
 *    construtor, métodos getters e setters, e os métodos calcularArea() e 
 *    calcularCircunferencia() que retornam a área e a circunferência do 
 *    círculo, respectivamente. Utilize a constante Math.PI.
 * 
 * @author PEDROBORGESPOSPICHIL
 */
public class Main {
 
    public static void main(String[] args) {
        Circulo c1 = new Circulo(5);
        
        System.out.println("A área do círculo é: " + c1.calcularArea());
        System.out.println("A circunferencia do círculo é: " + c1.calcularCircunferencia());
    }
}
