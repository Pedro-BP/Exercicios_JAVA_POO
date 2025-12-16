package Aula04_Ex_03;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Desenvolvedor extends Funcionario {
    
    private String linguagemDeProgramacao;

    public Desenvolvedor(String nome, double salario, String cargo, String linguagemDeProgramacao) {
        super(nome, salario, cargo);
        this.linguagemDeProgramacao = linguagemDeProgramacao;
    }

    public String getLinguagemDeProgramacao() {
        return linguagemDeProgramacao;
    }
}
