package Aula02_Ex_18;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class ContaBancaria {

private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() { 
        return saldo; 
    }
}
