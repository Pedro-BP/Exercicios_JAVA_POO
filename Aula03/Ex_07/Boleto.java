package Aula03_Ex_07;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
class Boleto implements FormaPagamento {
    
    private String codigoBarras;

    public Boleto(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void efetuarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via Boleto: " + codigoBarras);
    }
}
