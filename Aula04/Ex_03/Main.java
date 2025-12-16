package Aula04_Ex_03;

/**
 * 3. Funcionários: Crie uma classe Funcionario com os atributos nome, salario 
 * e cargo. Crie subclasses Gerente, Vendedor e Desenvolvedor que herdam de
 * Funcionario e adicionam seus próprios atributos específicos (departamento
 * para Gerente, comissão para Vendedor, linguagem de programação para
 * Desenvolvedor).
 * 
 * @author PEDROBORGESPOSPICHIL
 */
public class Main {
   
    public static void main(String[] args) {
        
        Gerente g = new Gerente("Marcos",9800,"Gerente de Redes","T.I.");
        Vendedor v = new Vendedor("Luis",5500,"Vendedor",2000);
        Desenvolvedor d = new Desenvolvedor("Ryan",10000,"Back End","Java");
        
                System.out.println("Gerente - "
                +        "\nNome: "+g.nome
                +        "\nSalário: "+g.salario
                +        "\nCargo: "+g.cargo
                +        "\nDepartamento: "+g.getDepartamento());
        
        System.out.println("\nVendedor - "
                +        "\nNome: "+v.nome
                +        "\nSalário: "+v.salario
                +        "\nCargo: "+v.cargo
                +        "\nComissão: "+v.getComissao());
        
        System.out.println("\nDesenvolvedor - "
                +        "\nNome: "+d.nome
                +        "\nSalário: "+d.salario
                +        "\nCargo: "+d.cargo
                +        "\nLinguagem de Programação: "+d.getLinguagemDeProgramacao());  
    }
}
