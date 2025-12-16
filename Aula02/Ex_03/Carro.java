package Aula02_Ex_03;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private boolean ligado;
    
    public Carro(String marca,String modelo,int ano,boolean ligado) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = ligado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    void ligar() {
        if (ligado) {
            System.out.println("O carro ja está ligado.");
        } else {
            ligado = true;
            System.out.println("Ligando o carro...");
        }
    }
    
    void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("Desligando o carro...");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }
}
