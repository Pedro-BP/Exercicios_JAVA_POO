package Aula04_Ex_02;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Workshop extends Evento {
    
    private String instrutor;

    public Workshop(String nome, String data, String instrutor) {
        super(nome, data);
        this.instrutor = instrutor;
    }

    public String getInstrutor() {
        return instrutor;
    }
}
