package Aula03_Ex_09;

/**
 * 9. Contas de Usuário: Crie uma interface ContaUsuario com os métodos 
 *    acessarSistema() e realizarOperacao(). Implemente essa interface em 
 *    classes como Administrador e UsuarioComum, restringindo o acesso a 
 *    realizarOperacao() apenas para administradores.
 * 
 * @author PEDROBORGESPOSPICHIL
 */
public class Main {
    public static void main(String[] args) {
        
        ContaUsuario admin = new Administrador("Carlos");
        ContaUsuario usuario = new UsuarioComum("João");

        admin.acessarSistema();
        admin.realizarOperacao();

        System.out.println();

        usuario.acessarSistema();
        usuario.realizarOperacao();
    }
}
