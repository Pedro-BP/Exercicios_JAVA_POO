package Aula02_Ex_04;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Livro {

    private String titulo, autor;
    private int anoPublicacao;
    private boolean disponivel;
    
    public Livro(String t,String a,int aP,boolean d) {
        this.titulo = t;
        this.autor = a;
        this.anoPublicacao = aP;
        this.disponivel = d;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro emprestado.");
        } else {
            System.out.println("Livro já foi emprestado.");
        }
    }
    
    void devolver() {
        if (disponivel) {
            System.out.println("O livro já foi devolvido.");
        } else {
            disponivel = true;
            System.out.println("Livro devolvido.");
        }
    }
}
