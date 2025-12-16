package Aula02_Ex_05;

/**
 * 5. Classe Produto: Crie uma classe Produto com os atributos nome, preco e 
 *    quantidadeEmEstoque. Crie um construtor, métodos getters e setters, e um  
 *    método comprar(int quantidade) que diminui a quantidade em estoque se 
 *    houver disponibilidade.
 * 
 * @author PEDROBORGESPOSPICHIL
 */
public class Main {
    
    public static void main(String[] args) {
        Produto p = new Produto("Notebook", 3500.00, 10);

        System.out.println("Produto: " + p.getNome());
        System.out.println("Preço: R$ " + p.getPreco());
        System.out.println("Estoque inicial: " + p.getQuantidadeEmEstoque());

        boolean compra1 = p.comprar(3);
        if (compra1) {
            System.out.println("Compra de 3 unidades realizada!");
        } else {
            System.out.println("Falha na compra!");
        }
        System.out.println("Estoque atual: " + p.getQuantidadeEmEstoque());

        boolean compra2 = p.comprar(20);
        if (compra2) {
            System.out.println("Compra de 20 unidades realizada!");
        } else {
            System.out.println("Falha na compra — estoque insuficiente!");
        }
        System.out.println("Estoque final: " + p.getQuantidadeEmEstoque());
    }
}
