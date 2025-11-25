package Aula01_Ex_03;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Carro {
    String marca, modelo;
    int ano;
    boolean ligado;
    
    void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Ligando o carro...");
        } else {
            System.out.println("O carro já está ligado!");
        }
    }
    
    void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("Desligando o carro...");
        } else {
            System.out.println("...");
        }
    }
}
