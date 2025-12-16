package Aula04_Heranca.Exemplo01;

import java.util.Scanner;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Main {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Marcos", "Nova Nordeste - Imbé", 25, 123456);
        Professor p1 = new Professor("Luis", "Av. Fernandes Bastos", 31, "Java POO");
        Funcionario f1 = new Funcionario("Perigo", "Av. Maria Joana", 18, "Técnico de Informática");

        System.out.println("Aluno: " + a1.nome + " " + a1.idade);
        System.out.println("Professor: " + p1.nome + " " + p1.idade);
        System.out.println("Funcionário: " + f1.nome + " " + f1.idade);
    }
}