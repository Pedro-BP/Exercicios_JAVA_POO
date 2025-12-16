package Aula04_Heranca.Exemplo01;

/**
 * Exemplo 01 - Pessoas: Crie uma classe Pessoa com os atributos nome, idade e
 * endereco. Crie subclasses Aluno, Professor e Funcionarios que herdam de
 * Pessoa e adicionam seus próprios atributos específicos (matrícula para Aluno,
 * disciplina para Professor, cargo para Funcionarios).
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Pessoa { // Classe HERANÇA (Superclasse)

    protected String nome, endereco;
    protected int idade;

    public Pessoa(String nome, String endereco, int idade) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
    }
}
