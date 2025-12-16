package Aula02_Ex_03;

import java.util.Scanner;

/**
 * 3. Classe Carro: Crie uma classe Carro com os atributos marca, modelo, ano e
 * ligado (booleano). Crie um construtor, métodos getters e setters, e os
 * métodos ligar() e desligar() que alteram o estado do atributo ligado.
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Main {

    public static void main(String[] args) {
        Carro c1 = new Carro("Ford", "Fiesta", 2023, false);

        System.out.println("\nEstado do carro: " + c1.isLigado());
        c1.ligar();
        System.out.println("\nEstado do carro: " + c1.isLigado());
        c1.desligar();
        System.out.println("\nEstado do carro: " + c1.isLigado());
        c1.ligar();
        System.out.println("\nEstado do carro: " + c1.isLigado());
        c1.ligar();
        System.out.println("\nEstado do carro: " + c1.isLigado());
        c1.desligar();
        System.out.println("\nEstado do carro: " + c1.isLigado());
        c1.desligar();
    }
}
