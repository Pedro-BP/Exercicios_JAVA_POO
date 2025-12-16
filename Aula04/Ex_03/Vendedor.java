package Aula04_Ex_03;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Vendedor extends Funcionario {
    
    private double comissao;

    public Vendedor(String nome, double salario, String cargo, double comissao) {
        super(nome, salario, cargo);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }
}
