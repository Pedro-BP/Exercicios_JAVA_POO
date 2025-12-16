package Aula03_Ex_07;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
class CartaoCredito implements FormaPagamento {
    private String numeroCartao;

    public CartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void efetuarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado no Cartão de Crédito " + numeroCartao);
    }
}
