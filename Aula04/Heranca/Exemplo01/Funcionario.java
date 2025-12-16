package Aula04_Heranca.Exemplo01;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Funcionario extends Pessoa { // Subclasse

    private String setor;
    
    public Funcionario(String nome, String endereco, int idade, String setor) {
        super(nome, endereco, idade);
        this.setor = setor;
    }
}
