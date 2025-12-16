
package Aula04_Ex_04;

import java.util.Scanner;

/**
 * 4. Eletrodomésticos
 * Crie uma classe Eletrodoméstico com os atributos marca, modelo e ligado 
 * (booleano).
 * Crie subclasses Televisão, Geladeira e Micro-ondas que herdam de 
 * Eletrodoméstico e adicionam seus próprios atributos e métodos específicos:
 * - Televisão: canal e volume
 * - Geladeira: temperatura
 * - Micro-ondas: potência
 * 
 * @author PEDROBORGESPOSPICHIL
 */
public class Main {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Televisao t = new Televisao("", "", false, "", 0);
        Geladeira g = new Geladeira("", "", false, 0);
        Microondas m = new Microondas("", "", false, "");

        System.out.println("Questionário de Eletrodomésticos:\n");

        System.out.println("1. Televisão");
        System.out.print("Qual a marca da sua televisão? ");
        t.setMarca(sc.nextLine());

        System.out.print("Qual o modelo da sua televisão? ");
        t.setModelo(sc.nextLine());

        System.out.println("Sua televisão está ligada agora?");
        System.out.println("[1] Sim\n[2] Não");
        int opc = sc.nextInt();

        t.setLigado(opc == 1);

        if (t.ligado) {
            System.out.print("Qual o canal da televisão? ");
            t.setCanal(sc.nextLine());
            
            sc.nextLine();
            
            System.out.print("Qual o volume atual da televisão? ");
            t.setVolume(sc.nextInt());
            sc.nextLine();
        }

        System.out.println("\n2. Geladeira");
        System.out.print("Qual a marca da sua geladeira? ");
        g.setMarca(sc.nextLine());

        System.out.print("Qual o modelo da sua geladeira? ");
        g.setModelo(sc.nextLine());

        System.out.println("Sua geladeira está ligada agora?");
        System.out.println("[1] Sim\n[2] Não");
        int opc2 = sc.nextInt();
        sc.nextLine();

        g.setLigado(opc2 == 1);

        if (g.ligado) {
            System.out.print("Qual a temperatura da geladeira? ");
            g.setTemperatura(sc.nextDouble());
            sc.nextLine();
        }

        System.out.println("\n3. Micro-ondas");
        System.out.print("Qual a marca do seu micro-ondas? ");
        m.setMarca(sc.nextLine());

        System.out.print("Qual o modelo do seu micro-ondas? ");
        m.modelo = sc.nextLine();

        System.out.println("Seu micro-ondas está ligado agora?");
        System.out.println("[1] Sim\n[2] Não");
        int opc3 = sc.nextInt();
        sc.nextLine();

        m.setLigado(opc3 == 1);

        if (m.ligado) {
            System.out.print("Qual a potência do micro-ondas? ");
            m.setPotencia(sc.nextLine());
        }

        System.out.println("\nResumo da pesquisa:\n");

        System.out.println("Televisão -> " +
                "\nMarca: " + t.marca +
                "\nModelo: " + t.modelo +
                "\nLigado: " + t.ligado +
                "\nCanal: " + t.getCanal() +
                "\nVolume: " + t.getVolume());

        System.out.println("\nGeladeira -> " +
                "\nMarca: " + g.marca +
                "\nModelo: " + g.modelo +
                "\nLigado: " + g.ligado +
                "\nTemperatura: " + g.getTemperatura());

        System.out.println("\nMicro-ondas -> " +
                "\nMarca: " + m.marca +
                "\nModelo: " + m.modelo +
                "\nLigado: " + m.ligado +
                "\nPotência: " + m.getPotencia());
    }
}
