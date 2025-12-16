package Aula04_Heranca.Exemplo01;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Aluno extends Pessoa { // Subclase
 
    private int matricula;
    
    public Aluno(String nome, String endereco, int idade, int matricula) {
        super(nome, endereco, idade);
        this.matricula = matricula;
    }
}
