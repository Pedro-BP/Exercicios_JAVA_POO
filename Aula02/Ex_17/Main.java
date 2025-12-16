package Aula02_Ex_17;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Main {

    public static void main(String[] args) {
        
        Livro livro1 = new Livro("1984", "George Orwell");
        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        System.out.println("\nLivro: " + livro1.getTitulo() + ", Autor: " + livro1.getAutor());
        System.out.println("Livro: " + livro2.getTitulo() + ", Ano: " + livro2.getAnoPublicacao());
    }
}
