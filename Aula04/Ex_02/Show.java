package Aula04_Ex_02;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Show extends Evento {
    
    private String artista;
    
    public Show(String nome, String data, String artista) {
        super(nome, data);
        this.artista = artista;
    }

    public String getArtista() {
        return artista;
    }
}
