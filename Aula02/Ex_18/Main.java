package Aula02_Ex_18;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Main {

    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria("Maria", 1000);
        boolean saque = conta.sacar(300);   
        System.out.println("\nSaque realizado? " + saque + " | Saldo atual: " + conta.getSaldo());
    }
}
