
package Aula04_Ex_04;

/**
 * 
 * @author PEDROBORGESPOSPICHIL
 */
public class Televisao extends Eletrodomestico{
    
    private String canal;
    private int volume;

    public Televisao(String marca, String modelo, boolean ligado, String canal, int volume) {
        super(marca, modelo, ligado);
        this.canal = canal;
        this.volume = volume;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
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
