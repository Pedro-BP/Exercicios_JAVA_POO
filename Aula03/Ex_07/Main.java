package Aula03_Ex_07;

/**
 * 7. Formas de Pagamento: Crie uma interface FormaPagamento com o método 
 *    efetuarPagamento(double valor). Implemente essa interface em classes como 
 *    CartaoCredito, Boleto e Dinheiro.
 * 
 * @author PEDROBORGESPOSPICHIL
 */
public class Main {
    
    public static void main(String[] args) {
       
        FormaPagamento pagamento1 = new CartaoCredito("1234 5678 9876 5432");
        FormaPagamento pagamento2 = new Boleto("00190000090234567890123456789012345678901234");
        FormaPagamento pagamento3 = new Dinheiro();

        pagamento1.efetuarPagamento(150.00);
        pagamento2.efetuarPagamento(89.90);
        pagamento3.efetuarPagamento(50.00);
    }
}
