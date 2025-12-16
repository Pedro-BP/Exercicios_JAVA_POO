package Aula03_Ex_09;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
class Administrador implements ContaUsuario {

    private String nome;

    public Administrador(String nome) {
        this.nome = nome;
    }

    @Override
    public void acessarSistema() {
        System.out.println("Administrador " + nome + " acessou o sistema.");
    }

    @Override
    public void realizarOperacao() {
        System.out.println("Operação administrativa realizada com sucesso!");
    }
}
