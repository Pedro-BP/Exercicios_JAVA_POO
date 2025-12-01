package Aula02_Ex_10;

/**
 * 10. Classe Data: Crie uma classe Data com os atributos dia, mes e ano. Crie
 *     um construtor, métodos getters e setters, e um método formatarData() que 
 *     retorna a data no formato "dd/mm/aaaa".
* 
 * @author PEDROBORGESPOSPICHIL
 */
public class Main {
    
    public static void main(String[] args) {

        Data data = new Data(5, 7, 2025);

        System.out.println("Data formatada: " + data.formatarData());
    }
}
