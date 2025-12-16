package Aula02_Ex_04;

/**
 * 4. Classe Livro: Crie uma classe Livro com os atributos titulo, autor, 
 *    anoPublicacao e disponivel (booleano). Crie um construtor, métodos 
 *    getterse setters, e os métodos emprestar() e devolver() que alteram o 
 *    estado do atributo disponivel.
 * 
 * @author PEDROBORGESPOSPICHIL
 */
public class Main {
    
    public static void main(String[] args) {
        Livro l1 = new Livro("João e Maria","Pedro",2025,true);
        System.out.println("O livros está disponivel? "+l1.isDisponivel());
        
        // pessoa 1 queria o livro.
        l1.emprestar();
        System.out.println("O livros está disponivel? "+l1.isDisponivel());
        
        // pessoa 1 devolveu o livro.
        l1.devolver();
        System.out.println("O livros está disponivel? "+l1.isDisponivel());
    }
}
