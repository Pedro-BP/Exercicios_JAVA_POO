package Aula03_Ex_06;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Televisao implements DispositivoEletronico {
    
    private String modelo;
    private boolean ligado;

    public Televisao(String modelo, boolean ligado) {
        this.modelo = modelo;
        this.ligado = ligado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    @Override
    public String ligar() {
        if (!ligado) {
            ligado = true;
            return "Ligando a Tv...";
        } else {
            return "A Tv já está ligada.";
        }
    }

    @Override
    public String desligar() {
        if (ligado) {
            ligado = false;
            return "Desligando a Tv... ";
        } else {
            return "A Tv já está desligada.";
        }
    }

    @Override
    public String obterStatus() {
        return "Televisão - " +
               "\nModelo: " + modelo +
               "\nA Tv está ligada? " + (ligado ? "sim" : "não");
    }
}