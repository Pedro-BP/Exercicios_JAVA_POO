package Aula01_Ex_06;

import java.util.Scanner;

/**
 * 6. Crie uma classe Funcionario com os atributos nome (String), 
 *    salario (double) e departamento (String). Crie um método 
 *    aumentarSalario(double percentual) que aumenta o salário do funcionário 
 *    em um determinado percentual.
 * 
 * @author PEDROBORGESPOSPICHIL
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Funcionario funcionario = new Funcionario();
        
        System.out.print("Digite o nome do funcionário: ");
        funcionario.nome = sc.nextLine();
        
        System.out.print("Digite o departamento: ");
        funcionario.departamento = sc.nextLine();
        
        System.out.print("Digite o salário atual: ");
        funcionario.salario = sc.nextDouble();
        
        System.out.print("Digite o percentual de aumento: ");
        double percentual = sc.nextDouble();
        
        System.out.println("Novo salário do funcionário "+funcionario.nome+": "+funcionario.aumentarSalario(percentual));
    }
}
