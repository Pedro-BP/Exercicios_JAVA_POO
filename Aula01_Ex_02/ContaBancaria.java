package Aula01_Ex_02;

/**
 * @author PEDROBORGESPOSPICHIL
 */
public class ContaBancaria {

    String numeroConta, titular;
    double saldo;

    void depositar(double valor) {
        saldo += valor;
    }

    void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
