package Aula02_Ex_16;

/**
 * 16. Classe Avião: Crie uma classe Aviao com os atributos modelo, 
 *     capacidadePassageiros e velocidadeMaxima. Crie um construtor e métodos 
 *     getters.
 * 
 * @author PEDROBORGESPOSPICHIL
 */
public class Main {
   
    public static void main(String[] args) {
        Aviao aviao = new Aviao("Boeing 737", 180, 850);
        System.out.println("Modelo do avião: " + aviao.getModelo());
    }
}
