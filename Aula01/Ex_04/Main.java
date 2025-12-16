package Aula01_Ex_04;

import java.util.Scanner;

/**
 * 4. Crie uma classe Retangulo com os atributos base (double) e altura 
 *    (double). Crie um método calcularArea() que retorna a área do retângulo e 
 *    um método calcularPerimetro() que retorna o perímetro do retângulo.
 * 
 * @author PEDROBORGESPOSPICHIL
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Retangulo retangulo01 = new Retangulo();
        
        System.out.println("Digite a base do retângulo: ");
        retangulo01.base = sc.nextDouble();
         
        System.out.println("Digite a altura do retângulo:");
        retangulo01.altura = sc.nextDouble();
        
        System.out.println("A área do retângulo é igual a: "+retangulo01.calcularArea());
        System.out.println("O perímetro do retângulo é igual a: "+retangulo01.calcularPerimetro());
    }
}
