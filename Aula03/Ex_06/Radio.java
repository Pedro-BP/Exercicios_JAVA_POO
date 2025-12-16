package Aula03_Ex_06;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Radio implements DispositivoEletronico {

    private double estacao;
    private boolean tocando;

    public Radio(double estacao, boolean tocando) {
        this.estacao = estacao;
        this.tocando = tocando;
    }

    public double getEstacao() {
        return estacao;
    }

    public void setEstacao(double estacao) {
        this.estacao = estacao;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public String ligar() {
        if (!tocando) {
            tocando = true;
            return "Sintonizando o rádio...";
        } else {
            return "O rádio já está tocando.";
        }
    }

    @Override
    public String desligar() {
        if (tocando) {
            tocando = false;
            return "Desligando o rádio... ";
        } else {
            return "O rádio já está desligado.";
        }
    }

    @Override
    public String obterStatus() {
        return "Rádio - " +
               "\nEstação: " + estacao +
               "\nO rádio está tocando? " + (tocando ? "sim" : "não");
    }
}
