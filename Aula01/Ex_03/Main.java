package Aula01_Ex_03;

/**
 * 3. Crie uma classe Carro com os atributos marca (String), modelo (String),
 *    ano (int) e ligado (boolean). Crie os métodos ligar() e desligar() que
 *    alteram o estado do carro.
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Main {
    public static void main(String[] args) {
        
        Carro carro01 = new Carro();
        carro01.marca = "Toyota";
        carro01.modelo = "Corolla";
        carro01.ano = 2020;
        
        carro01.ligar();
        carro01.desligar();
        carro01.ligar();
        carro01.ligar();
        carro01.desligar();
        carro01.desligar();
    }
}
