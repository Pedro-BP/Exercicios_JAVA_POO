package Aula04_Ex_01;

/**
 * 1. Mídias 
 * Crie uma classe Mídia com os atributos título e duração. 
 * Crie subclasses Música, Filme e Jogo que herdam de Mídia e adicionam seus 
 * próprios atributos específicos: 
 * - Música: artista e álbum
 * - Filme: diretor e gênero
 * - Jogo: plataforma e classificação
 * 
 * @author PEDROBORGESPOSPICHIL
 */
public class Main {
    
    public static void main(String[] args) {
        
        Musica m = new Musica("Trem Das Onze","3:06","Adoniran Barbosa","Trem Das Onze");
        Filme f = new Filme("Todo Mundo Em Pânico","1:28:00","Keenen Ivory Wayans","Terror/Comédia");
        Jogo j = new Jogo("Sekiro: Shadows Die Twice","30:00:00","PlayStation 4, Xbox One e Microsoft Windows","18 anos");
        
        System.out.println("Música - "
                +        "\nTítulo: "+m.titulo
                +        "\nDuração: "+m.duracao
                +        "\nArtista: "+m.artista
                +        "\nÁlbum: "+m.album);
        
        System.out.println("\nFilme - "
                +        "\nTítulo: "+f.titulo
                +        "\nDuração: "+f.duracao
                +        "\nDiretor: "+f.diretor
                +        "\nGênero: "+f.genero);
        
        System.out.println("\nJogo - "
                +        "\nTítulo: "+j.titulo
                +        "\nDuração: "+j.duracao
                +        "\nPlataforma: "+j.plataforma
                +        "\nClassificação: "+j.classificacao);        
    }
}
