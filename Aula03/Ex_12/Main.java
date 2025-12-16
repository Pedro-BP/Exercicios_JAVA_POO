package Aula03_Ex_12;

/**
 * 12. Funcionários: Crie uma interface Funcionario com o método 
 *     calcularSalario(). Implemente essa interface em classes como Gerente, 
 *     Vendedor e Tecnico, cada uma com sua própria lógica de cálculo de 
 *     salário.
 * 
 * @author PEDROBORGESPOSPICHIL
 */
public class Main {
    public static void main(String[] args) {

        Funcionario gerente = new Gerente(5000, 2000);
        Funcionario vendedor = new Vendedor(2000, 0.1, 15000);
        Funcionario tecnico = new Tecnico(2500, 500);

        System.out.println("Salário do Gerente: R$ " + gerente.calcularSalario());
        System.out.println("Salário do Vendedor: R$ " + vendedor.calcularSalario());
        System.out.println("Salário do Técnico: R$ " + tecnico.calcularSalario());
    }
}

