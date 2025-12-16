package Aula03_Ex_13;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Eletronico implements Produto {

    private int codigo;
    private String modelo;
    private double preco;
    private int quantidade;

    public Eletronico(int codigo, String modelo, double preco, int quantidade) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    @Override
    public void obterNome() {
        System.out.println("Nome: " + this.modelo);
    }

    @Override
    public void obterPreco() {
        System.out.println("Preço: R$" + this.preco);
    }

    @Override
    public void obterQuantidadeEmEstoque() {
        System.out.println("Qnt: " + this.quantidade);
    }
}
