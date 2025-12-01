package Aula02_Ex_17;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Livro {

    private String titulo;
    private String autor;
    private Integer anoPublicacao;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = null;
    }

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() { 
        return titulo; 
    }
    
    public String getAutor() { 
        return autor; 
    }
    
    public Integer getAnoPublicacao() { 
        return anoPublicacao; 
    }
}
