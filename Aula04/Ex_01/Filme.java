package Aula04_Ex_01;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Filme extends Midia {
    
    String diretor, genero;

    public Filme(String titulo, String duracao, String diretor, String genero) {
        super(titulo, duracao);
        this.diretor = diretor;
        this.genero = genero;
    }
}
