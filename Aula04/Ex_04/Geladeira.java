
package Aula04_Ex_04;

/**
 * 
 * @author PEDROBORGESPOSPICHIL
 */
public class Geladeira extends Eletrodomestico{
    
    private double temperatura;

    public Geladeira(String marca, String modelo, boolean ligado, double temperatura) {
        super(marca, modelo, ligado);
        this.temperatura = temperatura;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
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

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}
