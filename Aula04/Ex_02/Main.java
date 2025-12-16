package Aula04_Ex_02;

/**
 * 2. Eventos 
 * Crie uma classe Evento com os atributos nome e data. 
 * Crie subclasses Show, Palestra e Workshop que herdam de Evento e adicionam 
 * seus próprios atributos específicos:
 * - Show: artista
 * - Palestra: palestrante
 * - Workshop: instrutor
 * 
 * @author PEDROBORGESPOSPICHIL
 */
public class Main {
    
    public static void main(String[] args) {
        
        Show s = new Show("Guns N'Roses","01/04/2026","Axl Rose");
        Palestra p = new Palestra("Web Summit Rio","25/08/2026","Marcio Aguiar");
        Workshop w = new Workshop("Litoral TEC","23/10/2025","Vini Jr.");
        
        System.out.println("Show - "
                +        "\nNome: "+s.nome
                +        "\nData: "+s.data
                +        "\nArtista: "+s.getArtista());
        
        System.out.println("\nPalestra - "
                +        "\nNome: "+p.nome
                +        "\nData: "+p.data
                +        "\nPalestrante: "+p.getPalestrante());
        
        System.out.println("\nWorkshop - "
                +        "\nNome: "+w.nome
                +        "\nData: "+w.data
                +        "\nInstrutor: "+w.getInstrutor());             
    }
}
