package Aula02_Ex_14;

/**
 * 14. Classe Casa: Crie uma classe Casa com os atributos numero, cor e 
 *     proprietario (objeto da classe Pessoa). Crie um construtor e métodos 
 *     getters.
 * 
 * @author PEDROBORGESPOSPICHIL
 */
public class Main {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Carlos Silva");

        Casa casa1 = new Casa(123, "Branca", p1);

        System.out.println("Número da casa: " + casa1.getNumero());
        System.out.println("Cor da casa: " + casa1.getCor());
        System.out.println("Proprietário: " + casa1.getProprietario().getNome());
    }
}
