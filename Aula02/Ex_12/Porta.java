package Aula02_Ex_12;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Porta {

    private boolean aberta;
    private String cor;

    public Porta(boolean abertaInicial, String corInicial) {
        this.aberta = abertaInicial;
        this.cor = corInicial;
    }

    public boolean isAberta() {
        return aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void abrir() {
        aberta = true;
        System.out.println("A porta foi aberta.");
    }

    public void fechar() {
        aberta = false;
        System.out.println("A porta foi fechada.");
    }
}
