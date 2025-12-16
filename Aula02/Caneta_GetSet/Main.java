package Aula02.Caneta_GetSet;

/**
 * 
 * @author PEDROBORGESPOSPICHIL
 */
public class Main {
    public static void main(String[] args) {
        
        Caneta c1 = new Caneta("Bic","Azul",0.5);
        
        c1.setModelo("Pilot");
        c1.setCor("Vermelha");
        c1.setPonta(2.0);
        c1.setTampada(false);
        
        c1.status();        
    }
}
