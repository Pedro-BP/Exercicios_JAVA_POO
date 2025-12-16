package Aula02_Ex_13;

/**
 * 13. Classe Animal: Crie uma classe Animal com os atributos nome e especie. 
 *     Crie um construtor e métodos getters.
 * 
 * @author PEDROBORGESPOSPICHIL
 */
public class Main {
   
    public static void main(String[] args) {

        Animal a1 = new Animal("Thor", "Cachorro");
        Animal a2 = new Animal("Mimi", "Gato");
        Animal a3 = new Animal("Rex", "Cavalo");

        System.out.println("Animal 1: " + a1.getNome() + " - " + a1.getEspecie());
        System.out.println("Animal 2: " + a2.getNome() + " - " + a2.getEspecie());
        System.out.println("Animal 3: " + a3.getNome() + " - " + a3.getEspecie());
    }
}
