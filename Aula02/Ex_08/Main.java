package Aula02_Ex_08;

/**
 * 8. Classe Aluno: Crie uma classe Aluno com os atributos nome, matricula e 
 *    notas (um array de doubles). Crie um construtor, métodos getters e 
 *    setters, e um método calcularMedia() que retorna a média das notas do 
 *    aluno.
 * 
 * @author PEDROBORGESPOSPICHIL
 */
public class Main {
    public static void main(String[] args) {

        double[] notas = {8.5, 7.0, 9.2};

        Aluno aluno = new Aluno("João Silva", "2025001", notas);

        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Média: " + aluno.calcularMedia());
    }
}