package Aula03_Ex_09;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
class UsuarioComum implements ContaUsuario {

    private String nome;

    public UsuarioComum(String nome) {
        this.nome = nome;
    }

    @Override
    public void acessarSistema() {
        System.out.println("Usuário comum " + nome + " acessou o sistema.");
    }

    @Override
    public void realizarOperacao() {
        System.out.println("Acesso negado! Somente administradores podem realizar operações.");
    }
}
