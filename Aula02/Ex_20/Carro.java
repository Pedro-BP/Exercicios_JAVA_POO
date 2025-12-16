package Aula02_Ex_20;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Carro {

    private String modelo;
    private boolean ligado;

    public Carro(String modelo) {
        this.modelo = modelo;
        this.ligado = false;
    }

    public void ligar() {
        ligado = true;
        System.out.println("O carro foi ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println("O carro foi desligado.");
    }

    public void acelerar() {
        if (ligado) {
            System.out.println("O carro " + modelo + " está acelerando!");
        } else {
            System.out.println("Não é possível acelerar. O carro está desligado.");
        }
    }    
}
