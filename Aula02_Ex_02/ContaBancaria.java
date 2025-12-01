package Aula02_Ex_02;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class ContaBancaria {
    
    private String numeroConta;
    private double saldo;
    private String titular;
    
    public ContaBancaria(String nC,double s,String t) {
        this.numeroConta = nC;
        this.saldo = s;
        this.titular = t;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double s) {
        this.saldo = s;
    }
    
    double depositar(double valor) {
        return saldo += valor;
    }
}
