package Aula03_Ex_05;

/**
 * 5. Funcionário com Interface Pagavel: Crie uma interface Pagavel com o método
 *    calcularPagamento(). Implemente essa interface em classes como 
 *    FuncionarioHorista e FuncionarioAssalariado.
 * 
 * @author PEDROBORGESPOSPICHIL
 */
public class Main {
   
    public static void main(String[] args) {
        
        FuncionarioHorista fh1 = new FuncionarioHorista("Julia","Caixa",25,6,30);
        FuncionarioAssalariado fa1 = new FuncionarioAssalariado("Clara","Vendedora",3000,30);
   
        System.out.println("Salario de "+fh1.getNome()+": "+fh1.calcularPagamento());
        System.out.println("Salario de "+fa1.getNome()+": "+fa1.calcularPagamento());
    }
}
