package Aula02_Ex_11;

/**
 * 11. Classe Televisão: Crie uma classe Televisao com os atributos volume e
 * canal. Crie um construtor, métodos getters e setters, e os métodos
 * aumentarVolume(), diminuirVolume(), trocarCanal(int novoCanal) que alteram o
 * estado dos atributos.
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Main {

    public static void main(String[] args) {

        Televisao tv = new Televisao(10, 5);

        System.out.println("Volume inicial: " + tv.getVolume());
        System.out.println("Canal inicial: " + tv.getCanal());

        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.diminuirVolume();

        tv.trocarCanal(12);
        tv.trocarCanal(99);

        System.out.println("Volume final: " + tv.getVolume());
        System.out.println("Canal final: " + tv.getCanal());
    }
}
