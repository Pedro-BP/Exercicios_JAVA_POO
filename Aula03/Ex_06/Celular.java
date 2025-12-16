package Aula03_Ex_06;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Celular implements DispositivoEletronico {
 
    private String modelo;
    private boolean ligado;

    public Celular(String modelo, boolean ligado) {
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
            return "Celular ligando...";
        } else {
            return "O celular já está ligado.";
        }
    }

    @Override
    public String desligar() {
        if (ligado) {
            ligado = false;
            return "Desligando o celular... ";
        } else {
            return "O celular já está desligado.";
        }
    }

    @Override
    public String obterStatus() {
        return "Celular - " +
               "\nModelo: " + modelo +
               "\nO celular está ligado? " + (ligado ? "sim" : "não");
    }
}