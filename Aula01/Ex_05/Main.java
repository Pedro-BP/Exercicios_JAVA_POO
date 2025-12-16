package Aula01_Ex_05;

import java.util.Scanner;

/**
 * 5. Crie uma classe Circulo com o atributo raio (double). Crie um método 
 *    calcularArea() que retorna a área do círculo e um método 
 *    calcularCircunferencia() que retorna a circunferência do círculo. Utilize 
 *    a constante Math.PI para representar o valor de π.
 * 
 * @author PEDROBORGESPOSPICHIL
 */
public class Main {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Circulo circulo01 = new Circulo();
        
        System.out.print("Digite o raio: ");
        circulo01.raio = sc.nextDouble();
        
        System.out.println("A área do círculo é igual a: "+circulo01.calcularArea());
        System.out.println("A circunferência do círculo é igual a: "+circulo01.calcularCircunferencia());
    }
}
