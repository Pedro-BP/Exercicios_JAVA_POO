package Aula03_Ex_02;

/**
 * 2. Animal: Crie uma interface Animal com o método emitirSom(). Implemente 
 *    essa interface em classes como Cachorro, Gato e Passaro, cada uma com 
 *    sua própria implementação de emitirSom().
 * 
 * @author PEDROBORGESPOSPICHIL
 */
public class Main {
    
    public static void main(String[] args) {
        
        Cachorro c1 = new Cachorro("Nina","Pudlle",18);
        Gato g1 = new Gato("Fumaça","Persa",2);
        Passaro p1 = new Passaro("Chico","Papagaio",3);
        
        System.out.println("Qual o som de o "+c1.getNome()+" faz? "+c1.emitirSom());
        System.out.println("Qual o som de o "+g1.getNome()+" faz? "+g1.emitirSom());
        System.out.println("Qual o som de o "+p1.getNome()+" faz? "+p1.emitirSom());
    }
}
