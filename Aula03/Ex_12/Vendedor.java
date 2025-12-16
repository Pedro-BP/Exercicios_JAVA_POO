package Aula03_Ex_12;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Vendedor implements Funcionario {

    private double salarioBase;
    private double comissao;
    private double totalVendas;

    public Vendedor(double salarioBase, double comissao, double totalVendas) {
        this.salarioBase = salarioBase;
        this.comissao = comissao;
        this.totalVendas = totalVendas;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (totalVendas * comissao);
    }
}
