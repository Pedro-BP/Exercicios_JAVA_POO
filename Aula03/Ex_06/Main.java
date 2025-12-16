package Aula03_Ex_06;

/**
 * 6. Dispositivos Eletrônicos: Crie uma interface DispositivoEletronico com os 
 *    métodos ligar(), desligar() e obterStatus(). Implemente essa interface em 
 *    classes como Televisao, Radio e Celular.
 * 
 * @author PEDROBORGESPOSPICHIL
 */
public class Main {
    
    public static void main(String[] args) {
        
        Televisao t1 = new Televisao("Sansung Serie 6", false);
        Radio r1 = new Radio(97.1, true);
        Celular c1 = new Celular("POCO X6 Pro", true);
        
        System.out.println("Estado inicial dos aparelhos:");
        System.out.println(t1.obterStatus());
        System.out.println("\n"+r1.obterStatus());
        System.out.println("\n"+c1.obterStatus());
        
        System.out.println("\nAlterações:");
        System.out.println(t1.ligar());
        System.out.println(r1.desligar());
        System.out.println(c1.desligar());
        
        System.out.println("\nEstado final dos aparelhos: ");
        System.out.println(t1.obterStatus());
        System.out.println("\n"+r1.obterStatus());
        System.out.println("\n"+c1.obterStatus());
    }
}   