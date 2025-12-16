package Aula02_Ex_14;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Casa {

    private int numero;
    private String cor;
    private Pessoa proprietario; // objeto da classe Pessoa

    public Casa(int numero, String cor, Pessoa proprietario) {
        this.numero = numero;
        this.cor = cor;
        this.proprietario = proprietario;
    }

    public int getNumero() {
        return numero;
    }

    public String getCor() {
        return cor;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }
}
