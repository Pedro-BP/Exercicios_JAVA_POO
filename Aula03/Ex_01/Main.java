package Aula03_Ex_01;

/**
 * 1. Conta Bancária: Crie uma interface Conta com os métodos 
 *    depositar(double valor) e sacar(double valor). Implemente essa interface 
 *    em uma classe ContaCorrente.
 * 
 * @author PEDROBORGESPOSPICHIL
 */
public class Main {
   
    public static void main(String[] args) {
        
        ContaCorrente conta = new ContaCorrente();

        conta.depositar(500);
        conta.sacar(200);

        System.out.println("Saldo atual: R$ " + conta.getSaldo());
    }
}