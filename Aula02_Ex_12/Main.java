package Aula02_Ex_12;

/**
 * 12. Classe Porta: Crie uma classe Porta com os atributos aberta (booleano) e 
 *     cor. Crie um construtor, métodos getters e setters, e os métodos abrir() 
 *     e fechar() que alteram o estado do atributo aberta.
 * 
 * @author PEDROBORGESPOSPICHIL
 */
public class Main {

     public static void main(String[] args) {

        Porta porta = new Porta(false, "Azul");

        System.out.println("Porta está aberta? " + porta.isAberta());
        System.out.println("Cor da porta: " + porta.getCor());

        porta.abrir();
        System.out.println("Porta está aberta? " + porta.isAberta());

        porta.fechar();
        System.out.println("Porta está aberta? " + porta.isAberta());

        porta.setCor("Vermelha");
        System.out.println("Nova cor da porta: " + porta.getCor());
    }
}
