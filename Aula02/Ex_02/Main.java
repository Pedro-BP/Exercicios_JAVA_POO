package Aula02_Ex_02;

import java.util.Scanner;

/**
 * 2. Classe Conta Bancária: Crie uma classe ContaBancaria com os atributos 
 *    numeroConta, saldo e titular. Crie um construtor, métodos getters e 
 *    setters para saldo, e um método depositar(double valor) que adiciona o 
 *    valor ao saldo.
 * 
 * @author PEDROBORGESPOSPICHIL
 */
public class Main {
    public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);
        ContaBancaria c1 = new ContaBancaria("12345678-9",0,"teste");
        
        System.out.println("Saldo da Conta: R$ "+c1.getSaldo());
        System.out.print("\nDigite o valor a depositar: ");
        c1.depositar(sc.nextDouble());
        System.out.println("\nNovo Saldo: R$ "+c1.getSaldo());
    }
}
