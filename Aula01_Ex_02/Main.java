package Aula01_Ex_02;

/**
 * 2. Crie uma classe ContaBancaria com os atributos numeroConta (String), saldo
 * (double) e titular (String). Crie os métodos depositar(double valor) e
 * sacar(double valor) que atualizam o saldo da conta.
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Main {

    public static void main(String[] args) {

        ContaBancaria conta01 = new ContaBancaria();
        conta01.numeroConta = "12345-0";  
        conta01.titular = "Marcos Costa";
        conta01.saldo = 1000;
        
        conta01.depositar(1500);
        conta01.sacar(500);
        
        System.out.println("Saldo Atual: R$ "+conta01.saldo);
    }
}
