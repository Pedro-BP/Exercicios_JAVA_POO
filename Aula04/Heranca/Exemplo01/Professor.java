package Aula04_Heranca.Exemplo01;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Professor extends Pessoa { // Subclasse

    private String disciplina;

    public Professor(String nome, String endereco, int idade, String disciplina) {
        super(nome, endereco, idade);
        this.disciplina = disciplina;
    }
}
