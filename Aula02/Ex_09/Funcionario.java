package Aula02_Ex_09;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Funcionario {
    
    String nome, departamento;
    double salario;

    public Funcionario(String nome, double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double aumentarSalario(double percentual) {
        return salario += salario * (percentual / 100); 
    }
}
