package Aula02_Ex_09;

/**
 * 9. Classe Funcionário: Crie uma classe Funcionario com os atributos nome, 
 *    salario e departamento. Crie um construtor, métodos getters e setters, 
 *    e um método aumentarSalario(double percentual) que aumenta o salário 
 *    do funcionário pelo percentual fornecido.
 * 
 * @author PEDROBORGESPOSPICHIL
 */
public class Main {
    public static void main(String[] args) {

        Funcionario f = new Funcionario("Carlos", 3000.00, "TI");

        System.out.println("Nome: " + f.getNome());
        System.out.println("Departamento: " + f.getDepartamento());
        System.out.println("Salário atual: " + f.getSalario());

        f.aumentarSalario(10);

        System.out.println("\nApós aumento de 10%:");
        System.out.println("Novo salário: " + f.getSalario());
    }
}
