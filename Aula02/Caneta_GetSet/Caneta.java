package Aula02.Caneta_GetSet;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Caneta {

    String modelo, cor;
    double ponta;
    boolean tampada;

    public Caneta(String m, String c, double p) {
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.setTampada(true);
    }

    public void status() { // status = estado atual.
        System.out.println(" # INFORMAÇÕES SOBRE A CANETA #");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.getCor());
        System.out.println("A caneta está tampada? " + this.getTampada());
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public double getPonta() {
        return ponta;
    }

    public void setPonta(double p) {
        this.ponta = p;
    }

    public boolean getTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
}
