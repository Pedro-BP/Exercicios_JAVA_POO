package Aula03_Ex_12;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Tecnico implements Funcionario {

    private double salarioBase;
    private double adicionalInsalubridade;

    public Tecnico(double salarioBase, double adicionalInsalubridade) {
        this.salarioBase = salarioBase;
        this.adicionalInsalubridade = adicionalInsalubridade;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + adicionalInsalubridade;
    }
}
