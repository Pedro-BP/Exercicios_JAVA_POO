package Aula03_Ex_07;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
class Dinheiro implements FormaPagamento {
 
    @Override
    public void efetuarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado em dinheiro.");
    }
}
