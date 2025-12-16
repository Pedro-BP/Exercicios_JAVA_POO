package Aula03_Ex_13;

/**
 * 13. Sistema de Gerenciamento de Estoque: Crie uma interface Produto com os 
 *     métodos obterNome(), obterPreco() e obterQuantidadeEmEstoque(). 
 *     Implemente essa interface em classes como Eletronico, Roupa e Alimento.
 * 
 * @author PEDROBORGESPOSPICHIL
 */
public class Main {
    
    public static void main(String[] args) {
        
        Eletronico e1 = new Eletronico(1234,"Mouse C3Tech",29.90,48);
        
        e1.obterNome();
        e1.obterPreco();
        e1.obterQuantidadeEmEstoque();
        
        System.out.println("");
        
        Roupa r1 = new Roupa(4321,"Calça Jeans 38",149.90,257);
        
        r1.obterNome();
        r1.obterPreco();
        r1.obterQuantidadeEmEstoque();
        
        System.out.println("");
        
        Alimento a1 = new Alimento(5479,"Ovo Asi c/ 20",13.39,57);
        
        a1.obterNome();
        a1.obterPreco();
        a1.obterQuantidadeEmEstoque();
    }
}
