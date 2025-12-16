package Aula04_Ex_02;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Palestra extends Evento {
    
    private String palestrante;

    public Palestra(String nome, String data, String palestrante) {
        super(nome, data);
        this.palestrante = palestrante;
    }

    public String getPalestrante() {
        return palestrante;
    }
}
