package Aula03_Ex_05;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class FuncionarioAssalariado implements Pagavel {

    private String nome, funcao;
    private double salario;
    private int dias;

    public FuncionarioAssalariado(String nome, String funcao, double salario, int dias) {
        this.nome = nome;
        this.funcao = funcao;
        this.salario = salario;
        this.dias = dias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    @Override
    public double calcularPagamento() {
        return salario = (salario / 30) * dias;
    }
}
