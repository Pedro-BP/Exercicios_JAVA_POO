package Aula04_Ex_03;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Gerente extends Funcionario {
    
    private String departamento;

    public Gerente(String nome, double salario, String cargo, String departamento) {
        super(nome, salario, cargo);
        this.departamento = departamento;
        
    }

    public String getDepartamento() {
        return departamento;
    }
}
