package Aula02_Ex_01;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Pessoa {
    
    private String nome;
    private int idade;
    private double altura;
    
    public Pessoa(String n, int i, double a) {
        this.nome = n;
        this.idade = i;
        this.altura = a;
    }
    
    public void status() {
        System.out.println("\n # INFORMAÇÕES #");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade() + " anos");
        System.out.println("Altura: " + this.getAltura() + " m");
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }
}
