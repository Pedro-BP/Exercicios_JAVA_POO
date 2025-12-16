package Aula04_Ex_01;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Musica extends Midia {
    
    String artista, album;
    
    public Musica(String titulo, String duracao, String artista, String album) {
        super(titulo, duracao);
        this.artista = artista;
        this.album = album;
    }
}
