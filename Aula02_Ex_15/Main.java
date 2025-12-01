package Aula02_Ex_15;

/**
 * 15. Classe Empregado: Crie uma classe Empregado com os atributos nome, cargo 
 *     e salario. Crie um construtor, métodos getters e setters, e um método 
 *     calcularBonus() que retorna um bônus de 10% do salário.
 * 
 * @author PEDROBORGESPOSPICHIL
 */
public class Main {
   
    public static void main(String[] args) {

        Empregado emp = new Empregado("Ana Souza", "Analista", 3500.00);

        System.out.println("Nome: " + emp.getNome());
        System.out.println("Cargo: " + emp.getCargo());
        System.out.println("Salário: R$ " + emp.getSalario());

        double bonus = emp.calcularBonus();
        System.out.println("Bônus (10%): R$ " + bonus);

        emp.setSalario(4000.00);
        System.out.println("\nSalário atualizado: R$ " + emp.getSalario());
        System.out.println("Novo bônus: R$ " + emp.calcularBonus());
    }
}
