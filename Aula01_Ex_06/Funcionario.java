package Aula01_Ex_06;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Funcionario {
    
    String nome, departamento;
    double salario;
    
    public double aumentarSalario(double percentual) {
        return salario += salario * (percentual / 100);
    }
}
