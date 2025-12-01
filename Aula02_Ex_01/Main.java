package Aula02_Ex_01;

import java.util.Scanner;

/**
 * 1. Classe Pessoa: Crie uma classe Pessoa com os atributos nome, idade e
 *    altura. Crie um construtor que inicialize esses atributos e métodos getters
 *    para acessá-los.
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Main {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João",20,1.70);
        
        p1.status();
    }
}
