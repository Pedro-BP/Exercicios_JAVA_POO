package Aula04_Ex_01;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Jogo extends Midia {

    String plataforma, classificacao;

    public Jogo(String titulo, String duracao, String plataforma, String classificacao) {
        super(titulo, duracao);
        this.plataforma = plataforma;
        this.classificacao = classificacao;
    }
}
