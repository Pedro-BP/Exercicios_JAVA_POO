package Aula03_Ex_12;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Gerente implements Funcionario {

    private double salarioBase;
    private double bonus;

    public Gerente(double salarioBase, double bonus) {
        this.salarioBase = salarioBase;
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }
}

