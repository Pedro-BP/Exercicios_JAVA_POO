package Aula03_Ex_08;

/**
 * 8. Veículos: Crie uma interface Veiculo com os métodos acelerar(), frear() e 
 *    virar(String direcao). Implemente essa interface em classes como Carro, 
 *    Moto e Bicicleta.
 * 
 * @author PEDROBORGESPOSPICHIL
 */
public class Main {
    
    public static void main(String[] args) {
        
        Carro c1 = new Carro("Fiat Marea",true);
        Moto m1 = new Moto("Kawazaki Ninja",true);
        Bicicleta b1 = new Bicicleta("Caloi Strada");
        
        String a = "direita";
        String b = "esquerda";
        
        System.out.println(c1.getModelo() + " está " + c1.acelerar());
        System.out.println(c1.getModelo() + " está " + c1.virar(a));
        System.out.println(c1.getModelo() + " está " + c1.frear());
        System.out.println("\n");
        System.out.println(m1.getModelo() + " está " + m1.acelerar());
        System.out.println(m1.getModelo() + " está " + m1.virar(b));
        System.out.println(m1.getModelo() + " está " + m1.frear());
        System.out.println("\n");
        System.out.println(b1.getModelo() + " está " + b1.acelerar());
        System.out.println(b1.getModelo() + " está " + b1.virar(a));
        System.out.println(b1.getModelo() + " está " + b1.frear());
    }
}
